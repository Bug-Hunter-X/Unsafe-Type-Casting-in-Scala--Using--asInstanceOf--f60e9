```scala
sealed trait MyType
case class IntType(value: Int) extends MyType
case class StringType(value: String) extends MyType

class MyClass[T <: MyType](val value: T) {
  def myMethod(other: MyClass[T]): MyType = (value, other.value) match {
    case (IntType(x), IntType(y)) => IntType(x + y)
    case (StringType(x), StringType(y)) => StringType(x + y)
    case _ => throw new IllegalArgumentException("Unsupported type combination")
  }
}

object Main extends App {
  val obj1 = new MyClass[IntType](IntType(5))
  val obj2 = new MyClass[IntType](IntType(10))
  println(obj1.myMethod(obj2)) // Output: IntType(15)

  val obj3 = new MyClass[StringType](StringType("hello"))
  val obj4 = new MyClass[StringType](StringType("world"))
  println(obj3.myMethod(obj4)) // Output: StringType(helloworld)
}
```
```scala
class MyClass[T](val value: T) {
  def myMethod(other: MyClass[T]): T = {
    value match {
      case x: Int => x + other.value.asInstanceOf[Int]
      case _ => throw new IllegalArgumentException("Unsupported type")
    }
  }
}

object Main extends App {
  val obj1 = new MyClass[Int](5)
  val obj2 = new MyClass[Int](10)
  println(obj1.myMethod(obj2)) // Works fine

  val obj3 = new MyClass[String]("hello")
  val obj4 = new MyClass[String]("world")
  println(obj3.myMethod(obj4)) // Throws IllegalArgumentException
}
```
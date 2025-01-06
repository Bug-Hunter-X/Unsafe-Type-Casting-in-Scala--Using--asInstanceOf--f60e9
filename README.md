# Unsafe Type Casting in Scala: A Common Pitfall

This repository showcases a common error in Scala: using `asInstanceOf` for type checking and casting. While it might appear functional for certain types, it can lead to runtime exceptions when dealing with different types.  The example uses a simple class and method to illustrate the problem and then demonstrates a safer, more robust approach.

## Problem

The `Bug.scala` file contains code where `asInstanceOf` is used within a `match` expression. This approach is error-prone because it lacks compile-time type safety. While it works for `Int` types, it throws an exception when used with `String` types.

## Solution

The `Solution.scala` file presents a revised version using sealed traits and pattern matching. This method provides compile-time type safety, making the code more robust and less prone to runtime errors. It also uses a better way of handling type variations.
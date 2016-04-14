package com.example

import scalaz._

sealed trait Foo

object Hello {
  def main(args: Array[String]): Unit = {
    // 中身はキャストしているだけ、値は同じままで型が変わる
    println(Tag[String, Foo]("Hello, Scalaz"))
    println("Hello, world!")
  }
}

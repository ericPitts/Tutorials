package com.basicExercises.hello

/**
  * Created by ezcorp on 12/15/2016.
  */
object Input extends App {

  println("Enter the first number ---")
  val a: Int = scala.io.StdIn.readInt()
  println("Enter the second number ---")
  val b: Int = scala.io.StdIn.readInt()
  println("a multiplied by b equals --- " + a * b )

}
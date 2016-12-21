package com.basicExercises.hello
import scala.math._
/**
  * Created by ezcorp on 12/15/2016.
  */
object  VariousOps extends App {


  println("Enter the first number ---")
  val a: Int = scala.io.StdIn.readInt()
  println("Enter the second number ---")
  val b: Int = scala.io.StdIn.readInt()

  def add(n: Int, m: Int): Int ={
    n + m
  }
  def add(n: Double, m: Double): Double ={
    n + m
  }
  def sub(n: Int, m: Int): Int ={
     n - m
  }
  def sub(n: Double, m: Double): Double ={
    n - m
  }
  def mul(n: Int, m: Int): Int ={
    n * m
  }
  def mul(n: Double, m: Double): Double ={
    n * m
  }
  def div(n: Int, m: Int): Int ={
    n / m
  }
  def div(n: Double, m: Double): Double ={
    n / m
  }
  def mod(n: Int, m: Int): Int ={
    n % m
  }
  def mod(n: Double, m: Double): Double ={
    n % m
  }
  // perimeter of a circle
  def perimeter(r: Double): Double ={
    2*Pi * r
  }
  // area of a circle
  def area(r: Double): Double ={
    Pi * pow(r,2)
  }

  println(" The first number added to the second number equals --- " +
    add(a,b))
  println(" The second number subtracted from the first number equals --- " +
    sub(a,b))
  println(" The first number multiplied by the second number equals --- " +
    mul(a,b))
  println(" The first number divided by the second number equals --- " +
    div(a,b))
  println(" The first number modulo second number equals --- " +
    mod(a,b))

}

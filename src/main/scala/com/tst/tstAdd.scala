package com.tst

/**
  * Created by ezcorp on 12/16/2016.
  */
object tstAdd extends App{

  def add(n: Int, m: Int): Int ={
    n + m
  }
  def sub(n: Int, m: Int): Int ={
    n - m
  }
  def mul(n: Int, m: Int): Int ={
    n * m
  }
  def div(n: Int, m: Int): Int ={
    require(m != 0)
    n / m
  }
  def mod(n: Int, m: Int): Int ={
    n % m
  }
}

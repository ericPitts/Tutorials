package com.programmingInScala.rational

/**
  * Created by ezcorp on 12/13/2016.
  */
class Rational ( n: Int, d: Int ){

  require(d != 0 ,"not a valid Rational")

  def this(n: Int) = this(n, 1) // auxiliary constructor
  // Constants
  private val g = gcd(n.abs,d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  override def toString: String = numer + "/" + denom

  // Methods
  def + (that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )
  // overloaded method
  def + (i: Int): Rational =
    new Rational(numer + i * denom, denom)

  def - (that: Rational): Rational =
    new Rational(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )
  def - (i: Int): Rational =
    new Rational(numer - i * denom, denom)

  def * (that: Rational): Rational =
    new Rational(
      numer * that.numer, denom * that.denom
    )

  def * (i: Int): Rational =
    new Rational(numer * i, denom)

  def / (that: Rational): Rational =
    new Rational(numer * that.denom, denom * that.numer)

  def / (i: Int): Rational =
    new Rational(numer, denom * i)

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

}



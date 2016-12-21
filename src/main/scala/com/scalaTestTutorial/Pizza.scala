package com.scalaTestTutorial


/**
  * Created by ezcorp on 12/20/2016.
  */
import scala.collection.mutable.ArrayBuffer

case class Topping(name: String)

class Pizza {

  private var toppings = new ArrayBuffer[Topping]

  def addTopping (t: Topping) { toppings += t}
  def removeTopping (t: Topping) { toppings -= t}
  def getToppings = toppings.toList

}

package com.aScalaTutorialforJavaProgrammers

/**
  * Created by ezcorp on 12/17/2016.
  */
import java.text.DateFormat._
import java.util.{Date, Locale}
object FrenchDate {
  def main(args: Array[String]) {
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)
    println(df format now)
  }
}


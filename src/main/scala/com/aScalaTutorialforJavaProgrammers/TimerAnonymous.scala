package com.aScalaTutorialforJavaProgrammers

/**
  * Created by ezcorp on 12/17/2016.
  */
object TimerAnonymous {

  def oncePerSecond(callback: () => Unit) {
    while (true) { callback(); Thread sleep 1000 }
  }
  def main(args: Array[String]) {
    oncePerSecond(() =>
      println("time flies like an arrow..."))
  }

}

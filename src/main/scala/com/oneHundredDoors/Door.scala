package com.oneHundredDoors


import com.sun.org.apache.xml.internal.resolver.helpers.Debug


import scala.collection.mutable



/**
  * Created by ezcorp on 12/16/2016.
  *
  * There are 100 doors in a row that are all initially closed.
 **
  * You make 100 passes by the doors.
 **
  * The first time through, visit every door and   toggle   the door   (if the door is closed,   open it;   if it is open,   close it).
 **
  * The second time, only visit every 2nd door   (door #2, #4, #6, ...),   and toggle it.
 **
  * The third time, visit every 3rd door   (door #3, #6, #9, ...), etc,   until you only visit the 100th door.
 **
 *
  * Task
*Answer the question:   what state are the doors in after the last pass?   Which are open, which are closed?
  */
class Door(toggle: Int) extends Debug{
  var B = mutable.Map()

  val Open: Boolean = true

  val Closed: Boolean = false

  def doorOpen(toggle: Int): Boolean = {
    if (toggle > 0)
      state == Open
    else
      state == Closed
  }

  def doorClosed(toggle: Int): Boolean = {
    if (toggle <  1)
      state == Closed
    else
      state == Open
  }
  def swing: Boolean = {
    state == doorOpen(toggle)
    state == doorClosed(toggle)
  }
  var state: Boolean = swing
  override def toString: String = "Door " + state
/*
  trait Debug{
    def debugVars():Unit = {
      var i = 0
      val vars = this.getClass.getDeclaredFields

      for(v <- vars){
        v.setAccessible(true)
        println("Field: " + vars(i).getName + " => " + vars(i).get(this))
        i+=1
      }
    }
  }
*/
}


object DoorMan extends App {

  import scala.collection.mutable

  val aR = Range.apply(0, 100, 2)
  val bR = Range.apply(1, 101, 2)
 // val M: Map[Int, Door]
  var ids = new mutable.ListBuffer[Int]
  var idd = new mutable.ListBuffer[Door]


  def build(i: Int, d: Door): Unit = {
    ids += i
    idd += d
  }

  for (i <- bR) {
    val a: Door = new Door(1)
    build( i, a )
  }
  for (i <- aR) {
    val a: Door = new Door(0)
    build( i, a )
  }
  val aList = idd.toList
  println(aList)
}







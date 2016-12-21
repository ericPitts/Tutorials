import com.oneHundredDoors.Door

import scala.collection.mutable.ListBuffer

val ids = new ListBuffer[Door]
for(i <- 1 to 10)
  ids += new Door(1)


val a = ids.toList

val ab = a(9)



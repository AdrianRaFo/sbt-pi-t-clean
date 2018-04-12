package πtclean

import sbt._

object Tasks {
   lazy val linuxCompact = Def.task { println("Linux Compact!") }
   lazy val cleanT = Def.task { println("Clean T!") }
}

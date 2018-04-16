package pitclean

import sbt.Keys.baseDirectory
import sbt._

object PiTClean extends AutoPlugin {
  override def trigger = allRequirements

  object autoImport {
    lazy val cleanTarget = taskKey[Unit]("Delete recursively all the target folders")
  }

  import autoImport._

  override lazy val projectSettings = Seq(
    cleanTarget := Tasks.cleanTarget(baseDirectory.value)
  )
}

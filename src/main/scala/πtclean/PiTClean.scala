package πtclean

import sbt._

object PiTClean extends AutoPlugin {
  override def trigger = allRequirements

  object autoImport{
    lazy val cleanT= taskKey[Unit]("Delete recursively all the target folders")
    cleanT := Tasks.cleanT

    lazy val linuxCompact = taskKey[Unit]("Change the ivy in order to make it compatible with linux from mac")
    linuxCompact := Tasks.linuxCompact
  }

}

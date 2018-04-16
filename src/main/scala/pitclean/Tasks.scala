package pitclean

import sbt._

object Tasks {
  def cleanTarget(baseDirectory :File) : Unit = {
    def deleteTargetInner(fileList: Array[File]): Unit = {
      fileList.foreach(file => {
        if (file.isDirectory) deleteTargetInner(file.listFiles())
        println(file.name + " deleted")
        file.delete()
      })
    }
    def deleteTarget(file: File): Unit = {
      if (file.isDirectory && file.name == "target") {
        println(file.name + " deleted")
        deleteTargetInner(file.listFiles())
        file.delete()
      } else if (file.isDirectory) {
        file.listFiles.foreach(deleteTarget)
      }
    }
    deleteTarget(baseDirectory)
  }
}

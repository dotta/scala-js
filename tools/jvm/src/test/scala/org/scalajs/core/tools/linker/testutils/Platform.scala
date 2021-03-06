package org.scalajs.core.tools.linker.testutils

import java.io.File

import org.scalajs.core.tools.io._

object Platform {
  def loadJar(path: String): ScalaJSIRContainer =
    new FileVirtualBinaryFile(new File(path)) with VirtualJarFile
}

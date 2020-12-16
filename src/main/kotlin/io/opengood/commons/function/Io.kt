package io.opengood.commons.function

import java.io.ByteArrayOutputStream
import java.io.PrintStream

fun captureOutput(func: () -> Unit): String {
    val stdOut = System.out
    val outputStream = ByteArrayOutputStream()
    val printStream = PrintStream(outputStream)

    System.setOut(printStream)
    func.invoke()
    System.out.flush()
    System.setOut(stdOut)

    return outputStream.toString()
}

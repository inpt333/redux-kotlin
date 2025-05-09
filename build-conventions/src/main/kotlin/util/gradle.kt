package util

import java.nio.charset.Charset

object Git {
    val headCommitHash by lazy { execAndCapture(arrayOf("git", "rev-parse --verify HEAD")) }
}

fun execAndCapture(cmd: Array<String>): String? {
    val child = Runtime.getRuntime().exec(cmd)
    child.waitFor()
    return if (child.exitValue() == 0) {
        child.inputStream.readAllBytes().toString(Charset.defaultCharset()).trim()
    } else {
        null
    }
}

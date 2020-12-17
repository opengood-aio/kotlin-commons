package io.opengood.commons.extension.property

val String.Companion.carriageReturn: String
    get() = "\r"

val String.Companion.carriageReturnLineFeed: String
    get() = "\n\r"

val String.Companion.comma: String
    get() = ","

val String.Companion.empty: String
    get() = ""

val String.Companion.equalsSign: String
    get() = "="

val String.Companion.newLine: String
    get() = "\n"

val String.Companion.pipe: String
    get() = "|"

val String.Companion.tab: String
    get() = "\t"

val String.Companion.whitespace: String
    get() = " "
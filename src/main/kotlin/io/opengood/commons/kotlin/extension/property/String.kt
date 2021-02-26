package io.opengood.commons.kotlin.extension.property

val String.Companion.carriageReturn: String
    get() = "\r"

val String.Companion.comma: String
    get() = ","

val String.Companion.crlf: String
    get() = "\n\r"

val String.Companion.empty: String
    get() = ""

val String.Companion.equalsSign: String
    get() = "="

val String.Companion.greaterThanSign: String
    get() = ">"

val String.Companion.lessThanSign: String
    get() = "<"

val String.Companion.newline: String
    get() = "\n"

val String.Companion.pipe: String
    get() = "|"

val String.Companion.tab: String
    get() = "\t"

val String.Companion.whitespace: String
    get() = " "

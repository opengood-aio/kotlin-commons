package io.opengood.commons.extension.method

import io.opengood.commons.infix.then

fun String.equalsIgnoreCase(value: String): Boolean =
    isNotBlank() then { equals(value, ignoreCase = true) } ?: false

fun String.isBoolean(): Boolean =
    isNotBlank() then { listOf("true", "false", "1", "0").any { it.equalsIgnoreCase(this) } } ?: false

fun String.isInt(): Boolean =
    isNotBlank() then { all { Character.isDigit(it) } } ?: false
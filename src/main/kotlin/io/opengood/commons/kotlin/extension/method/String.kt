package io.opengood.commons.kotlin.extension.method

import io.opengood.commons.kotlin.extension.property.whitespace
import io.opengood.commons.kotlin.infix.then

fun String.capitalizeWords(): String =
    split(String.whitespace).joinToString(String.whitespace) { it.capitalize() }

fun String.containsIgnoreCase(substr: String): Boolean =
    isNotBlank() then { contains(substr, ignoreCase = true) } ?: false

fun String.equalsIgnoreCase(value: String): Boolean =
    isNotBlank() then { equals(value, ignoreCase = true) } ?: false

fun String.isBoolean(): Boolean =
    isNotBlank() then { listOf("true", "false", "1", "0").any { it.equalsIgnoreCase(this) } } ?: false

fun String.isInt(): Boolean =
    isNotBlank() then { all { Character.isDigit(it) } } ?: false

fun String.toIntOrZero(): Int =
    toIntOrNull() ?: 0

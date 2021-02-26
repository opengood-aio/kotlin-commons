package io.opengood.commons.kotlin.extension.method

fun List<String>.containsIgnoreCase(element: String): Boolean =
    any { it.contains(element, ignoreCase = true) }

package io.opengood.commons.kotlin.extension.method

fun List<String>.containsIgnoreCase(item: String): Boolean =
    any { it.contains(item, ignoreCase = true) }

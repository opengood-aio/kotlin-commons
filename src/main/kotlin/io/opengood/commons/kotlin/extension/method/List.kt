package io.opengood.commons.kotlin.extension.method

fun List<String>.containsIgnoreCase(element: String) =
    this.any { it.contains(element, ignoreCase = true) }
∑
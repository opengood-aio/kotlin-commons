package io.opengood.commons.kotlin.extension.method

fun List<String>.containsIgnoreCase(element: String): Boolean =
    any { it.contains(element, ignoreCase = true) }

fun <K : Any, V : Any> List<Map<K, V>>.sortAscending(key: K): List<Map<K, V>> =
    sortedBy { it[key] as String }

fun <K : Any, V : Any> List<Map<K, V>>.sortDescending(key: K): List<Map<K, V>> =
    sortedByDescending { it[key] as String }

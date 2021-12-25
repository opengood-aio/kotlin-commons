package io.opengood.commons.kotlin.extension.method

import io.opengood.commons.kotlin.infix.then

fun <K : Any, V : Any> Map<K, List<V>>.containsMultipleListItems(key: K): Boolean =
    (containsKey(key) then { this[key]!!.size > 1 }) ?: false

fun <K : Any, V : Any> Map<K, V>.keyByIndex(i: Int): K =
    keys.toList()[i]

fun <K : Any, V : Any> Map<K, V>.notContainsKey(key: K): Boolean =
    !containsKey(key)

fun <K : Any, V : Any> Map<K, V>.notContainsValue(value: V): Boolean =
    !containsValue(value)

fun <K : Any, V : Any> MutableMap<K, V>.putIfNotAbsent(entry: Map.Entry<K, V>?) =
    entry?.let { putIfAbsent(it.key, it.value) }

fun <K : Any, V : Any> Map<K, V>.valueByIndex(i: Int): V =
    values.toList()[i]

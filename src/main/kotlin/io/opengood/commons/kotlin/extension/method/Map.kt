package io.opengood.commons.kotlin.extension.method

import io.opengood.commons.kotlin.infix.then

fun <T : Any, V : Any> Map<T, List<V>>.containsMultipleListItems(key: T): Boolean =
    containsKey(key) then { this[key]!!.size > 1 } ?: false

fun <T : Any, V: Any> Map<T, V>.notContainsKey(key: T): Boolean =
    !containsKey(key)

fun <T : Any, V: Any> Map<T, V>.notContainsValue(value: V): Boolean =
    !containsValue(value)
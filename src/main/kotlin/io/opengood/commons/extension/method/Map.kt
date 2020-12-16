package io.opengood.commons.extension.method

import io.opengood.commons.infix.then

fun <T : Any, V : Any> Map<T, List<V>>.hasMultipleListItems(key: T): Boolean =
    this.containsKey(key) then { this[key]!!.size > 1 } ?: false
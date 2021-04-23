package io.opengood.commons.kotlin.extension.method

import io.opengood.commons.kotlin.infix.then

fun <T : Any> Array<T>.printAll() =
    isNotEmpty() then { forEachIndexed { i: Int, item: T -> println("Item #$i: $item") } }

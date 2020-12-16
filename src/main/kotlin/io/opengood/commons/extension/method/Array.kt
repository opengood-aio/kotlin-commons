package io.opengood.commons.extension.method

import io.opengood.commons.infix.then

fun <T> Array<T>.printAll() =
    isNotEmpty() then { forEachIndexed { i: Int, it: T -> println("Item #$i: ${it.toString()}") } }
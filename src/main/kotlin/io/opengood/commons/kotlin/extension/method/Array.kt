package io.opengood.commons.kotlin.extension.method

import io.opengood.commons.kotlin.infix.then

fun <T> Array<T>.printAll() =
    isNotEmpty() then { forEachIndexed { i: Int, it: T -> println("Item #$i: ${it.toString()}") } }
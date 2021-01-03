package io.opengood.commons.kotlin.infix

infix fun Int.isDivFactorOf(value: Int): Boolean =
    this % value == 0
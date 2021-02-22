package io.opengood.commons.kotlin.infix

infix fun <T : Any> T?.firstOrDefault(default: T): T =
    (this != null) then { this } ?: default

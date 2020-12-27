package io.opengood.commons.kotlin.infix

infix fun <T> Boolean.then(param: () -> T): T? =
    if (this) param() else null

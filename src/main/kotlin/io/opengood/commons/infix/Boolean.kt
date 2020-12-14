package io.opengood.commons.infix

infix fun <T> Boolean.then(param: () -> T): T? =
    if (this) param() else null
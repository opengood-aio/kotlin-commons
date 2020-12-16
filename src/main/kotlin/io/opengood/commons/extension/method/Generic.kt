package io.opengood.commons.extension.method

fun <T : Any> T.accessField(fieldName: String): Any? =
    javaClass.getDeclaredField(fieldName).let { field ->
        field.isAccessible = true
        return@let field.get(this)
    }
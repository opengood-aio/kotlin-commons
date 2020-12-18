package io.opengood.commons.kotlin.extension.method

fun <T : Any> T.accessField(fieldName: String): Any? =
    javaClass.getDeclaredField(fieldName).let { field ->
        field.isAccessible = true
        return@let field.get(this)
    }
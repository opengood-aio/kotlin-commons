package io.opengood.commons.kotlin.function

fun <K : Any, V : Any> makeEntry(key: K, value: V) = object : Map.Entry<K, V> {
    override val key: K = key
    override val value: V = value
}

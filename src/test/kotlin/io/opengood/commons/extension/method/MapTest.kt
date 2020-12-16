package io.opengood.commons.extension.method

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue

class MapTest : FunSpec({

    test("map hasMultipleListItems extension method returns true when more than one item exists in values list for key") {
        val map = mapOf("foo" to listOf("bar", "baz"))

        map.hasMultipleListItems("foo").shouldBeTrue()
    }

    test("map hasMultipleListItems extension method returns false when one item exists in values list for key") {
        val map = mapOf("foo" to listOf("bar"))

        map.hasMultipleListItems("foo").shouldBeFalse()
    }

    test("map hasMultipleListItems extension method returns false when no items exist in values list for key") {
        val map = mapOf("foo" to emptyList<String>())

        map.hasMultipleListItems("foo").shouldBeFalse()
    }

    test("map hasMultipleListItems extension method returns false when key does not exist") {
        val map = emptyMap<String, List<String>>()

        map.hasMultipleListItems("foo").shouldBeFalse()
    }
})
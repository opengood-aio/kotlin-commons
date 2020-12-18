package io.opengood.commons.kotlin.extension.method

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue

class MapTest : FunSpec({

    test("map containsMultipleListItems extension method returns true when more than one item exists in values list for key") {
        val map = mapOf("foo" to listOf("bar", "baz"))

        map.containsMultipleListItems("foo").shouldBeTrue()
    }

    test("map containsMultipleListItems extension method returns false when one item exists in values list for key") {
        val map = mapOf("foo" to listOf("bar"))

        map.containsMultipleListItems("foo").shouldBeFalse()
    }

    test("map containsMultipleListItems extension method returns false when no items exist in values list for key") {
        val map = mapOf("foo" to emptyList<String>())

        map.containsMultipleListItems("foo").shouldBeFalse()
    }

    test("map containsMultipleListItems extension method returns false when key does not exist") {
        val map = emptyMap<String, List<String>>()

        map.containsMultipleListItems("foo").shouldBeFalse()
    }

    test("map notContainsKey extension method returns true when key does not exist") {
        val map = emptyMap<String, String>()

        map.notContainsKey("foo").shouldBeTrue()
    }

    test("map notContainsKey extension method returns false when key exists") {
        val map = mapOf("foo" to "bar")

        map.notContainsKey("foo").shouldBeFalse()
    }

    test("map notContainsValue extension method returns true when value does not exist") {
        val map = emptyMap<String, String>()

        map.notContainsValue("foo").shouldBeTrue()
    }

    test("map notContainsValue extension method returns false when value exists") {
        val map = mapOf("foo" to "bar")

        map.notContainsValue("bar").shouldBeFalse()
    }
})
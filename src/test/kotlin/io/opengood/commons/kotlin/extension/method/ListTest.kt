package io.opengood.commons.kotlin.extension.method

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue

class ListTest : FunSpec({

    test("list containsIgnoreCase extension method returns true when case insensitive string contained in list") {
        val list = listOf("foo", "bar")

        list.containsIgnoreCase("foo").shouldBeTrue()
    }

    test("list containsIgnoreCase extension method returns true when case sensitive string contained in list") {
        val list = listOf("foo", "bar")

        list.containsIgnoreCase("Foo").shouldBeTrue()
    }

    test("list containsIgnoreCase extension method returns false when string not contained in list") {
        val list = listOf("bar")

        list.containsIgnoreCase("foo").shouldBeFalse()
    }
})

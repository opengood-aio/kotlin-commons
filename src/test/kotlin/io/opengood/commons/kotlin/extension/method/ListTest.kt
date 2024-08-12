package io.opengood.commons.kotlin.extension.method

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.shouldBe

class ListTest :
    FunSpec({

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

        test("list sortAscending extension method sorts list of maps keys in ascending order") {
            val list =
                listOf(
                    mapOf(
                        "foo" to "bar",
                        "baz" to "pas",
                    ),
                    mapOf(
                        "foo" to "par",
                        "baz" to "taz",
                    ),
                )

            val result = list.sortAscending("baz")

            result shouldBe
                listOf(
                    mapOf(
                        "baz" to "pas",
                        "foo" to "bar",
                    ),
                    mapOf(
                        "baz" to "taz",
                        "foo" to "par",
                    ),
                )
        }

        test("list sortDescending extension method sorts list of maps keys in descending order") {
            val list =
                listOf(
                    mapOf(
                        "baz" to "pas",
                        "foo" to "bar",
                    ),
                    mapOf(
                        "baz" to "taz",
                        "foo" to "par",
                    ),
                )

            val result = list.sortDescending("baz")

            result shouldBe
                listOf(
                    mapOf(
                        "foo" to "par",
                        "baz" to "taz",
                    ),
                    mapOf(
                        "foo" to "bar",
                        "baz" to "pas",
                    ),
                )
        }
    })

package io.opengood.commons.kotlin.extension.method

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.nulls.shouldBeNull
import io.kotest.matchers.shouldBe

class GenericTest : FunSpec({

    test("generic accessField extension method returns value when field set") {
        val greeting = Greeting(message = "Hello World!")

        val value = greeting.accessField("message")

        value shouldBe "Hello World!"
    }

    test("generic accessField extension method returns null value when field not set") {
        val greeting = Greeting()

        val value = greeting.accessField("message")

        value.shouldBeNull()
    }
})

data class Greeting(val message: String? = null)

package io.opengood.commons.kotlin.extension.method

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class PairTest :
    FunSpec({

        test("pair of generic types toEntry extension method returns map entry object") {
            val result = Pair("foo", "bar").toEntry()

            result.key shouldBe "foo"
            result.value shouldBe "bar"
        }
    })

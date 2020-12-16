package io.opengood.commons.function

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class IoTest : FunSpec({

    test("captureOutput function collects standard output and returns it") {
        val output = captureOutput {
            print("foo")
        }

        output shouldBe "foo"
    }
})
package io.opengood.commons.kotlin.function

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class IoTest : FunSpec({

    test("captureStdOut function collects standard output and returns it") {
        val output = captureStdOut {
            print("foo")
        }

        output shouldBe "foo"
    }
})
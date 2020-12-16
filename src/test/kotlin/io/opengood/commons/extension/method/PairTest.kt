package io.opengood.commons.extension.method

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldBeEmpty
import io.opengood.commons.function.captureOutput

class PairTest : FunSpec ({

    test("array of generic type printAll extension method prints all items to standard output") {
        val expected = """
            |Item #0: foo
            |Item #1: bar
            |
        """.trimMargin()

        val output = captureOutput {
            arrayOf("foo", "bar").printAll()
        }

       output shouldBe expected
    }

    test("array of generic type printAll extension method does not print all items to standard output when none exist") {
        val output = captureOutput {
            emptyArray<String>().printAll()
        }

        output.shouldBeEmpty()
    }
})
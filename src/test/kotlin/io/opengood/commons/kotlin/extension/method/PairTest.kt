package io.opengood.commons.kotlin.extension.method

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldBeEmpty
import io.opengood.commons.kotlin.function.captureStdOut

class PairTest : FunSpec ({

    test("array of generic type printAll extension method prints all items to standard output") {
        val expected = """
            |Item #0: foo
            |Item #1: bar
            |
        """.trimMargin()

        val output = captureStdOut {
            arrayOf("foo", "bar").printAll()
        }

       output shouldBe expected
    }

    test("array of generic type printAll extension method does not print all items to standard output when none exist") {
        val output = captureStdOut {
            emptyArray<String>().printAll()
        }

        output.shouldBeEmpty()
    }
})
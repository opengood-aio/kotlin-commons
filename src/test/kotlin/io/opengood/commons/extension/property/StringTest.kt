package io.opengood.commons.extension.property

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldBeEmpty

class StringTest : FunSpec({

    test("string empty extension property returns empty string") {
        String.empty.shouldBeEmpty()
    }

    test("string equalsSign extension property returns equals sign string") {
        String.equalsSign shouldBe "="
    }

    test("string newLine extension property returns newline string") {
        String.newLine shouldBe "\n"
    }

    test("string whitespace extension property returns whitespace string") {
        String.whitespace shouldBe " "
    }
})
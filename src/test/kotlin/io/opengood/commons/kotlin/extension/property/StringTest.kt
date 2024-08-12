package io.opengood.commons.kotlin.extension.property

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldBeEmpty

class StringTest :
    FunSpec({

        test("string carriageReturn extension property returns carriage return string") {
            String.carriageReturn shouldBe "\r"
        }

        test("string comma extension property returns carriage comma string") {
            String.comma shouldBe ","
        }

        test("string crlf extension property returns carriage return and line feed string") {
            String.crlf shouldBe "\n\r"
        }

        test("string empty extension property returns empty string") {
            String.empty.shouldBeEmpty()
        }

        test("string equalsSign extension property returns equals sign string") {
            String.equalsSign shouldBe "="
        }

        test("string greaterThanSign extension property returns greater than sign string") {
            String.greaterThanSign shouldBe ">"
        }

        test("string lessThanSign extension property returns less than sign string") {
            String.lessThanSign shouldBe "<"
        }

        test("string newline extension property returns newline string") {
            String.newline shouldBe "\n"
        }

        test("string pipe extension property returns pipe string") {
            String.pipe shouldBe "|"
        }

        test("string tab extension property returns tab string") {
            String.tab shouldBe "\t"
        }

        test("string whitespace extension property returns whitespace string") {
            String.whitespace shouldBe " "
        }
    })

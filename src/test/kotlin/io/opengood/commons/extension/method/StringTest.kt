package io.opengood.commons.extension.method

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue

class StringTest : FunSpec({

    test("string equalsIgnoreCase extension method returns true when case insensitive strings are equal") {
        "Hello World!".equalsIgnoreCase("HELLO WORLD!").shouldBeTrue()
    }

    test("string equalsIgnoreCase extension method returns false when case insensitive strings are not equal") {
        "Hello World".equalsIgnoreCase("HELLO WORLD!").shouldBeFalse()
    }

    test("string isBoolean extension method returns true when string equals true") {
        "true".isBoolean().shouldBeTrue()
    }

    test("string isBoolean extension method returns true when string equals false") {
        "false".isBoolean().shouldBeTrue()
    }

    test("string isBoolean extension method returns true when string equals 1") {
        "1".isBoolean().shouldBeTrue()
    }

    test("string isBoolean extension method returns true when string equals 0") {
        "0".isBoolean().shouldBeTrue()
    }

    test("string isBoolean extension method returns false when string does not match boolean type") {
        "none".isBoolean().shouldBeFalse()
    }

    test("string isBoolean extension method returns false when string contains partial boolean type match") {
        "true12345".isBoolean().shouldBeFalse()
    }

    test("string isInt extension method returns true when string contains only integer characters") {
        "12345".isInt().shouldBeTrue()
    }

    test("string isInt extension method returns false when string contains decimal characters") {
        "12345.00".isInt().shouldBeFalse()
    }

    test("string isInt extension method returns false when string contains alphanumeric characters") {
        "12345hello".isInt().shouldBeFalse()
    }

    test("string isInt extension method returns false when string contains special characters") {
        "12345?<>$%*&@!".isInt().shouldBeFalse()
    }
})
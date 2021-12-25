package io.opengood.commons.kotlin.infix

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue

class BooleanTest : FunSpec({

    test("boolean then infix function returns true when condition evaluates to true") {
        val condition = 1

        val result = ((condition == 1) then { true }) ?: false

        result.shouldBeTrue()
    }

    test("boolean then infix function returns false when condition evaluates to false") {
        val condition = 0

        val result = ((condition == 1) then { true }) ?: false

        result.shouldBeFalse()
    }
})

package io.opengood.commons.kotlin.infix

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue

class IntTest : FunSpec({

    test("integer isDivFactorOf infix function returns true when integer is divisible factor of specified value") {
        (10 isDivFactorOf 5).shouldBeTrue()
    }

    test("integer isDivFactorOf infix function returns false when integer is not divisible factor of specified value") {
        (10 isDivFactorOf 3).shouldBeFalse()
    }
})

package io.opengood.commons.kotlin.extension.method

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import java.math.BigDecimal
import java.math.RoundingMode

class BigDecimalTest : FunSpec({

    test("BigDecimal roundUp extension method returns value rounded to scale") {
        BigDecimal(12.346).roundUp(2) shouldBe BigDecimal(12.35).setScale(2, RoundingMode.HALF_UP)
    }
})

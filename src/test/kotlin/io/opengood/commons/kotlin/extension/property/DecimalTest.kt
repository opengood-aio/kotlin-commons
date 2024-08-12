package io.opengood.commons.kotlin.extension.property

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import java.math.BigDecimal

class DecimalTest :
    FunSpec({

        test("Decimal zero extension property returns BigDecimal zero value") {
            Decimal.zero shouldBe BigDecimal(0)
        }
    })

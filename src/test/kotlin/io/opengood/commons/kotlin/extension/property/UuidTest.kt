package io.opengood.commons.kotlin.extension.property

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import java.util.UUID

class UuidTest : FunSpec({

    test("UUID empty extension property returns empty UUID") {
        Uuid.empty shouldBe UUID(0L, 0L)
    }
})

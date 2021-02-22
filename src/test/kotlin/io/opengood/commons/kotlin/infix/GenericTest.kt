package io.opengood.commons.kotlin.infix

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class GenericTest : FunSpec({

    test("generic firstOrDefault infix function returns first object when first object not null") {
        ("foo" firstOrDefault "bar") shouldBe "foo"
    }

    test("generic firstOrDefault infix function returns default object when first object null") {
        (null firstOrDefault "bar") shouldBe "bar"
    }
})

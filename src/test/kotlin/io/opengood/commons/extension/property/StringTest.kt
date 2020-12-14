package io.opengood.commons.extension.property

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.string.shouldBeEmpty

class StringTest : FunSpec({

    test("string empty extension property returns empty string") {
        String.empty.shouldBeEmpty()
    }
})
package io.opengood.commons.kotlin.extension.method

import java.math.BigDecimal
import java.math.RoundingMode

fun BigDecimal.roundUp(scale: Int): BigDecimal =
    this.setScale(scale, RoundingMode.HALF_UP)

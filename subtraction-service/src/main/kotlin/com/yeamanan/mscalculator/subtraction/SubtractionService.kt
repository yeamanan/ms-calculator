package com.yeamanan.mscalculator.subtraction

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.springframework.stereotype.Service

@Service
open class SubtractionService {

    @HystrixCommand(fallbackMethod = "defaultResult")
    open fun subtraction(x: Double, y: Double): Double {
        return x - y
    }

    fun defaultResult(x: Double, y: Double): Double {
        return 0.0
    }

}

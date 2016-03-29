package com.yeamanan.mscalculator.multiplication

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.springframework.stereotype.Service

@Service
open class MultiplicationService {

    @HystrixCommand(fallbackMethod = "defaultResult")
    open fun multiplication(x: Double, y: Double): Double {
        return x * y
    }

    fun defaultResult(x: Double, y: Double): Double {
        return 0.0
    }

}

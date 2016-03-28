package com.yeamanan.mscalculator.calculator

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.springframework.stereotype.Service

@Service
open class CalculatorService {

    @HystrixCommand(fallbackMethod = "defaultResult")
    open fun calculate(operation: String): Int {
        return operation.length
    }

    fun defaultResult(operation: String): Int {
        return 0
    }

}

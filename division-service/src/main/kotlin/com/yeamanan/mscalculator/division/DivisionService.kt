package com.yeamanan.mscalculator.division

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.springframework.stereotype.Service

@Service
open class DivisionService {

    @HystrixCommand(fallbackMethod = "defaultResult")
    open fun division(x: Double, y: Double): Double {
        return x / y
    }

    fun defaultResult(x: Double, y: Double): Double {
        return 0.0
    }

}

package com.yeamanan.mscalculator.addition

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.springframework.stereotype.Service

@Service
open class AdditionService {

    @HystrixCommand(fallbackMethod = "defaultResult")
    open fun addition(x: Double, y: Double): Double {
        return x + y
    }

    fun defaultResult(x: Double, y: Double): Double {
        return 0.0
    }

}

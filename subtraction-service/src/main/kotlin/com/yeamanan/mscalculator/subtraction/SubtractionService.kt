package com.yeamanan.mscalculator.subtraction

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.springframework.stereotype.Service

@Service
open class SubtractionService {

    @HystrixCommand(fallbackMethod = "defaultResult")
    open fun subtraction(x: Int, y: Int): Int {
        return x - y
    }

    fun defaultResult(x: Int, y: Int): Int {
        return 0
    }

}

package com.yeamanan.mscalculator.multiplication

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.springframework.stereotype.Service

@Service
open class MultiplicationService {

    @HystrixCommand(fallbackMethod = "defaultResult")
    open fun multiplication(x: Int, y: Int): Int {
        return x * y
    }

    fun defaultResult(x: Int, y: Int): Int {
        return 0
    }

}

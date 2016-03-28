package com.yeamanan.mscalculator.division

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.springframework.stereotype.Service

@Service
open class DivisionService {

    @HystrixCommand(fallbackMethod = "defaultResult")
    open fun division(x: Int, y: Int): Int {
        throw IllegalArgumentException()
        return x / y
    }

    fun defaultResult(x: Int, y: Int): Int {
        return 0
    }

}

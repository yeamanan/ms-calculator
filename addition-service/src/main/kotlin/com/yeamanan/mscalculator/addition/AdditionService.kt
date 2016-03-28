package com.yeamanan.mscalculator.addition

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.springframework.stereotype.Service

@Service
open class AdditionService {

    @HystrixCommand(fallbackMethod = "defaultResult")
    open fun addition(x: Int, y: Int): Int {
        return x + y
    }

    fun defaultResult(x: Int, y: Int): Int {
        return 0
    }

}

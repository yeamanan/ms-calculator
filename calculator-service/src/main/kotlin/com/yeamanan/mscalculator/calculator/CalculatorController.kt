package com.yeamanan.mscalculator.calculator

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
open class CalculatorController {

    @Autowired
    lateinit var service: CalculatorService

    @RequestMapping("/{operation}")
    fun root(@PathVariable("operation") operation: String): Int {
        return service.calculate(operation)
    }

}

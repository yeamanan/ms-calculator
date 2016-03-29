package com.yeamanan.mscalculator.multiplication

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
open class MultiplicationController {

    @Autowired
    lateinit var service: MultiplicationService

    @RequestMapping("/{x:-?[0-9]+\\.[0-9]+},{y:-?[0-9]+\\.[0-9]+}")
    fun root(@PathVariable("x") x: Double, @PathVariable("y") y: Double): Double {
        return service.multiplication(x, y)
    }

}

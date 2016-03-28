package com.yeamanan.mscalculator.multiplication

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
open class MultiplicationController {

    @Autowired
    lateinit var service: MultiplicationService

    @RequestMapping("/{x:-?\\d+},{y:-?\\d+}")
    fun root(@PathVariable("x") x: Int, @PathVariable("y") y: Int): Int {
        return service.multiplication(x, y)
    }

}

package com.yeamanan.mscalculator.addition

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
open class AdditionController {

    @Autowired
    lateinit var service: AdditionService

    @RequestMapping("/{x:-?[0-9]+\\.[0-9]+},{y:-?[0-9]+\\.[0-9]+}")
    fun root(@PathVariable("x") x: Double, @PathVariable("y") y: Double): Double {
        return service.addition(x, y)
    }

}

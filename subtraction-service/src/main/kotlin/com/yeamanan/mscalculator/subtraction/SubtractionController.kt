package com.yeamanan.mscalculator.subtraction

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
open class SubtractionController {

    @Autowired
    lateinit var service: SubtractionService

    @RequestMapping("/{x:-?\\d+},{y:-?\\d+}")
    fun root(@PathVariable("x") x: Int, @PathVariable("y") y: Int): Int {
        return service.subtraction(x, y)
    }

}

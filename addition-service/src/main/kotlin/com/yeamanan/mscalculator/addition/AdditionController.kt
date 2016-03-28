package com.yeamanan.mscalculator.addition

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
open class AdditionController {

    @Autowired
    lateinit var service: AdditionService

    @RequestMapping("/{x:-?\\d+},{y:-?\\d+}")
    fun root(@PathVariable("x") x: Int, @PathVariable("y") y: Int): Int {
        return service.addition(x, y)
    }

}

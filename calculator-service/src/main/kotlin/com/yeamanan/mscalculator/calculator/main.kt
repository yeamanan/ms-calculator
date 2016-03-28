package com.yeamanan.mscalculator.calculator

import org.springframework.boot.SpringApplication
import org.springframework.boot.actuate.system.ApplicationPidFileWriter

fun main(args: Array<String>) {
    val msSum = SpringApplication(CalculatorApplication::class.java)
    msSum.addListeners(ApplicationPidFileWriter("calculator-service.pid"))
    msSum.run(*args)
}

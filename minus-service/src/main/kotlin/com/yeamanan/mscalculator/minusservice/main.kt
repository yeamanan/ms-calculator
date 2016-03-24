package com.yeamanan.mscalculator.minusservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.actuate.system.ApplicationPidFileWriter

fun main(args: Array<String>) {
    val msSum = SpringApplication(MinusService::class.java)
    msSum.addListeners(ApplicationPidFileWriter("minus-service.pid"))
    msSum.run(*args)
}

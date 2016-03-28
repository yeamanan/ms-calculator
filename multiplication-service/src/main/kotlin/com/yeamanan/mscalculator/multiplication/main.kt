package com.yeamanan.mscalculator.multiplication

import org.springframework.boot.SpringApplication
import org.springframework.boot.actuate.system.ApplicationPidFileWriter

fun main(args: Array<String>) {
    val msSum = SpringApplication(MultiplicationApplication::class.java)
    msSum.addListeners(ApplicationPidFileWriter("multiplication-service.pid"))
    msSum.run(*args)
}

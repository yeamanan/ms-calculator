package com.yeamanan.mscalculator.division

import org.springframework.boot.SpringApplication
import org.springframework.boot.actuate.system.ApplicationPidFileWriter

fun main(args: Array<String>) {
    val msSum = SpringApplication(DivisionApplication::class.java)
    msSum.addListeners(ApplicationPidFileWriter("division-service.pid"))
    msSum.run(*args)
}

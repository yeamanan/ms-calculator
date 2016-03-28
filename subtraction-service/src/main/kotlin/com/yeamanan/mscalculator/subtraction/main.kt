package com.yeamanan.mscalculator.subtraction

import org.springframework.boot.SpringApplication
import org.springframework.boot.actuate.system.ApplicationPidFileWriter

fun main(args: Array<String>) {
    val msSubtraction = SpringApplication(SubtractionApplication::class.java)
    msSubtraction.addListeners(ApplicationPidFileWriter("subtraction-service.pid"))
    msSubtraction.run(*args)
}

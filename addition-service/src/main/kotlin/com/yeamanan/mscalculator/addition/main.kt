package com.yeamanan.mscalculator.addition

import org.springframework.boot.SpringApplication
import org.springframework.boot.actuate.system.ApplicationPidFileWriter

fun main(args: Array<String>) {
    val msAddition = SpringApplication(AdditionApplication::class.java)
    msAddition.addListeners(ApplicationPidFileWriter("addition-service.pid"))
    msAddition.run(*args)
}

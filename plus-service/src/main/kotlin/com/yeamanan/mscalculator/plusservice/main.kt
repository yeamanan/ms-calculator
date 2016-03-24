package com.yeamanan.mscalculator.plusservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.actuate.system.ApplicationPidFileWriter

fun main(args: Array<String>) {
    val msSum = SpringApplication(PlusService::class.java)
    msSum.addListeners(ApplicationPidFileWriter("plus-service.pid"))
    msSum.run(*args)
}

package com.yeamanan.mscalculator.eurekaserver

import org.springframework.boot.SpringApplication
import org.springframework.boot.actuate.system.ApplicationPidFileWriter

fun main(args: Array<String>) {
    val eurekaServer = SpringApplication(EurekaServer::class.java)
    eurekaServer.addListeners(ApplicationPidFileWriter("eureka-server.pid"))
    eurekaServer.run(*args)
}

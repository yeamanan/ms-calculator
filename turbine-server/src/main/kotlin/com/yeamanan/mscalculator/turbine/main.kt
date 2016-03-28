package com.yeamanan.mscalculator.turbine

import org.springframework.boot.SpringApplication
import org.springframework.boot.actuate.system.ApplicationPidFileWriter

fun main(args: Array<String>) {
    val turbineServer = SpringApplication(TurbineServer::class.java)
    turbineServer.addListeners(ApplicationPidFileWriter("turbine-server.pid"))
    turbineServer.run(*args)
}

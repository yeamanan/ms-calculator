package com.yeamanan.mscalculator.zuulserver

import org.springframework.boot.SpringApplication
import org.springframework.boot.actuate.system.ApplicationPidFileWriter

fun main(args: Array<String>) {
    val zuulServer = SpringApplication(ZuulServer::class.java)
    zuulServer.addListeners(ApplicationPidFileWriter("zuul-server.pid"))
    zuulServer.run(*args)
}

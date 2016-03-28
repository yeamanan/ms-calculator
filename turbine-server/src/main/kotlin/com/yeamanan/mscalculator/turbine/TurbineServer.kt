package com.yeamanan.mscalculator.turbine

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard
import org.springframework.cloud.netflix.turbine.EnableTurbine
import org.springframework.context.annotation.Bean

@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
open class TurbineServer {

    private val log = LoggerFactory.getLogger(TurbineServer::class.java)

    @Bean
    open fun init() = CommandLineRunner {
        log.info("Turbine Server Started")
    }

}

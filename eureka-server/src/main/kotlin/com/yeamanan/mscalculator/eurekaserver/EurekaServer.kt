package com.yeamanan.mscalculator.eurekaserver

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer
import org.springframework.context.annotation.Bean

@SpringBootApplication
@EnableEurekaServer
open class EurekaServer {

    private val log = LoggerFactory.getLogger(EurekaServer::class.java)

    @Bean
    open fun init() = CommandLineRunner {
        log.info("Eureka Server Started")
    }

}

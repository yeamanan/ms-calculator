package com.yeamanan.mscalculator.mssum

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.context.annotation.Bean

@SpringBootApplication
@EnableEurekaClient
open class MsSum {

    private val log = LoggerFactory.getLogger(MsSum::class.java)

    @Bean
    open fun init() = CommandLineRunner {
        log.info("Microservice Sum Started")
    }

}

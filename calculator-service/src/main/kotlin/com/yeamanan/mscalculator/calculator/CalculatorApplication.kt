package com.yeamanan.mscalculator.calculator

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.context.annotation.Bean

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
open class CalculatorApplication {

    private val log = LoggerFactory.getLogger(CalculatorApplication::class.java)

    @Bean
    open fun init() = CommandLineRunner {
        log.info("Calculator Service Started")
    }

}

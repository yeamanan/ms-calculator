package com.yeamanan.mscalculator.division

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard
import org.springframework.context.annotation.Bean

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableHystrixDashboard
open class DivisionApplication {

    private val log = LoggerFactory.getLogger(DivisionApplication::class.java)

    @Bean
    open fun init() = CommandLineRunner {
        log.info("Division Service Started")
    }

}

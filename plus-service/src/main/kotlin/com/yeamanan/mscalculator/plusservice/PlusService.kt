package com.yeamanan.mscalculator.plusservice

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
//import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.context.annotation.Bean
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
//@EnableCircuitBreaker
@EnableDiscoveryClient
@RestController
open class PlusService {

    private val log = LoggerFactory.getLogger(PlusService::class.java)

    @Bean
    open fun init() = CommandLineRunner {
        log.info("Plus Service Started")
    }

    @RequestMapping("/")
    fun helloWorld(): String = "Hello World from Plus Service!"

}

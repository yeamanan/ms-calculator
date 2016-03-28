package com.yeamanan.mscalculator.addition

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.context.annotation.Bean
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableHystrixDashboard
@RestController
open class AdditionService {

    private val log = LoggerFactory.getLogger(AdditionService::class.java)

    @Bean
    open fun init() = CommandLineRunner {
        log.info("Addition Service Started")
    }

    @RequestMapping("/{x:-?\\d+},{y:-?\\d+}")
    @HystrixCommand(groupKey = "calcultator", fallbackMethod = "defaultResult")
    fun addition(@PathVariable("x") x: Int, @PathVariable("y") y: Int): Int {
        return x + y
    }

    fun defaultResult(x: Int, y: Int): Int {
        return 0
    }

}

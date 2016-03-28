package com.yeamanan.mscalculator.plusservice

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
open class PlusService {

    private val log = LoggerFactory.getLogger(PlusService::class.java)

    @Bean
    open fun init() = CommandLineRunner {
        log.info("Plus Service Started")
    }

    @RequestMapping("/{x:-?\\d+},{y:-?\\d+}")
    @HystrixCommand(groupKey = "calculator", fallbackMethod = "defaultResult")
    fun plus(@PathVariable("x") x: Int, @PathVariable("y") y: Int): Int {
        return x + y
    }

    fun defaultResult(x: Int, y: Int): Int {
        return 0
    }

}

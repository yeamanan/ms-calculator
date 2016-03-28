package com.yeamanan.mscalculator.zuul

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.zuul.EnableZuulProxy
import org.springframework.context.annotation.Bean

@SpringBootApplication
@EnableZuulProxy
open class ZuulServer {

    private val log = LoggerFactory.getLogger(ZuulServer::class.java)

    @Bean
    open fun init() = CommandLineRunner {
        log.info("Zuul Server Started")
    }

}

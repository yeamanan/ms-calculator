package com.yeamanan.mscalculator.calculator

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.springframework.stereotype.Service
import java.net.URL

@Service
open class CalculatorService {

    @HystrixCommand(fallbackMethod = "defaultResult")
    open fun calculate(operation: String): String {
        var numbers = operation.split("+", "-", "*", "%")
        var operators = operation.toCharArray()
                .filter { it.equals('+') || it.equals('-') || it.equals('*') || it.equals('%') }
        var result = numbers[0]
        numbers = numbers.drop(1)
        for (number in numbers) {
            result = callService(operators[0], result, number)
            operators = operators.drop(1)
        }
        return result
    }

    fun defaultResult(operation: String): Int {
        return 0
    }

    fun callService(operator: Char, x: String, y: String): String {
        return URL("http://localhost:8765/${resolveOperator(operator)}/$x,$y").readText();
    }

    fun resolveOperator(operator: Char): String {
        var serviceName: String = ""
        when(operator) {
            '+' -> serviceName = "addition"
            '-' -> serviceName = "subtraction"
            '*' -> serviceName = "multiplication"
            '%' -> serviceName = "division"
        }
        return serviceName
    }
}

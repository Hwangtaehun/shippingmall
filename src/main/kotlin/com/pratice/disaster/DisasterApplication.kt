package com.pratice.disaster

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DisasterApplication

fun main(args: Array<String>) {
	runApplication<DisasterApplication>(*args)
}

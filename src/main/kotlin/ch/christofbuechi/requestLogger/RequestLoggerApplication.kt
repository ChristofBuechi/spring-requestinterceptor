package ch.christofbuechi.requestLogger

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RequestLoggerApplication

fun main(args: Array<String>) {
	runApplication<RequestLoggerApplication>(*args)
}

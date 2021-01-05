package ch.sabina.jpademo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JpaDemoWithKotlinApplication

fun main(args: Array<String>) {
	runApplication<JpaDemoWithKotlinApplication>(*args)
}

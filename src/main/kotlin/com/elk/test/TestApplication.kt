package com.elk.test

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TestApplication : CommandLineRunner {
    val log = LoggerFactory.getLogger(TestApplication::class.java)

    override fun run(vararg args: String?) {
        for (i in 0..50) {
            log.error("test error, id=$i ; name= Test$i")
        }
    }


}


fun main(args: Array<String>) {
    runApplication<TestApplication>(*args)

}

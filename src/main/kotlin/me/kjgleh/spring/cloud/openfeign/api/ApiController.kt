package me.kjgleh.spring.cloud.openfeign.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ApiController {

    @GetMapping("/hello")
    fun hello(): String {
        return "hello"
    }
}
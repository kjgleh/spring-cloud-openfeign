package me.kjgleh.spring.cloud.openfeign.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "api-client", url = "http://localhost:8080")
interface ApiClient {

    @GetMapping("/hello")
    fun hello(): String
}
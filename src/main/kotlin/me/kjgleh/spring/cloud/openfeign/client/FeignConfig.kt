package me.kjgleh.spring.cloud.openfeign.client

import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.context.annotation.Configuration

@Configuration
@EnableFeignClients(basePackages = ["me.kjgleh"])
class FeignConfig
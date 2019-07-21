package me.saro.example.msaeurekafeignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("spring-cloud-eureka-client")
public interface ExampleClient {

    @GetMapping("/hello")
    String hello();
}

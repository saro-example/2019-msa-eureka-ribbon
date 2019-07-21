package me.saro.example.msaeurekafeignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ExampleController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/hello")
    String hello() {
        System.out.println(restTemplate);
        return restTemplate.getForObject("http://spring-cloud-eureka-client/hello", String.class);
    }
}

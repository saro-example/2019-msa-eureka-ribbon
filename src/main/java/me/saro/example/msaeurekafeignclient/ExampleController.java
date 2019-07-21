package me.saro.example.msaeurekafeignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @Autowired ExampleClient exampleClient;

    @GetMapping("/hello")
    String hello() {
        return exampleClient.hello();
    }
}

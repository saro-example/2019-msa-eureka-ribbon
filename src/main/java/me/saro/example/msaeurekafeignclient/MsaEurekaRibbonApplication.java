package me.saro.example.msaeurekafeignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.netflix.ribbon.eureka.ConditionalOnRibbonAndEurekaEnabled;

@SpringBootApplication
@EnableDiscoveryClient
public class MsaEurekaRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaEurekaRibbonApplication.class, args);
	}

}

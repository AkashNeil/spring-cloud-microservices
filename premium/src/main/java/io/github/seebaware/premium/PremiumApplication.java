package io.github.seebaware.premium;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PremiumApplication {

    public static void main(String[] args) {

        SpringApplication.run(PremiumApplication.class, args);

    }

}

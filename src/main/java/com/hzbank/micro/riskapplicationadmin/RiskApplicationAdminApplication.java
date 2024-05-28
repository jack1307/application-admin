package com.hzbank.micro.riskapplicationadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@EnableAdminServer
@SpringBootApplication
public class RiskApplicationAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(RiskApplicationAdminApplication.class, args);
    }

}

package com.arcor.authldap.discovery.AuthLdapDiscoveryService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AuthLdapDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthLdapDiscoveryServiceApplication.class, args);
	}

}

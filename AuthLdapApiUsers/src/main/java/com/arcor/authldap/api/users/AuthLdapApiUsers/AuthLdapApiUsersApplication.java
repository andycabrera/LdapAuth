package com.arcor.authldap.api.users.AuthLdapApiUsers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AuthLdapApiUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthLdapApiUsersApplication.class, args);
	}

}

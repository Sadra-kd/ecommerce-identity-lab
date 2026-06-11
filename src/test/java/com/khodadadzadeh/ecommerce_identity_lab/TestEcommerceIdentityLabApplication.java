package com.khodadadzadeh.ecommerce_identity_lab;

import org.springframework.boot.SpringApplication;

public class TestEcommerceIdentityLabApplication {

	public static void main(String[] args) {
		SpringApplication.from(EcommerceIdentityLabApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}

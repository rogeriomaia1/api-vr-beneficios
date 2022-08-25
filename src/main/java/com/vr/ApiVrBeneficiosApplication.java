package com.vr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.vr")
@EntityScan(basePackages = "com.vr.model")
public class ApiVrBeneficiosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiVrBeneficiosApplication.class, args);
	}

}

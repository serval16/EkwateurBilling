package org.ekwateur.ekwateurbilling;

import org.ekwateur.ekwateurbilling.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(AppConfig.class)
@SpringBootApplication
public class EkwateurBillingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EkwateurBillingApplication.class, args);
	}

}

package br.com.isaccanedo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.isaccanedo")
public class IbmmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(IbmmqApplication.class, args);
	}

}

package com.hansen.sbrouting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SbroutingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbroutingApplication.class, args);
	}
	
	@RequestMapping("/")
	public String index() {
		return "Routes to test include '/coding', '/coding/python', '/coding/java'.  As well as '/dojo', '/burbank-dojo', and '/san-jose'.";
	}

}

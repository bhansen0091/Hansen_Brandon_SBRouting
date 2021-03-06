package com.hansen.sbrouting;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class DojoController {

	@RequestMapping("/{strInput}")
	public String dojo(@PathVariable("strInput") String strInput) {
		
		if ("dojo".equalsIgnoreCase(strInput)) {
			return "The dojo is awesome!";
		} else if ("burbank-dojo".equalsIgnoreCase(strInput)) {
			return "Burbank Dojo is located in Southern California.";
		} else if ("san-jose".equalsIgnoreCase(strInput)) {
			return "SJ dojo is the headquarters.";
		} else {
			return "Nothing is here for you!";
		}
	}
	
	
}

package com.it.pradhan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {
	
	@Bean
	public DriverManager conObj() {
		DriverManager dm = new DriverManager();
		dm.setDriverClass("MySql");
		dm.setUrl("Mysql:URL");
		return dm;
	}

}

package com.it.pradhan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@ComponentScan("com.it.pradhan")
@Configuration
public class AppConfig {
	//1. Bean = 1 Method
	  @Bean
	  @Scope("prototype")
	  public Token t1() {
	    return new Token();
	  }

}

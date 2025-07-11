package com.it.pradhan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.it.pradhan.Token;
import com.it.pradhan.TokenService;
import com.it.pradhan.config.AppConfig;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		TokenService bean = ac.getBean("tokenService", TokenService.class);
		Token token = bean.getToken();
		System.out.println(token);

	}

}

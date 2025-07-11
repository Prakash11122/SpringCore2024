package com.it.pradhan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.it.pradhan.config.MyAppConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context  = new AnnotationConfigApplicationContext(MyAppConfig.class);
		Object bean = context.getBean("con");
		System.out.println(bean);

	}

}

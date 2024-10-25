package com.it.pradhan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.it.pradhan.config.MyConfig;
import com.it.pradhan.controller.MyController;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		MyController bean = ac.getBean("myController",MyController.class);
		System.out.println(bean);

	}

}

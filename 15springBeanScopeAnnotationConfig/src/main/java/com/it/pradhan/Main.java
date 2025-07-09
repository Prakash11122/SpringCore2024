package com.it.pradhan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		Token bean = ac.getBean("pkp",Token.class);
		System.out.println(bean);
		
		Token bean2 = ac.getBean("pkp",Token.class);
		System.out.println(bean2);

	}

}

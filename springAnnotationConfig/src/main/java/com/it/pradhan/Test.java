package com.it.pradhan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("com.it.pradhan");
		context.refresh();
		HandlerInfo bean = context.getBean("hob",HandlerInfo.class);
		System.out.println(bean);
		
		
		

	}

}

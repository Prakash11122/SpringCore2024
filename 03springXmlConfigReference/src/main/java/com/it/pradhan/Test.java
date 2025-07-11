package com.it.pradhan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext contect = new ClassPathXmlApplicationContext("beans.xml");
		Object bean = contect.getBean("rob");
		System.out.println(bean);

	}

}

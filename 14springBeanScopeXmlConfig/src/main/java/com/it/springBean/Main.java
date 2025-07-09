package com.it.springBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		//Reading object from container
		Token bean = ac.getBean("pkp", Token.class);
		System.out.println(bean.hashCode());
		
		Token bean2 = ac.getBean("pkp", Token.class);
		System.out.println(bean2.hashCode());
	}

}

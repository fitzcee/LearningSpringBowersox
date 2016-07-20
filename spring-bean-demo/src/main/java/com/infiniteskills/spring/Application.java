package com.infiniteskills.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
//		BeanA_preChap3A beanA = context.getBean("beanA", BeanA_preChap3A.class);
//		beanA.getBeanB().execute();
		
		BeanA beanA = context.getBean("beanA", BeanA.class);
		System.out.println(beanA.getYear());
		
		BeanB beanB = context.getBean("beanB", BeanB.class);
		
		((ClassPathXmlApplicationContext)context).close();		
	}

}

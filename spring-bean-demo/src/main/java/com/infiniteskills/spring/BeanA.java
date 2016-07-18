package com.infiniteskills.spring;

public class BeanA {

	public BeanA(BeanB beanB){
		System.out.println("Object constuctor");
		beanB.execute();
	}
	
	public BeanA(String value, String value2) {
		System.out.println("String constuctor");
		System.out.println(value);
		System.out.println(value2);
	}
	
	public BeanA(int value) {
		System.out.println("int constuctor");
		System.out.println(value);
	}
	
	

}

package com.infiniteskills.spring;

public class CustomFactory {

	public CustomFactory() {
		System.out.println("Instantiating factory");
	}

	public BeanB getBeanBInstance() {
		System.out.println("Returning instance of bean");
		return new BeanB();
	}
	
}

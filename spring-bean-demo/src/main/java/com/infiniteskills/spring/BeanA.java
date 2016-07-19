package com.infiniteskills.spring;

public class BeanA {

	public BeanA(){
		
	}
	
/*	public BeanA(BeanB beanB){
		System.out.println("in Object constuctor");
		beanB.execute();
	}
	
	public BeanA(String value, String value2) {
		System.out.println("in String constuctor");
		System.out.println(value);
		System.out.println(value2);
	}
	
	public BeanA(int value) {
		System.out.println("in int constuctor");
		System.out.println(value);
	}
*/	
	private int age;
	private BeanB beanB;
	
	public BeanB getBeanB() {
		return beanB;
	}

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("in age setter");
		this.age = age;
	}



}

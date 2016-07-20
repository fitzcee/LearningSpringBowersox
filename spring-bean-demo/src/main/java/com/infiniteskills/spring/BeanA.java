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
	private int prop1;
	public int getProp1() {
		return prop1;
	}

	public void setProp1(int prop1) {
		this.prop1 = prop1;
		System.out.println(String.format("set prop1 = %s", this.prop1));
	}

	private BeanB beanB;
	
	public BeanB getBeanB() {
		return beanB;
	}

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}



}

package com.infiniteskills.spring;

public class BeanB {

	private String val;
	
	public BeanB(){
		
	}
	
	public BeanB(String val) {
		super();
		this.val = val;
		System.out.println(String.format("In Bean B string constructor, with val = %1s", this.val));
	}

	public void execute() {
		System.out.println("In Bean B execute");
	}
}

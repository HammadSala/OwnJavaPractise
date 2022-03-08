package com.greatlearning.corejava;

public class MethodImplCH16 {

	public void mehtod1() {
		System.out.println("I am from method1 without return type”.");
	}
	
	public void method1(int arg1) {
		System.out.println("I am from method1 without return type and an input argument --> "+ arg1);
	}
	
	public String method2() {
		return "I am from method with return type.";
	}
	
	public String method2(String arg1) {
		return "I am from method1 without return type and an input argument--> ";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodImplCH16 o1 = new MethodImplCH16();
		o1.mehtod1();
		o1.method1(20);
		System.out.println(o1.method2());
		System.out.println(o1.method2("test") + "test");

	}

}

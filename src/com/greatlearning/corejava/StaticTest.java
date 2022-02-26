package com.greatlearning.corejava;

/**
 * 
Step 1: Create integer non-static variable var1 and a static variable var2 and assign value 10 to var1 & var2.
Step 2: create two methods method1 and method2.
Step3: In method1, use increment operator to increment var1 and use print statement to print var1.
Step 4 :Similarly perform for method2 with var2.
Step 5 :Create three objects obj1, obj2, obj3.
Step 5 :Execute method1 with all the objects.
Similarly perform for method2.
(Optional) Replace static with final for var2 and run the program. Note your observations.
 * @author Hammad-PC
 *
 */

public class StaticTest {
	//variable declaration
	
	int var1 = 10;
	int var2 = 10;
	
	void addvar1() {
		System.out.println("non static - >"+ ++var1);
	}
	
	void addvar2() {
		System.out.println("static - >"+ ++var2);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticTest obj1 = new StaticTest();
		StaticTest obj2 = new StaticTest();
		StaticTest obj3 = new StaticTest();
		
		obj1.addvar1();
		obj2.addvar1();
		obj3.addvar1();
		
		obj1.addvar2();
		obj2.addvar2();
		obj3.addvar2();
		
		

	}

}

package com.greatlearning.corejava;

import java.util.Scanner;

/***
 * 
 * @author Hammad-PC
 *Algorithm
 *Step 1: DEfine class ConstructorDemo 
 *Step 2: Define Default and Paramterised construcctor
 *Step 3: Create introduction function on contstructor
 *Step 4: End
 */


public class ConstructorDemo {
	
	ConstructorDemo(){
		System.out.println("Default Constructor got called here");
	}
	
	ConstructorDemo(String name, int age, float no1, char initials ){
		System.out.println("I am Parameterized constructor. I take various arguments as input");
		
		System.out.println("Name " + name);
		System.out.println("Age " + age);
		System.out.println("FLoat " + no1);
		System.out.println("Initial " + initials);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		String name;
		float no1;
		char initials;
		Scanner inp1 = new Scanner(System.in);
		
		ConstructorDemo defualtobj = new ConstructorDemo();
		
		//Parameterise Constructor
		System.out.println("Enter the Name");
		name = inp1.next();
		System.out.println("Enter the Age");
		age = inp1.nextInt();
		System.out.println("Enter the floa number");
		no1 = inp1.nextFloat();
		System.out.println("Enter the Initial");
		initials  = inp1.next().charAt(0);
		
		ConstructorDemo paraobj = new ConstructorDemo( name,  age,  no1, initials);

	}

}

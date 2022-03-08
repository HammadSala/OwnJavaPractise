package com.greatlearning.corejava;

/**
 * Step 1 : Class Area definie
 * Step 2 : Define 2 methods with parameter and 3 parterns
 * Step 3 : method to prinf area 
 * Step 3.1: In main class create obbject and call methos based on the parameters.
 * Step 4 : stop
 * @author Hammad-PC
 *
 */

class Area1{
	void areaofShape(double a, double b) {
		System.out.println("Area of rectangle "+ a*b);
	}
	
	void areaofShape(double a, double b, double c) {
		System.out.println("Area of rectangle "+ a*b*c);
	}
}

public class PolymorphismCha12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Area1 a = new Area1();
		a.areaofShape(10, 20.1);
		a.areaofShape(10, 20.1,33.3);
		

	}

}

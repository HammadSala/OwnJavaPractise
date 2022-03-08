package com.greatlearning.corejava;

/**
 * Step 1: Create 3 class
 * Step 2: DEfine function in three classes
 * Step 3: create objec for last calss
 * Step 4: Call function from the object
 * @author Hammad-PC
 *
 */

public class MultilevelInheritance {
	
	static class InheritanceA{
		void circleArea() {
			System.out.println("Area of Circle");
		}
		
	}
	
	static class InheritanceB extends InheritanceA{
		void rectangleArea () {
			System.out.println("Area of rectangle");
		}
		
	}
	
	static class InheritanceC extends InheritanceB{
		void triangleArea() {
			System.out.println("Area of triangel");
		}
	}
	
	public static void main(String args[])
	{
		
		InheritanceC c1 = new InheritanceC();
		c1.circleArea();
		c1.triangleArea();
		c1.rectangleArea();
	}
	


}

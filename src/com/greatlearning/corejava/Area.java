package com.greatlearning.corejava;

/**
 * 
 * @author Hammad-PC
 * Step 1 : DEfine class  Area
 * Step 2 : Use keyword Fina for PI
 * Step 2.2: Get variable raduis
 * Step 3 : Find area of the cirecle = PI * r * r
 * Step 4 : Display area
 * STep 5 : Close
 */

public class Area {
	final double PI = 3.14;
	
	Area(double r) {
		System.out.println("Area of circle is " + (PI*r*r));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Area a1 = new Area(2.34);

	}

}

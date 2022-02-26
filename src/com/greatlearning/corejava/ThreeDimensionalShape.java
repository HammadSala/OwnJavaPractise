package com.greatlearning.corejava;

/**
 * 
 * @author Hammad-PC
 *Step 1) Create a class ThreeDimensionShape with three variables  width, height, depth of type double;
* Step 2) Create three constructors 
* Step 3) Doesn’t accepts any parameter
* Step 4) Accepts 1 parameter of type double(length)
* Step 5) Accepts 3 parameters of type double(width, height, depth)
* Step 5) Create a method volume of return type double that returns a product of width, height, and depth.

* Step 6) in case of No argument constructor make length=width=depth = 0;
* Step 7)in case of 1 argument constructor make length=width=depth = value passed;
 */

public class ThreeDimensionalShape {
	
	//Variable declaration
	
	double len, width, height, area;
	
	//Constructors definition
	
	ThreeDimensionalShape()
	{
		System.out.println("Defualt Constructor with no paramtere");
		this.len = 0;
		this.width =0;
		this.height = 0;
	}
	
	ThreeDimensionalShape(double len)
	{
		this.len = len;
		this.width =len;
		this.height = len;
		
	}
	

	ThreeDimensionalShape(double len, double width, double height){
		this.len = len;
		this.width =width;
		this.height = height;
	}

	double volume() {
		area = len*width*height;
		return area;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeDimensionalShape shape1 = new ThreeDimensionalShape();
		ThreeDimensionalShape shape2 =  new ThreeDimensionalShape(23.4);
		ThreeDimensionalShape shape3 = new ThreeDimensionalShape(2.3,44,51);
		
		System.out.println(shape1.volume());
		System.out.println(shape2.volume());
		System.out.println(shape3.volume());
		
		

	}

}

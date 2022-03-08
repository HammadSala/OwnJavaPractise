package com.greatlearning.corejava;

/**
 * Step1 : create clas Method
 * Step2 : 
 * @author Hammad-PC
 *
 */

class Method{
	
	int i = 10;
	
	public int performleftShift() {
		return(i<<1);
	}
	
	public void performrightShift(int val, int digits) {
		System.out.printf("Right shifted numbr is %d and  number of digit shifted is %d --> %d", val,digits,(val>>digits));
	}
}
	
	
public class OOPCH17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method m1 = new Method();
		System.out.println("Left shift details" + m1.performleftShift());
		m1.performrightShift(10, 2);

	}
	}



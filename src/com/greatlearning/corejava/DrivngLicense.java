package com.greatlearning.corejava;

class decision{
	private int age;
	private boolean decision = true;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	
	public boolean getDecision() {
		if(age > 70) {
			decision = false;
		}		
		return decision;
	}
}

public class DrivngLicense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		decision d = new decision();
		d.setAge(23);
		System.out.println(d.getDecision());
	}

}

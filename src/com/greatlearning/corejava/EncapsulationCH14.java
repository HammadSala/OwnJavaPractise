package com.greatlearning.corejava;

/**
 * Step 1 : DEfine class Encapsulation
 * Step 2 : DEclare privte variables country, nationalAnthem and touristSpot
 * Step 3 : Define  Set and Get mthod for accessing the values
 * Step 4 : Inherti the encaps class and access the provate varible uing the get and set methods
 * Step 5: stop
 * @author Hammad-PC
 *
 */


public class EncapsulationCH14 {
	private String country = "";
	private String nationalAnthem ="";
	private String touristSpot = "";
	
		public void countrySet(String country) {
			this.country = country;
			
		}
		
		String countryGet() {
		return country;
		}
		
		void nationalAnthemSet(String nationalAnthem) {
			this.nationalAnthem = nationalAnthem;
			
		}
		
		String nationalAnthemGet() {
		return nationalAnthem;
		}
		
		void touristSpotSet(String touristSpot) {
			this.touristSpot = touristSpot;
			
		}
		
		String touristSpotGet() {
		return touristSpot;
		}
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String contry,nationalAnthem,touristSpot;

		
		EncapsulationCH14 o1 = new EncapsulationCH14();
		
		o1.countrySet("India");
		o1.nationalAnthemSet("Natinal Anthem");
		o1.touristSpotSet("Delhi");
		
		
//		country= o1.countryGet();
//		nationalAnthem = o1.nationalAnthemGet();
//		touristSpot = o1.touristSpotGet();
		
		System.out.println(o1.countryGet());
		System.out.println(o1.nationalAnthemGet());
		System.out.println(o1.touristSpotGet());
		
				
		

	}

}

package com.greatlearning.corejava;


class Detailsfun{
	private String country, nationaAnthem, Touristspot;
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setNationalAnthem(String nationaAnthem) {
		this.nationaAnthem = nationaAnthem;
	}
	
	public void setTouristspot(String Touristspot) {
		this.Touristspot = Touristspot;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getNationalAnthem() {
		return nationaAnthem;
	}
	
	public String getTouristspot() {
		return Touristspot;
	}
}
public class PolymorphismCH14v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Detailsfun obj1 = new Detailsfun();
		
		obj1.setCountry("India");
		obj1.setNationalAnthem("Jana Gana Mana");
		obj1.setTouristspot("Tamil Nadu");
		
		System.out.println("Country " + obj1.getCountry());
		System.out.println("National Anthem " + obj1.getNationalAnthem());
		System.out.println("Tourist Spot " + obj1.getTouristspot());

	}

}

package com.course.buildings;

public class House extends Building{
	private int bedrooms;
	private int baths;
	
	public void setBedrooms(int num){
		bedrooms=num;
	}
	public int getBedrooms(){
		return bedrooms;
	}
	
	public void setBaths(int num){
		baths=num;
	}
	public int getBaths(){
		return baths;
	}
}
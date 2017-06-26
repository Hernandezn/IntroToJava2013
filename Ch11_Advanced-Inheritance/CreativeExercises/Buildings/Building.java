package com.course.buildings;

public class Building{
	protected int squareFootage;
	protected int stories;
	
	public void setAcreage(int num){
		squareFootage=num;
	}
	public int getAcreage(){
		return squareFootage;
	}
	
	public void setStories(int num){
		stories=num;
	}
	public int getStories(){
		return stories;
	}
}
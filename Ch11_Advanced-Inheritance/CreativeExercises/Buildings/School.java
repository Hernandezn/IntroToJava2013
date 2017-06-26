package com.course.buildings;

public class School extends Building{
	private int classrooms;
	private String gradeLevel;
	
	public void setClassrooms(int num){
		classrooms=num;
	}
	public int getClassrooms(){
		return classrooms;
	}
	
	public void setGrade(String s){
		gradeLevel=s;
	}
	public String getGrade(){
		return gradeLevel;
	}
}
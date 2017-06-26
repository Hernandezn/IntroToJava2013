import java.util.*;

public class CollegeStudent{
	String firstName;
	String surName;
	GregorianCalendar enrollDate;
	GregorianCalendar gradDate;
	
	public CollegeStudent(String firstName,String lastName,
		GregorianCalendar dateOfEnrollment){
		
		this.firstName=firstName;
		surName=lastName;
		enrollDate=dateOfEnrollment;
		gradDate=new GregorianCalendar(enrollDate.get(Calendar.YEAR)+4,
			enrollDate.get(Calendar.MONTH),enrollDate.get(Calendar.DATE));
	}
	
	public void setFirstName(String name){
		firstName=name;
	}
	public String getFirstName(){
		return firstName;
	}
	
	public void setSurName(String name){
		surName=name;
	}
	public String getSurName(){
		return surName;
	}
	
	public void setEnrollDate(GregorianCalendar date){
		enrollDate=date;
	}
	public GregorianCalendar getEnrollDate(){
		return enrollDate;
	}
	
	public void setGradDate(GregorianCalendar date){
		gradDate=date;
	}
	public GregorianCalendar getGradDate(){
		return gradDate;
	}
}
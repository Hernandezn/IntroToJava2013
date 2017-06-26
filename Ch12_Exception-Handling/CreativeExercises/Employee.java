public class Employee{
	private int idNum;
	private double hourlyWage;
	
	public Employee(int id, double wage) throws EmployeeException{
		idNum=id;
		hourlyWage=wage;
		if(hourlyWage<6.0 || hourlyWage>50.0)
			throw(new EmployeeException("Pay rate $"+hourlyWage+" is invalid for "+
				"employee "+idNum+"."));
	}
}
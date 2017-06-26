public class ThrowEmployee{
	public static void main(String[]args){
		int[]ids={4123,2359,5963};
		double[]pay={5.25,17.50,75.55};
		Employee[]workers=new Employee[ids.length];
		int x;
		
		for(x=0; x<ids.length; x++)
			try{
				workers[x]=new Employee(ids[x], pay[x]);
				System.out.println("Employee "+ids[x]+", pay rate $"+pay[x]+
					", was successfully registered.");
			}
			catch(EmployeeException error){
				System.out.println(error.getMessage());
			}
	}
}
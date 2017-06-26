import java.util.Scanner;

public class TestCheckup{
	
	public static void main(String[]args){
		Checkup one=new Checkup();
		Checkup two=new Checkup();
		Checkup three=new Checkup();
		Checkup four=new Checkup();
		
		one=getData();
		two=getData();
		three=getData();
		four=getData();
		
		showValues(one);
		showValues(two);
		showValues(three);
		showValues(four);
	}
	
	public static Checkup getData(){
		
		Scanner input=new Scanner(System.in);
		Checkup data=new Checkup();
		
		System.out.print("What is the patient number? ");
		data.setPatientNum(input.nextInt());
		
		System.out.print("Enter systolic blood pressure: ");
		data.setSystPressure(input.nextDouble());
		
		System.out.print("Enter diastolic blood pressure: ");
		data.setDiasPressure(input.nextDouble());
		
		System.out.print("Enter LDL cholesterol: ");
		data.setCholestLDL(input.nextDouble());
		
		System.out.print("Enter HDL cholesterol: ");
		data.setCholestHDL(input.nextDouble());
		
		return data;
	}
	
	public static void showValues(Checkup data){
		
		System.out.println("\nThe patient number referenced is "+
			data.getPatientNum()+".\n\nThis patient's systolic/diastolic "+
			"blood pressure values are "+data.getSystPressure()+"/"+
			data.getDiasPressure()+".\nThe patient's LDL and HDL "+
			"cholesterol figures are "+data.getCholestLDL()+" and "+
			data.getCholestHDL()+".");
			
		System.out.println();
		data.computeRatio();
		data.explainRatio();
		System.out.println("\n");
	}
}
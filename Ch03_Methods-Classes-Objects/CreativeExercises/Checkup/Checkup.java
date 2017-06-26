public class Checkup{
	int patientNum;
	double systPressure;
	double diasPressure;
	double cholestLDL;
	double cholestHDL;
	
	public void setPatientNum(int num){
		patientNum=num;
	}
	public int getPatientNum(){
		return patientNum;
	}//Patient Number
	
	public void setSystPressure(double num){
		systPressure=num;
	}
	public double getSystPressure(){
		return systPressure;
	}//Systolic Pressure
	
	public void setDiasPressure(double num){
		diasPressure=num;
	}
	public double getDiasPressure(){
		return diasPressure;
	}//Diastolic Pressure
	
	public void setCholestLDL(double num){
		cholestLDL=num;
	}
	public double getCholestLDL(){
		return cholestLDL;
	}//LDL Cholesterol
	
	public void setCholestHDL(double num){
		cholestHDL=num;
	}
	public double getCholestHDL(){
		return cholestHDL;
	}//HDL Cholesterol
	
	public void computeRatio(){
		double ratio=cholestLDL/cholestHDL;
		
		System.out.println("The LDL-to-HDL cholesterol ratio is "
			+ratio+".");
	}	
	public void explainRatio(){
		System.out.print("HDL is known as \"good cholestorol\", and a ");
		System.out.println("ratio of 3.5 or lower is considered optimum.");
	}//ratios
}
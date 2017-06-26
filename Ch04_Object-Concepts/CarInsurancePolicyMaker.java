public class CarInsurancePolicyMaker{
	public static void main(String[]args){
	
		CarInsurancePolicy first=new CarInsurancePolicy(123);
		CarInsurancePolicy second=new CarInsurancePolicy(456,4);
		CarInsurancePolicy third=new CarInsurancePolicy(
			789,12,"Newcastle");
//		CarInsurancePolicy fourth=new CarInsurancePolicy();
		
		first.display();
		System.out.println();
		second.display();
		System.out.println();
		third.display();
	}
}
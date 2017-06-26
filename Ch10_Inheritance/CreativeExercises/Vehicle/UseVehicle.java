public class UseVehicle{
	public static void main(String[]args){
		Car sedan=new Car(12);
		MotorCycle suzu=new MotorCycle(32);
		
		System.out.println("Sedan: "+sedan.toString());
		System.out.println("Suzu: "+suzu.toString());
	}
}
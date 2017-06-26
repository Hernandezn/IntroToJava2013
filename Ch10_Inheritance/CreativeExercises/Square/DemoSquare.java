public class DemoSquare{
	public static void main(String[]args){
		Square plate=new Square(2,2);
		Cube salt=new Cube(2,2,2);
		
		plate.computeSurfaceArea();
		salt.computeSurfaceArea();
		
		System.out.println("A square plate is "+plate.getLength()+" by "+
			plate.getHeight()+". Its surface area is "+plate.getSurfaceArea()+".");
		System.out.println("A cube of salt is "+salt.getLength()+" by "+
			salt.getHeight()+" by "+salt.getDepth()+". Its surface area is "+
			salt.getSurfaceArea()+".");
	}
}
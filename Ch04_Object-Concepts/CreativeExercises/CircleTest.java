public class CircleTest{
	public static void main(String[]args){
		Circle sample=new Circle();
		Circle test=new Circle();
		Circle def=new Circle();
		
		sample.setRadius(.45);
		test.setRadius(87);
		
		System.out.println("The radius of the small-sample circle is "+
			sample.getRadius()+".\nThis makes its diameter "+sample.diameter+
			" units and its area "+sample.area+" square units.");
		System.out.println();
		System.out.println("The radius of the large-sample circle is "+
			test.getRadius()+".\nThis makes its diameter "+test.diameter+
			" units and its area "+test.area+" square units.");
		System.out.println();
		System.out.println("The radius of the default-sample circle is "+
			def.getRadius()+".\nThis makes its diameter "+def.diameter+
			" units and its area "+def.area+" square units.");
	}
}
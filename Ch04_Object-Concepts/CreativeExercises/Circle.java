public class Circle{
	double radius,diameter,area;
	
	public Circle(){
		radius=1;
		diameter=2*radius;
		area=Math.pow(radius,2)*Math.PI;
	}
	
	public void setRadius(double num){
		radius=num;
		diameter=2*radius;
		area=Math.pow(radius,2)*Math.PI;
	}
	
	public double getRadius(){
		return radius;
	}
}
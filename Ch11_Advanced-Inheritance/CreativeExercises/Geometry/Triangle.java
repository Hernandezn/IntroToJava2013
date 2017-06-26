public class Triangle extends GeometricFigure{
	
	public Triangle(int x, int y){
		setHeight(y);
		setLength(x);
		setType("triangle");
		setArea();
	}
	
	public void setArea(){
		area=(double)(height*length)/2.0;
	}
	
	public void display(){
		System.out.println("A "+getType()+" of height "+getHeight()+" and length "+
			getLength()+" has an area of "+getArea()+" square units.");
	}
}
public class Triangle2 extends GeometricFigure2{
	
	public Triangle2(int x, int y){
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
		displaySides();
	}
	
	public void displaySides(){
		System.out.println("It has 3 sides.");
	}
}
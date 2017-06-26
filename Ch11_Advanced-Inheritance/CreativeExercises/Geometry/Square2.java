public class Square2 extends GeometricFigure2{
	
	public Square2(int x, int y){
		setHeight(y);
		setLength(x);
		setType("square");
		setArea();
	}
	
	public void setArea(){
		area=(double)(height*length);
	}
	
	public void display(){
		System.out.println("A "+getType()+" of height "+getHeight()+" and length "+
			getLength()+" has an area of "+getArea()+" square units.");
		displaySides();
	}
	
	public void displaySides(){
		System.out.println("It has 4 sides.");
	}
}
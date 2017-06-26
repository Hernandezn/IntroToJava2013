public class Square extends GeometricFigure{
	
	public Square(int x, int y){
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
	}
}
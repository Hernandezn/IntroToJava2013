public class Carpet{
	public static void main(String[]args){
		byte length=15;
		byte width=25;
		float perFoot=8.15F;
		System.out.println("The length of the room is "+length+
			" feet, the width of the room is "+width+
			" feet, and the price per square foot of carpeting is $"
			+perFoot+".\nThe total price of carpeting the room is $"
			+length*width*perFoot+".");
	}
}
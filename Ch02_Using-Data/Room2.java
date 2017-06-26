import java.util.Scanner;

public class Room2{
	public static void main(String[]args){
		Scanner key=new Scanner(System.in);
		
		System.out.print("Please enter the length of the room: ");
		byte length=key.nextByte();
		System.out.print("Please enter the width of the room: ");
		byte width=key.nextByte();
		
		System.out.println("The length of the room is "+length+
			" feet, and the width of the room is "+width+
			" feet.\nThe total area of the room is "+length*width+
			" square feet.");
	}
}
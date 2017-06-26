import java.nio.file.*;
import java.nio.*;
import static java.nio.file.StandardOpenOption.*;
import java.io.*;
import java.util.*;
import java.text.*;

public class LowerAndUpper{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int studentID=0, credHrs=0;
		String name, surname, IDString="", credString="", fullEntry, selection;
		boolean b=false, done=false;
		
		String delimiter=",";
		StringBuilder nameFormat;
		DecimalFormat ID=new DecimalFormat("0000000");
		DecimalFormat creds=new DecimalFormat("000");
		Path lower, upper;
		
		lower=Paths.get("Lowerclassmen.txt");
		upper=Paths.get("Upperclassmen.txt");
		
		try{
			OutputStream lowStr=new BufferedOutputStream(Files.newOutputStream(lower,
				CREATE, WRITE));
			BufferedWriter writeLower=new BufferedWriter(new OutputStreamWriter(
				lowStr));
			
			OutputStream upStr=new BufferedOutputStream(Files.newOutputStream(upper,
				CREATE, WRITE));
			BufferedWriter writeUpper=new BufferedWriter(new OutputStreamWriter(upStr));
			
			do{//master filewriting loop
				b=false;
				do{
					System.out.print("Enter the student's 7-digit ID number > ");
					try{
						studentID=input.nextInt();
						input.nextLine();
						
						if(studentID<0 || studentID>9999999)
							throw(new Exception());
						else{
							b=true;
							IDString=ID.format(studentID)+"";
						}
					}
					catch(Exception error){
						System.out.println("That's not a valid ID.");
					}
				}while(!b);//takes student ID number
				
				System.out.print("Please enter the student's first name > ");
				name=input.nextLine();
				nameFormat=new StringBuilder(name);
				nameFormat.setLength(10);
				name=nameFormat.toString();
				
				System.out.print("Enter the student's last name > ");
				surname=input.nextLine();//takes student name
				nameFormat=new StringBuilder(surname);
				nameFormat.setLength(10);
				surname=nameFormat.toString();
				
				b=false;
				do{
					System.out.print("Enter the student's total earned credits > ");
					try{
						credHrs=input.nextInt();
						input.nextLine();
						
						if(credHrs<0 || credHrs>999)
							throw(new Exception());
						else{
							b=true;
							credString=creds.format(credHrs)+"";
						}
					}
					catch(Exception error){
						System.out.println("That's not a valid number of hours.");
					}
				}while(!b);//takes credit hours
				
				fullEntry="ID "+IDString+delimiter+surname+delimiter+name+delimiter+
					credString+" credits"+System.getProperty("line.separator");
				
				if(credHrs<60){
					System.out.println("This student's credit hours sorts them with the "+
						"lowerclassmen.");
					writeLower.write(fullEntry, 0, fullEntry.length());
				}
				else{
					System.out.println("This student's credit hours sorts them with the "+
						"upperclassmen.");
					writeUpper.write(fullEntry, 0, fullEntry.length());
				}
				
				b=false;
				do{
					System.out.print("Would you like to enter another student? (Y/N) > ");
					selection=input.nextLine().charAt(0)+"";
					
					if(selection.equalsIgnoreCase("Y"))
						b=true;
					else if(selection.equalsIgnoreCase("N")){
						done=true;
						b=true;
					}
				}while(!b);//allows the user to enter another record or quit
			}while(!done);//end master write loop
			
			writeLower.close();
			writeUpper.close();
			
			System.out.println("\nThe records have been stored.");
		}
		catch(Exception error){
			System.out.println("Error: "+error.getMessage());
		}
	}
}
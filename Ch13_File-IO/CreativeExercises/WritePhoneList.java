import java.util.*;
import java.io.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;

public class WritePhoneList{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		Path file;
		String firstName, lastName, phoneNum;//main variables
		
		final int NAME_LENGTH=10;
		String delimiter=",";
		StringBuilder reformat;
		String[]array;
		boolean done, b;
		int x, y;
		String fullEntry, selection;//processing variables
		
		int recLength=0;//dev variable for determining record length
		
		file=Paths.get("WritePhone_Numbers.txt");
		
		try{
			OutputStream oStr=new BufferedOutputStream(Files.newOutputStream(file,
				CREATE, WRITE));
			BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(oStr));
			done=false;//keeps entries going
			
			do{
				b=false;
				System.out.print("Please enter the contact's first name > ");
				firstName=input.nextLine();
				reformat=new StringBuilder(firstName);
				reformat.setLength(NAME_LENGTH);
				firstName=reformat.toString();
				
				System.out.print("Enter the contact's last name > ");
				lastName=input.nextLine();
				reformat=new StringBuilder(lastName);
				reformat.setLength(NAME_LENGTH);
				lastName=reformat.toString();//accepts and properly formats name entry
				
				do{//phoneNum processing
					System.out.print("Enter the contact's phone number (###-###-####): ");
					phoneNum=input.nextLine();
					array=phoneNum.split("-");
					if(array.length==3){
						b=true;
						for(x=0; x<array.length; x++)
							for(y=0; y<array[x].length(); y++)
								if(!(Character.isDigit(array[x].charAt(y))))
									b=false;
						if(array[0].length()!=3 || array[1].length()!=3 ||
							array[2].length()!=4)
							b=false;
					}
					
					if(!b)
						System.out.println("Invalid format; please retype your entry.");
				}while(!b);//accepts only valid phone numbers
				
				fullEntry=lastName+delimiter+firstName+delimiter+phoneNum+
					System.getProperty("line.separator");
				if(recLength==0)
					recLength=fullEntry.length();//dev sideprocess
				
				writer.write(fullEntry, 0, recLength);//writes to the file
				
				b=false;
				do{
					System.out.print("Would you like to add another entry? (Y/N) > ");
					selection=input.nextLine().charAt(0)+"";
					
					if(selection.equalsIgnoreCase("N")){
						b=true;
						done=true;
					}
					else if(selection.equalsIgnoreCase("Y"))
						b=true;
				}while(!b);
			}while(!done);//accepts all entries
			writer.close();
			
			System.out.println("DEV LINE:::Entry is "+recLength);
		}
		catch(IOException error){
			System.out.println("Error: "+error.getMessage());
		}
	}
}
import java.nio.file.*;
import java.nio.channels.*;
import java.nio.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.text.*;
import java.util.*;

public class CreateBankFile{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		Path file;
		FileChannel fc;
		byte[]data;
		ByteBuffer buffer;
		StringBuilder process;
		int x;
		int IDEntry=0;
		double balEntry=0;
		String nameEntry="";
		String entry, fullEntry;
		boolean done=false, b;
		
		String delimiter=",";
		final int MAX_RECORDS=10000;
		final String DEF_ID="0000";
		final String DEF_NAME="        ";
		final String DEF_BALANCE="00000.00";
		final String DEF_RECORD=DEF_ID+delimiter+DEF_NAME+delimiter+DEF_BALANCE+
			System.getProperty("line.separator");
		final int RECLENGTH=DEF_RECORD.length();
		final int NAMELENGTH=DEF_NAME.length();
		DecimalFormat balFormat=new DecimalFormat(DEF_BALANCE);
		DecimalFormat IDFormat=new DecimalFormat(DEF_ID);
		
		file=Paths.get("BankFile.txt");
		
		try{
			OutputStream oStr=new BufferedOutputStream(Files.newOutputStream(file,
				CREATE, WRITE));
			BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(oStr));
			
			for(x=0; x<MAX_RECORDS; x++)
				writer.write(DEF_RECORD, 0, DEF_RECORD.length());
			
			writer.close();
		}
		catch(IOException error){
			System.out.println("IO Exception");
		}//bank file created
		
		try{
			fc=(FileChannel)Files.newByteChannel(file, WRITE);
			
			data=DEF_RECORD.getBytes();
			buffer=ByteBuffer.wrap(data);
			
			do{
				b=false;
				do{
					System.out.print("Enter the new account number (up to 9999) > ");
					try{
						IDEntry=input.nextInt();
						input.nextLine();
						if(IDEntry<0 || IDEntry>=MAX_RECORDS)
							throw(new Exception());
						
						b=true;
					}
					catch(Exception e){
						System.out.println("That's an invalid account number.");
					}
				}while(!b);
				fc.position(IDEntry*RECLENGTH);//takes ID and sets appropriate position
				
				System.out.print("Please enter the customer's last name > ");
				nameEntry=input.nextLine();
				process=new StringBuilder(nameEntry);
				process.setLength(NAMELENGTH);
				nameEntry=process.toString();//takes and properly formats name
				
				b=false;
				do{
					System.out.print("Enter the customer's account balance > ");
					try{
						balEntry=input.nextDouble();
						input.nextLine();
						if(balEntry<0 || balEntry>99000)
							throw(new Exception());
						
						b=true;
					}
					catch(Exception e){
						System.out.println("That's not a valid balance.");
					}
				}while(!b);//takes valid balance
				
				fullEntry=IDFormat.format(IDEntry)+delimiter+nameEntry+delimiter+
					balFormat.format(balEntry)+System.getProperty("line.separator");
				data=fullEntry.getBytes();
				buffer=ByteBuffer.wrap(data);
				fc.write(buffer);//writes the data to file at appropriate position
				
				b=false;
				do{
					System.out.print("Would you like to enter another record? (Y/N) > ");
					entry=input.nextLine().charAt(0)+"";
					
					if(entry.equalsIgnoreCase("Y"))
						b=true;
					else if(entry.equalsIgnoreCase("N")){
						b=true;
						done=true;
					}
				}while(!b);//determines if user is finished
			}while(!done);
			
			fc.close();
			System.out.println("Accounts successfully recorded.");
		}
		catch(Exception error){
			System.out.println("Error: "+error.getMessage());
		}
	}
}
import java.nio.file.*;
import java.nio.*;
import static java.nio.file.StandardOpenOption.*;
import java.io.*;
import java.util.*;
import java.nio.channels.*;
import java.text.*;

public class CreateCustomerFile{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int x;
		byte[]data;
		String[]record;
		String IDEntry="", name="", zipEntry="", fullEntry, process;
		StringBuilder sb;
		int ID=0, zip=0;
		boolean b, done=false;
		
		String delimiter=",";
		final String DEF_ID="000";
		final String DEF_NAME="      ";
		final String DEF_ZIP="00000";
		final String DEF_RECORD=DEF_ID+delimiter+DEF_NAME+delimiter+DEF_ZIP+
			System.getProperty("line.separator");
		final int RECLENGTH=DEF_RECORD.length();
		final int RECORDS=1000;
		DecimalFormat IDFormat=new DecimalFormat(DEF_ID);
		DecimalFormat zipFormat=new DecimalFormat(DEF_ZIP);
		
		Path file=Paths.get("CustomerFile.txt");
		data=new byte[RECLENGTH];
		for(byte d: data)
			d=0;
		
		try{
			OutputStream oStr=new BufferedOutputStream(Files.newOutputStream(file,
				CREATE, WRITE));
			BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(oStr));
			
			for(x=0; x<RECORDS; x++)
				writer.write(DEF_RECORD);
			
			writer.close();
			System.out.println("The customer file is primed for input.");
		}
		catch(Exception error){
			System.out.println("Error: "+error.getMessage());
		}//primes a file for input
		
		try{
			FileChannel fc=(FileChannel)Files.newByteChannel(file, READ, WRITE);
			ByteBuffer buffer=ByteBuffer.wrap(data);
			
			do{
				b=false;
				do{
					System.out.print("Enter the customer's ID number > ");
					IDEntry=input.nextLine();
					try{
						ID=Integer.parseInt(IDEntry);
						if(ID<0 || ID>999)
							throw(new Exception("ID not in range (0-999)."));
						
						fc.position(ID*RECLENGTH);
						fc.read(buffer);
						buffer.rewind();
						process=new String(data);
						record=process.split(delimiter);
						
						if(Integer.parseInt(record[0])==ID)
							throw(new Exception("That ID number is already taken."));
						
						b=true;
					}
					catch(Exception error){
						System.out.println("Error: "+error.getMessage());
					}
				}while(!b);//takes only valid, unoccupied ID numbers
				IDEntry=IDFormat.format(ID);
				
				System.out.print("Enter the customer's name > ");
				name=input.nextLine();
				sb=new StringBuilder(name);
				sb.setLength(DEF_NAME.length());
				name=sb.toString();//takes and properly formats name entry
				
				b=false;
				do{
					System.out.print("Enter the customer's ZIP code > ");
					zipEntry=input.nextLine();
					try{
						zip=Integer.parseInt(zipEntry);
						if(zip<0 || ID>99999)
							throw(new Exception("ZIP not in range (0-99999)."));
						
						b=true;
					}
					catch(Exception error){
						System.out.println("Error: "+error.getMessage());
					}
				}while(!b);//takes only valid ZIP codes
				zipEntry=zipFormat.format(zip);
				
				fullEntry=IDEntry+delimiter+name+delimiter+zipEntry+System.getProperty(
					"line.separator");
				data=fullEntry.getBytes();
				buffer=ByteBuffer.wrap(data);//primes data for sending to file
				
				fc.position(ID*RECLENGTH);
				fc.write(buffer);
				buffer.rewind();
				
				b=false;
				do{
					System.out.print("Would you like to enter another customer record? "+
						"(Y/N) > ");
					process=input.nextLine().charAt(0)+"";
					
					if(process.equalsIgnoreCase("Y"))
						b=true;
					else if(process.equalsIgnoreCase("N")){
						b=true;
						done=true;
					}
				}while(!b);//repeat choice
			}while(!done);
			
			fc.close();
			System.out.println("Data successfully recorded.");
		}
		catch(Exception error){
			System.out.println("Error: "+error.getMessage());
		}
	}
}
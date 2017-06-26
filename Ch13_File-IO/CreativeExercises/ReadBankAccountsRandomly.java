import java.nio.file.*;
import java.util.*;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import static java.nio.file.StandardOpenOption.*;

public class ReadBankAccountsRandomly{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		byte[]data;
		String[]array;
		ByteBuffer buffer;
		final int RECLENGTH=24;
		final String delimiter=",";
		final String QUIT="0000";
		final String NULL_RECORD="0000";
		String entry="";
		int choice=0;
		boolean b=false;
		
		Path file=Paths.get("BankFile.txt");
		data=new byte[RECLENGTH];
		for(byte d: data)
			d=0;
		buffer=ByteBuffer.wrap(data);//initializes required complex variables
		
		try{
			FileChannel fc=(FileChannel)Files.newByteChannel(file, READ);
			
			do{
				System.out.print("Enter the account number of the bank record you'd like"+
					" to view > ");
				entry=input.nextLine();
				try{
					choice=Integer.parseInt(entry);
					if(choice<0 || choice>9999)
						throw(new Exception());
					
					b=true;
				}
				catch(Exception e){
					System.out.println("That's not a valid account number.");
				}
			}while(!b);
			
			while(!entry.equals(QUIT)){
				fc.position(choice*RECLENGTH);
				fc.read(buffer);
				buffer.rewind();
				
				entry=new String(data);
				array=entry.split(delimiter);
				
				if(array[0].equals(NULL_RECORD))
					System.out.println("No account is registered to that number.");
				else
					System.out.println("Account number "+array[0]+delimiter+" surname "+
						array[1]+delimiter+" balance $"+array[2]);
				
				b=false;
				do{
					System.out.print("Enter another account number, or enter "+QUIT+" to "+
						"quit > ");
					entry=input.nextLine();
					try{
						choice=Integer.parseInt(entry);
						if(choice<0 || choice>9999)
							throw(new Exception());
						
						b=true;
					}
					catch(Exception e){
						System.out.println("That's not a valid account number.");
					}
				}while(!b);
			}
			
			fc.close();
			System.out.println("File closed successfully.");
		}
		catch(Exception e){
			System.out.println("Error: "+e.getMessage());
		}
	}
}
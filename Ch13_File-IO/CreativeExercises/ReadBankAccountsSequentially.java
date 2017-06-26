import java.nio.file.*;
import java.nio.*;
import java.io.*;
import java.text.*;
import static java.nio.file.StandardOpenOption.*;

public class ReadBankAccountsSequentially{
	public static void main(String[]args){
		String[]array;
		int x;
		String data;
		final String delimiter=",";
		int recLength=0;
		final int MAX_RECORDS=10000;
		final String NULL_ID="0000";
		DecimalFormat df=new DecimalFormat("00000.00");
		
		Path file=Paths.get("BankFile.txt");
		
		try{
			InputStream iStr=new BufferedInputStream(Files.newInputStream(file, READ));
			BufferedReader reader=new BufferedReader(new InputStreamReader(iStr));
			
			for(x=0; x<MAX_RECORDS; x++){
				data=reader.readLine()+System.getProperty("line.separator");
				array=data.split(delimiter);
				
				if(recLength==0)
					recLength=data.length();
				
				if(!array[0].equals(NULL_ID))
					System.out.println("Account number "+array[0]+delimiter+" surname "+
						array[1]+delimiter+" balance $"+df.format(
						Double.parseDouble(array[2])));
			}
			
			System.out.println("All non-blank records are now accounted for.");
			System.out.println("Record length is "+recLength+".");
		}
		catch(Exception e){
			System.out.println("Error: "+e.getMessage());
		}
	}
}
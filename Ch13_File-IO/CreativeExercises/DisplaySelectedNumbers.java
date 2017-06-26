import java.util.*;
import java.nio.file.*;
import java.io.*;
import java.nio.*;
import static java.nio.file.StandardOpenOption.*;

public class DisplaySelectedNumbers{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		final int NAME_LENGTH=10;
		String delimiter=",";
		Path file;
		StringBuilder reformat;
		String entry, line;
		String[]record;
		
		file=Paths.get("WritePhone_Numbers.txt");
		
		try{
			InputStream iStr=new BufferedInputStream(Files.newInputStream(file, READ));
			BufferedReader reader=new BufferedReader(new InputStreamReader(iStr));
			System.out.print("Enter the first name of the contact you wish to "+
				"display > ");
			entry=input.nextLine();
			
			reformat=new StringBuilder(entry);
			reformat.setLength(NAME_LENGTH);
			entry=reformat.toString();
			
			line=reader.readLine();
			while(line!=null){
				record=line.split(delimiter);
				if(entry.equalsIgnoreCase(record[1])){
					line=record[0]+delimiter+record[2];
					System.out.println(line);
				}
				line=reader.readLine();
			}
			
			reader.close();
		}
		catch(Exception error){
			System.out.println("Error: "+error.getMessage());
		}
	}
}
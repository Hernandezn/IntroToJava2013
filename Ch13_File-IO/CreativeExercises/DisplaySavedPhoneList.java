import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class DisplaySavedPhoneList{
	public static void main(String[]args){
		Path file=Paths.get("WritePhone_Numbers.txt");
		String input;
		
		System.out.println("Phone contacts on record: ");
		try{
			InputStream iStr=new BufferedInputStream(Files.newInputStream(file, READ));
			BufferedReader reader=new BufferedReader(new InputStreamReader(iStr));
			
			input=reader.readLine();
			while(input!=null){
				System.out.println(input);
				input=reader.readLine();
			}
			reader.close();
		}
		catch(IOException error){
			System.out.println("IO Exception");
		}
	}
}
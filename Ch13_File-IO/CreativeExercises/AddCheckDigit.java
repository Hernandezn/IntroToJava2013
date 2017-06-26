import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.nio.*;

public class AddCheckDigit{
	public static void main(String[]args){
		Path file;
		Path write;
		String data;
		int num, check;
		int x=0;
		InputStream iStr;
		OutputStream oStr;
		BufferedReader reader;
		BufferedWriter writer;
		
		file=Paths.get("AddCheckPre.txt");
		write=Paths.get("AddCheckPost.txt");
		
		try{
			iStr=new BufferedInputStream(Files.newInputStream(file, READ));
			reader=new BufferedReader(new InputStreamReader(iStr));
			
			oStr=new BufferedOutputStream(Files.newOutputStream(write, CREATE, WRITE));
			writer=new BufferedWriter(new OutputStreamWriter(oStr));
			
			data=reader.readLine();
			while(data!=null){
				num=Integer.parseInt(data);
				check=num%7;
				
				data+="-"+check+System.getProperty("line.separator");
				writer.write(data, 0, data.length());
				
				data=reader.readLine();
			}
			
			reader.close();
			writer.close();
		}
		catch(Exception error){
			System.out.println("Error: "+error.getMessage());
		}
	}
}
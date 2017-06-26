import java.nio.file.*;
import java.nio.*;
import java.nio.channels.*;
import java.util.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class SeekPosition{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		String entry;
		int location=0;
		Path file;
		FileChannel fc=null;
		int RECLENGTH=20;
		byte[]data=new byte[RECLENGTH];
		boolean b=false;
		ByteBuffer buffer;
		int x;
		
		for(x=0; x<RECLENGTH; x++)
			data[x]=0;
		buffer=ByteBuffer.wrap(data);
		
		try{
			System.out.print("Enter the name of the file you wish to access (include "+
				"filetype extension) > ");
			entry=input.nextLine();
			
			file=Paths.get(entry);
			fc=(FileChannel)Files.newByteChannel(file, READ);
			
			do{
				System.out.print("Enter the starting position of the file piece you'd "+
					"like to read > ");
				try{
					location=input.nextInt();
					input.nextLine();
					b=true;
				}
				catch(Exception e){
					System.out.println("Invalid entry; try again.");
				}
			}while(!b);
			
			fc.position(location);
			fc.read(buffer);
			
			entry=new String(data);
			System.out.println("The returned data:\n"+entry);
			fc.close();
		}
		catch(IOException error){
			System.out.println("No such file exists in this program's search range.");
		}
	}
}
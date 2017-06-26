import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;

public class FileStatistics3{
	public static void main(String[]args){
		
		try{
			Path fs=Paths.get("FileStatistics2.java").toAbsolutePath();
			BasicFileAttributes attr=Files.readAttributes(fs,
				BasicFileAttributes.class);
			
			System.out.println("File name: "+fs.getFileName());
			System.out.println("Size: "+attr.size()+" bytes");
			System.out.println("Creation time: "+attr.creationTime());
			System.out.println("Last modified: "+attr.lastModifiedTime());
		}
		catch(Exception error){
			System.out.println("Error: "+error.getMessage());
		}
	}
}
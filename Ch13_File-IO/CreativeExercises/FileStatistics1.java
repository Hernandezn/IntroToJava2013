import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.*;

public class FileStatistics1{
	public static void main(String[]args){
		
		try{
			Path file=Paths.get("FileStatistics.java").toAbsolutePath();
			BasicFileAttributes attr=Files.readAttributes(file,
				BasicFileAttributes.class);
			
			System.out.println("File name: "+file.getFileName());
			System.out.println("File size: "+attr.size());
			System.out.println("Creation time: "+attr.creationTime());
			System.out.println("Last Modified Time: "+attr.lastModifiedTime());
		}
		catch(IOException error){
			System.out.println("IO Exception");
		}
	}
}
import java.nio.file.attribute.*;
import java.nio.file.*;
import java.io.*;

public class FileStatistics{
	public static void main(String[]args){
		
		try{
			Path file=Paths.get("FileStatisticsTest.txt").toAbsolutePath();
			BasicFileAttributes attribute=Files.readAttributes(file,
				BasicFileAttributes.class);
			
			System.out.println("File name: "+file.getFileName());
			System.out.println("File size: "+attribute.size());
			System.out.println("Time of creation: "+attribute.creationTime());
			System.out.println("Time last modified: "+attribute.lastModifiedTime());
		}
		catch(IOException e){
			System.out.println("IO Exception");
		}
	}
}
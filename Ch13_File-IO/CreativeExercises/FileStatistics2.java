import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.*;

public class FileStatistics2{
	public static void main(String[]args){
		
		try{
			Path note=Paths.get("quote.txt").toAbsolutePath();
			Path doc=Paths.get("quote.docx").toAbsolutePath();
			
			BasicFileAttributes noteAttr=Files.readAttributes(note,
				BasicFileAttributes.class);
			BasicFileAttributes docAttr=Files.readAttributes(doc,
				BasicFileAttributes.class);
			
			System.out.println("The file "+note.getFileName()+" is "+noteAttr.size()
				+" bytes.");
			System.out.println("The file "+doc.getFileName()+" is "+docAttr.size()+
				" bytes.");
			
			System.out.println(doc.getFileName()+" is "+
				(docAttr.size()/noteAttr.size())+" times as large as "+
				note.getFileName()+".");
		}
		catch(Exception error){
			System.out.println("Error: "+error.getMessage());
		}
	}
}
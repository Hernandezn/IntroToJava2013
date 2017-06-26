import java.nio.file.*;
import java.io.*;

public class SameFolder{
	public static void main(String[]args){
		int num1, numA;
		Path folder1, folderA;
		
		try{
			Path file1=Paths.get("SameFolderTest1.txt").toAbsolutePath();
			Path fileA=Paths.get("SameFolderTestA.txt").toAbsolutePath();
			
			num1=file1.getNameCount()-1;
			numA=fileA.getNameCount()-1;
			
			folder1=file1.getName(num1-1).toAbsolutePath();
			folderA=fileA.getName(numA-1).toAbsolutePath();
			
			if(folder1.toString().equals(folderA.toString()))
				System.out.println(file1.getFileName()+" and "+fileA.getFileName()+" are"
					+" in the same folder.");
			else
				System.out.println(file1.getFileName()+" and "+fileA.getFileName()+" are"
					+" not in the same folder.");
		}
		catch(Exception error){
			System.out.println("Exception");
		}
	}
}
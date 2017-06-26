import java.nio.file.*;
import java.io.IOException;
import static java.nio.file.AccessMode.*;

public class FindSelectedFiles{
	public static void main(String[]args){
		Path[]array={Paths.get("autoexec.bat"), Paths.get("SameFolder.java"),
			Paths.get("FileStatistics.class"), Paths.get("Hello.java")};
		int x;
		
		for(x=0; x<array.length; x++){
			System.out.println("\n"+array[x].getFileName()+":");
			if(Files.exists(array[x]))
				System.out.println("This file shares a folder with this program.");
			else
				System.out.println("No such file exists in this folder.");
		}
	}
}
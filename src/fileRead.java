import java.io.*;
import java.util.ArrayList;
import java.util.Vector;
import java.util.Scanner;

public class fileRead {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fName = "";
		
		System.out.println("Please input file name: \n");
		Scanner scan = new Scanner (System.in);
		fName = scan.nextLine();
		
		File fAccess = new File (fName);
		
		if (fAccess.exists()) {
			System.out.println("File Accessed!");
		}
		else {
			System.out.println("File not found! \nexiting...");
			return;
		}
		String line = "";
		//FileReader fRead = new FileReader (fName);
		
		//if (fAccess) 					// FIX ME: CHECK IF FILE IS EMPTY OR EVEN A TXT FILE!
		
		try (FileReader fRead = new FileReader (fName); // FIX ME: PARSE TXT FILE FOR DESIRED INPUT AND ESTABLISH CHECKS!
			 Scanner scanFile = new Scanner (fRead);){
			line = scanFile.next();
			while (line != null) {
				
			}
			
		}
		catch(IOException e){
			System.out.println ("Error! " + e);
		}
		
		
		
	}

}

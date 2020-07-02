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
		
		//FileReader fRead = new FileReader (fName);
		
		
		try (FileReader fRead = new FileReader (fName); 
			 BufferedReader bRead = new BufferedReader (fRead);){
			
			
		}
		catch(IOException e){
			System.out.println ("Error! " + e);
		}
		
		
		
	}

}

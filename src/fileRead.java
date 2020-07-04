import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Vector;
import java.util.Scanner;
import java.util.TreeMap;

public class fileRead {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fName = "";
		Vector <String> revWords = new Vector <String> ();		// Vector for storing reversed words form file
		System.out.println("Please input file name: \n");
		Scanner scan = new Scanner (System.in);
		fName = scan.nextLine();
		String temp = "";
		TreeMap <String, Integer> stringSet = new TreeMap <String, Integer> ();
		
		File fAccess = new File (fName);
		
		if (fAccess.exists()) {				// checks if file exists and can be accessed
			System.out.println("File Accessed!");
		}
		else {
			System.out.println("File not found! \nexiting...");
			return;
		}
		String line = "";
		//FileReader fRead = new FileReader (fName);
		
		//if (fAccess) 					// FIX ME: CHECK IF IS EVEN A TXT FILE!
		
		if (fAccess.length() == 0) {	// Checks if file is empty or not
			System.out.println("The file is empty!\nexiting...");
			return;
		}
		
		try (FileReader fRead = new FileReader (fName);
			 Scanner scanFile = new Scanner (fRead);){
			//line = scanFile.next();
			while (scanFile.hasNext()) {
				line = scanFile.next();
				
				
				/*
				for (int i = line.length() - 1; ((i >= 0) && (line.length() > 3)); i--) {
					temp += line.charAt(i);
				}
				*/
				
				if (line.length() > 3) {
					if (!stringSet.containsKey(line)) {
						stringSet.put(line, 1);
					}
					else {
						stringSet.put(line, stringSet.get(line) + 1);
					}
					//revWords.add(line);
				}
				//System.out.println(line + "\n");
				//temp = "";
			}
			//System.out.println ("I got till here!");
			/*
			for (Map.Entry <String, Integer> i: stringSet.entrySet()) {
				System.out.println ("I got till here! " + i);				
			}
			*/
			
			for (Map.Entry <String, Integer> i: stringSet.entrySet()) { 
				//System.out.println ("I got till here! " + i);
				
				if (stringSet.get(i.getKey()) >= 5) {
					//System.out.println ("I got till here!");
					
					for (int j = i.getKey().length() - 1; j >= 0; j--) {
						temp = Character.isLetter(i.getKey().charAt(j)) ? temp + i.getKey().charAt(j) : temp;
					}
					//System.out.println ("I got till here!");
					
					System.out.println (temp);
					
					revWords.add(temp);
					temp = "";
				}
			}
			
			scanFile.close();
		}
		catch(IOException e){
			System.out.println ("Error! " + e);
		}
		
		scan.close();
		
		
	}

}

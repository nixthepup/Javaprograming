import java.util.Scanner;
import java.io.*;

public class file4_6{

	public static void main(String[] args) throws IOException{
		
	
		Scanner input = new Scanner(System.in);
		
	
		
		System.out.print("Enter file name: ");
		String fileName = input.nextLine();

	
		File file = new File(fileName);
		
		
		if(!file.exists()){
			System.out.println("The file " + fileName + " does not exist.");
			System.exit(0);
		}
	
		Scanner fileInput = new Scanner(file);
		
				
		
		System.out.println("Enter a single character: ");
		String charInput = input.nextLine();
		char character = charInput.charAt(0);
		
		
	
		String line; 
		
		
		int count = 0;
		

		while(fileInput.hasNext()){
			line = fileInput.nextLine();
			for(int j=0; j<line.length(); j++){
				if(line.charAt(j)==character){
					count += 1;
				}
			}
		}
		
	
		System.out.println("The character " + character + " appears in the file " + count + " times.");
		
	
		fileInput.close();
	}
}

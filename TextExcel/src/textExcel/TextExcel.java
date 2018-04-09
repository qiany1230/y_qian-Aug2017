package textExcel;

import java.util.Scanner;

import java.io.FileNotFoundException;
public class TextExcel {
	
	public static void main(String[] args) {
		
	    Scanner userinput = new Scanner(System.in);
	    Spreadsheet mySpreadsheet = new Spreadsheet();
	    String command = userinput.nextLine();
	    	while (!command.toLowerCase().equals("quit")) {
	    		System.out.println(mySpreadsheet.processCommand(command));
	    		command = userinput.nextLine();
	    	}
	    	userinput.close();
	}

	
}
 


<<<<<<< HEAD
package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

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
 
=======
package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

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
 

>>>>>>> branch 'master' of https://github.com/qiany1230/y_qian-Aug2017.git

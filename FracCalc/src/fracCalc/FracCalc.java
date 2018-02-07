package fracCalc;

import java.util.Scanner;
public class FracCalc {

    public static void main(String[] args) 
    {
        //  Read the input from the user and call produceAnswer with an equation
    	Scanner userinput = new Scanner(System.in);
    	String question = userinput.nextLine();
    	String end = "quit";
    	while (question != end) {
    		System.out.println(produceAnswer(question));
    	}
    	userinput.close();
	}
    
    public static String produceAnswer(String input)
    { 
        //  Implement this function to produce the solution to the input

        Fraction answer = new Fraction();
    	return answer.toString();
    	//create string to return
    	
    }
    
   
    }
package fracCalc;
import java.util.*;
public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner userinput = new Scanner(System.in);
    	String question = userinput.nextLine();
    	String end = "quit";
    	while (question == end) {
		System.out.println(produceAnswer(question));
		userinput.close();
    	}
	}
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
    	String[] arr = input.split(" ");
    	String one = arr[0];
    	String two = arr[1];
    	String three = arr[2];
    	splitOperands(three);
    	String finaloutput = (splitOperands(input));
    	return finaloutput;
    }
    
    public static String splitOperands(String input2) {
    // TODO: Fill in the space below with any helper methods that you think you will need
    	if (input2.contains("_") && input2.contains("/")){
    		//limited
    		String[] arr2 = input2.split("_");
    		String one1 = arr2[0];
    		String two = arr2[1];
    		String[] arr3 = two.split("/");
    		String before = arr3[0];
    		String after = arr3[1];
        	String finaloutput = "whole:" + one1 + " numerator:" + before + " denominator:" + after;
        	return finaloutput;
    	}
    	else if (input2.contains("/")) {
    		//fraction
    		String[] frac = input2.split("/");
    		String top = frac[0];
    		String bot = frac[1];
    		String finaloutput = "whole:0 numerator:" + top + " denominator:" + bot;
    		return finaloutput;
    	}
        else {
        	//whole
        	String finaloutput2 = "whole:" + input2 + "numerator:0 denominator:1";
        	return finaloutput2;
        }
    	
    	
    }
}

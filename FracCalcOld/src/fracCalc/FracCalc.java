package fracCalc;
import java.util.*;
public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner userinput = new Scanner(System.in);
    	String question = userinput.nextLine();
    	String end = "quit";
    	while (question != end) {
    		System.out.println(produceAnswer(question));
    	}
    	userinput.close();
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
    	String operand1 = arr[0];
    	String operator = arr[1];
    	String operand2 = arr[2];
    
    	String[] operand3 = (splitOperands(operand2));
    	//create string to return
    	String finaloutput = "whole:" + operand3[0] + " numerator:" + operand3[1]+ " denominator:" + operand3[2];
    	return finaloutput;
    }
    
    public static String[] splitOperands(String operand) {
    // TODO: Fill in the space below with any helper methods that you think you will need
    	String whole="0";
    	String num="0";
    	String den="1";
    	if (operand.contains("_") && operand.contains("/")){
    		String[] arr2 = operand.split("_");
    		whole = arr2[0];
    		String frac = arr2[1];
    		String[] fractionParts = frac.split("/");
    		num = fractionParts[0];
    		den = fractionParts[1];
    	}
    	else if (operand.contains("/")) {
    		//fraction
    		String[] frac = operand.split("/");
    		num = frac[0];
    		den = frac[1];
    	}
        else {
        	//whole
        	whole = operand;
        }
    	
    	String[] parsed = {whole, num, den};
    	return parsed;
    }
}

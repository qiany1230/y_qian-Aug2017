package fracCalc;


//instance variables
public class Fraction {
	private int whole;
	private int numerator;
	private int denominator;	


/* constructor -- takes the string operand as an input, divide them to whole, num, and denom, and turns them 
 * into instance variables
 */
	public Fraction (String operand) {
		whole=0;
		numerator =0;
		denominator=1;
	//	????  = splitOperands(operand));
		splitOperands(operand);
		
		
    	return;
	}
	
	  public void splitOperands(String operand) {
		    //  Fill in the space below with any helper methods that you think you will need
		    	
		    	if (operand.contains("_") && operand.contains("/")){
		    		String[] arr2 = operand.split("_");
		    		whole = Integer.parseInt(arr2[0]);
		    		String frac = arr2[1];
		    		String[] fractionParts = frac.split("/");
		    		numerator = Integer.parseInt(fractionParts[0]);
		    		denominator = Integer.parseInt(fractionParts[1]);
		    	}
		    	else if (operand.contains("/")) {
		    		//fraction
		    		String[] frac = operand.split("/");
		    		numerator = Integer.parseInt(frac[0]);
		    		denominator = Integer.parseInt(frac[1]);
		    	}
		        else {
		        	//whole
		        	whole = Integer.parseInt(operand);
		        }
		    	
		    }
   
	
	public void toMixedNumber() {

	}
		
	public void toImproper() {
			
	}
		
	public int toInt(String str) {
			
	}
		
	public void simplify() {
			
	}
		
	public String toString() {
		String finaloutput = "whole:" + whole + " numerator:" + numerator + " denominator:" + denominator;
    	return finaloutput;
	}
}
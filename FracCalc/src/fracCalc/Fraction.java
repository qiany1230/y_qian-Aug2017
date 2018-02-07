package fracCalc;


//instance variables
public class Fraction {
	private int whole;
	private int numerator;
	private int denominator;	


/* constructor -- takes the string operand as an input, divide them to whole, num, and denom, and turns them 
 * into instance variables
 */
	public String Fraction (String operand) {
		whole= 0;
		numerator = 0;
		denominator = 1;
		String answer1 = "0";
	//	????  = splitOperands(operand));
		parseOperand(operand);
		this.whole = 0;
		this.numerator = 0;
		this.denominator = 0;
		  
		String[] arr = operand.split(" ");
    		String operand1 = arr[0];
    		String operator = arr[1];
    		String operand2 = arr[2];
		 int[] firstOperand = new int[3];
	        int[] secondOperand = new int[3];
	        //can't divide by 0, undefined
	        int[] impropOperand1 = toImproperFrac(firstOperand[0], firstOperand[1], firstOperand[2]);
	        int[] impropOperand2 = toImproperFrac(secondOperand[0], secondOperand[1], secondOperand[2]);
	        int[] answer = new int[2];
	        if(operator.equals("*")){
	        	answer = multiply(impropOperand1[0], impropOperand1[1], impropOperand2[0], impropOperand2[1]);
	        } else if(operator.equals("+")){
	        	answer = add(impropOperand1[0], impropOperand1[1], impropOperand2[0], impropOperand2[1]);
	        } else if(operator.equals("/")){
	        	answer = divide(impropOperand1[0], impropOperand1[1], impropOperand2[0], impropOperand2[1]);
	        } else if(operator.equals("-")){
	        	answer = subtract(impropOperand1[0], impropOperand1[1], impropOperand2[0], impropOperand2[1]);
	        } else{
	        }
	        int factor = gcf(answer[0], answer[1]); 
	        int numer = answer[0] / factor;
	        int denom = answer[1] / factor;
	        int[] mixedOperand = toMixedNumber(numer, denom);
	        if(mixedOperand[1] == 0){
	        	answer1 = mixedOperand[0] + "";
	        } else if(mixedOperand [0] == 0){
	        	answer1 = mixedOperand[1] + "/" + mixedOperand[2];
	        } else{
	        	answer1 = mixedOperand[0] + "_" + absValue(mixedOperand[1]) + "/" + absValue(mixedOperand[2]);
	        }
    	return answer1;
	}
	
	  public void parseOperand(String operand) {
		   
		    	if (operand.contains("_") && operand.contains("/")){
		    		String[] arr2 = operand.split("_");
		    		this.whole = Integer.parseInt(arr2[0]);
		    		String frac = arr2[1];
		    		String[] fractionParts = frac.split("/");
		    		this.numerator = Integer.parseInt(fractionParts[0]);
		    		this.denominator = Integer.parseInt(fractionParts[1]);
		    	}
		    	else if (operand.contains("/")) {
		    		//fraction
		    		String[] frac = operand.split("/");
		    		this.numerator = Integer.parseInt(frac[0]);
		    		this.denominator = Integer.parseInt(frac[1]);
		    	}
		        else {
		        	//whole
		        	this.whole = Integer.parseInt(operand);
		        }
		    	
		    }
   
	
	public int[] toMixedNumber(int numerator, int denominator) {
		int whole = this.numerator / this.denominator;
		int num = this.numerator % this.denominator;
		int[] mixedNum = new int[3];
		if(this.numerator % denominator != 0){
			mixedNum[0] = whole; 
			mixedNum[1] = num;
			mixedNum[2] = this.denominator;
		} else{
			mixedNum[0] = this.whole;
		}
		return mixedNum;
	}
		
	  public int[] toImproperFrac(int wholeNum, int numerator, int denominator){
		if(this.whole < 0){
			this.numerator = (this.whole * this.denominator) - this.numerator;
    	} else{
    		this.numerator = (this.whole * this.denominator) + this.numerator;
    	}
    	int[] impropFrac = new int[2];
    	impropFrac[0] = this.numerator; 
    	impropFrac[1] = this.denominator;
      	return impropFrac;
	}
	
    public static int gcf(int numerator, int denominator){
    	if (numerator == 0){
			return denominator;
		}
		if (denominator == 0){
			return numerator;
		}
		if (numerator % denominator == 0){
			return denominator;
		}
		else{
			return gcf(denominator, numerator%denominator);
		}
    }
		
    public static int[] multiply(int numer1, int denom1, int numer2, int denom2){
    	int numer = numer1 * numer2;
    	int denom = denom1 * denom2;
    	int[] newFraction = {numer, denom};
    	return newFraction;
    }
    
    public static int[] divide(int numer1, int denom1, int numer2, int denom2){
    	int newNumer = numer1 * denom2;
    	int newDenom = numer2 * denom1;
    	int[] newFraction = {newNumer, newDenom};
    	return newFraction;
    }
    
    public static int[] add(int numer1, int denom1, int numer2, int denom2){
    	int newNumer;
    	int newDenom;
    	if(denom1 != denom2){
    		newDenom = denom1 * denom2;
    		newNumer = (numer1 * denom2) + (numer2 * denom1);
    	} else{
    		newDenom = denom1;
    		newNumer = numer1 + numer2;
    	}
    	int[] newFraction = {newNumer, newDenom};
    	return newFraction;
    }
    
    public static int[] subtract(int numer1, int denom1, int numer2, int denom2){ 
    	int numer;
    	int denom;
    	if(denom1 != denom2){
    		denom = denom1 * denom2;
    		numer = (numer1 * denom2) - (numer2 * denom1);
    	} else{
    		denom = denom1;
    		numer = numer1 - numer2;
    	}
    	int[] newFraction = {numer, denom};
    	return newFraction;
    }
    
    public static int absValue(int num){
    	if(num < 0){
    		return (num * -1);
    	} else{
    		return num;
    	}
    }
    
	//public int toInt(String str) {
			
	//}
		
	public String toString() {
		String finaloutput = "whole:" + whole + " numerator:" + numerator + " denominator:" + denominator;
    	return finaloutput;
	}
}

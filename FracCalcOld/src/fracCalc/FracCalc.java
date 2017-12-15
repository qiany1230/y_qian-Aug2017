// Ying Qian
package fracCalc;
import java.util.*;

public class FracCalc {

	public static void main(String[] args) 
    {
    	String userInput = "";
    	Scanner scanInput = new Scanner(System.in);
    	while(userInput != "quit"){
    		userInput = scanInput.nextLine();
    		System.out.println(produceAnswer(userInput));
    	}
    }

    public static String produceAnswer(String input)
    { 
        String[] splitStr = input.split(" ");
        String operand1 = splitStr[0];
        String operator = splitStr[1];
        String operand2 = splitStr[2];
        int[] firstOperand = new int[3];
        int[] secondOperand = new int[3];
        // Creates new Arrays for each Operand. 
        // Does this so does not have to make an int represent a type of the operator during parseOperand. 
        firstOperand = parseOperand(operand1);
        if(firstOperand[2] == 0){
        	return("ERROR: Cannot divide by zero.");
        }
        secondOperand = parseOperand(operand2);
        if(secondOperand[2] == 0){
        	return("ERROR: Cannot divide by zero.");
        }
    	// Cannot divide by 0.
    	// Return  error message if denom is 0.
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
        	//Extra credit
        	//Return error message if the input is of an invalid format (i.e "++", "--", "-+", etc.)
        	return("ERROR: Input is in an invalid format.");
        }
        int factor = gcf(answer[0], answer[1]);
        //Find gcf of the numerator and denominator. 
        int numer = answer[0] / factor;
        int denom = answer[1] / factor;
        //Divide the numerator and the denominator by the gcf to get the simplest form in improper fraction form. 
        int[] mixedOperand = toMixedNum(numer, denom);
        if(mixedOperand[1] == 0){
        	//If there is a wholeNum and the numerator is 0, just print the wholeNum
        	return mixedOperand[0] + ""; 
        } else if(mixedOperand [0] == 0){
        	//If the wholeNum is equal to zero, just print the fraction in fraction form in its simplest form. 
        	return mixedOperand[1] + "/" + mixedOperand[2];
        } else{
        	//Absolute value is for the negative value so the negative sign is only on the wholeNum 
        	//and not on the numerator and denominator too. 
        	return mixedOperand[0] + "_" + absValue(mixedOperand[1]) + "/" + absValue(mixedOperand[2]);
        }
    }
    
    // TODO: Fill in the space below with any helper methods that you think you will need
   
    public static int[] toImproperFrac(int wholeNum, int numerator, int denominator){
    	//Take the parsed operand and change it into an improper fraction. 
    	if(wholeNum < 0){
    		//If the whole number is negative, the numerator must be negative.
    		//Subtract numerator instead of add numerator.
    		numerator = (wholeNum * denominator) - numerator;
    	} else{
    		numerator = (wholeNum * denominator) + numerator;
    	}
    	int[] impropFrac = new int[2];
    	impropFrac[0] = numerator; 
    	impropFrac[1] = denominator;
    	return impropFrac;
    }
    
    public static int[] toMixedNum(int numerator, int denominator){
    	//Used this to simplify the fraction to its simplest form. 
    	//Changes the improper frac into a mixed num. 
    	int wholeNum = numerator / denominator;
    	int newNumer = numerator % denominator;
    	int[] mixedNum = new int[3];
    	if(numerator % denominator != 0){
    		mixedNum[0] = wholeNum; 
    		mixedNum[1] = newNumer;
    		mixedNum[2] = denominator;
    	} else{
    		mixedNum[0] = wholeNum;
    	}
    	return mixedNum;
    }
    
    public static int gcf(int numerator, int denominator){
    	//When trying to find the simplest form, divide both numbers by the gcf. 
    	//Uses this to find the gcf of the two number. 
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
    	//Multiply two improper fraction together. 
    	int numer = numer1 * numer2;
    	int denom = denom1 * denom2;
    	int[] newFraction = {numer, denom};
    	return newFraction;
    }
    
    public static int[] divide(int numer1, int denom1, int numer2, int denom2){
    	//Divide two improper fraction together. 
    	//Multiply the first operand by the reciprocal of the second operand to divide.
    	int newNumer = numer1 * denom2;
    	int newDenom = numer2 * denom1;
    	int[] newFraction = {newNumer, newDenom};
    	return newFraction;
    }
    
    public static int[] add(int numer1, int denom1, int numer2, int denom2){
    	//Adds two improper frac together. 
    	int newNumer;
    	int newDenom;
    	if(denom1 != denom2){
    		//To add fractions, you need to have the same denominator. 
    		//Changes the fraction so both will have the same denominator.
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
    	//Subtract the improper frac together. 
    	int numer;
    	int denom;
    	if(denom1 != denom2){
    		//To add fractions, you need to have the same denominator. 
    		//Changes the fraction so both will have the same denominator.
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
    	//Gets the absolute value of a number. 
    	//If the num is negative, return the number multiplied by negative one. 
    	if(num < 0){
    		return (num * -1);
    	} else{
    		return num;
    	}
    }
    
    public static int[] parseOperand(String operand){
    	//Parses each operand into three different numbers. 
    	//A wholeNum, numerator, and denominator in that order in an array of ints. 
    	String[] splitFraction = operand.split("_");
    	String wholeNum;
    	String numerator;
    	String denominator;
    	if(splitFraction.length == 2){
        	wholeNum = splitFraction[0];
            String[] splitFractionAgain = splitFraction[1].split("/");
        	if(splitFractionAgain.length == 1){
        		numerator = splitFractionAgain[0];
        		denominator = "1";
        	} else{
        		numerator = splitFractionAgain[0];
        		denominator = splitFractionAgain[1];
        	}
        } else{
        	wholeNum = "0";
            String[] splitFractionAgain = splitFraction[0].split("/");
        	if(splitFractionAgain.length == 1){
        		numerator = splitFractionAgain[0];
        		denominator = "1";
        	} else{
        		numerator = splitFractionAgain[0];
        		denominator = splitFractionAgain[1];
        	}
        }
    	int[] fractionArray = new int[3];
    	fractionArray[0] = Integer.parseInt(wholeNum);
    	fractionArray[1] = Integer.parseInt(numerator);
    	fractionArray[2] = Integer.parseInt(denominator);
    	//Changes the string to an int. 
    	return fractionArray;
    }
}

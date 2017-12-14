package fracCalc;

import java.util.Scanner;
public class FracCalc {

    public static void main(String[] args) 
    {
        //  Read the input from the user and call produceAnswer with an equation
    	Scanner userinput = new Scanner(System.in);
    	String question = userinput.nextLine();
    	String end = "quit";
<<<<<<< HEAD
    	while (question != end) {
		System.out.println(produceAnswer(question));
	}
=======
    	while (question != end) {
    		System.out.println(produceAnswer(question));
    	}
>>>>>>> branch 'master' of https://github.com/qiany1230/y_qian-Aug2017.git
    	userinput.close();
	}
    
    public static String produceAnswer(String input)
    { 
        //  Implement this function to produce the solution to the input
  
    	String[] arr = input.split(" ");
    	String operand1 = arr[0];
    	String operator = arr[1];
    	String operand2 = arr[2];
        Fraction answer = new Fraction();
    	return answer.toString();
    	//create string to return
    	
    }
    
   
    }

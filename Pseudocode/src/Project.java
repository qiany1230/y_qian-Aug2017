/* Ying Qian

 * Oct.3.2017
 * collaborative programming
 */


import java.util.*;
public class Project {
	public static void main(String args []) {
		Scanner console = new Scanner(System.in);
		int min = console.nextInt();
		int max = console.nextInt();
		boolean done = false;
		while(!done){
			int sum = 0;
			int num = console.nextInt();
			min = num;
			if(num < min) {
				min = num;
			}
			if(num > max) {
				max = num;
			}
			if(num % 2 == 0) {
				sum += num;
			}
	}
}
}
	
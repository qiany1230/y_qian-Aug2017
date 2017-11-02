/* Ying Qian
 * October 26 2017
 * Split String Practice
 */

//SplitString Starter Code

import java.util.*;

public class Split {
	
	public static void main(String[] args) {

		System.out.println(Arrays.toString("I like apples!".split(" ")));
		
		System.out.println(Arrays.toString("I really like really red apples".split("really")));

		System.out.println(Arrays.toString("I reallyreally likesapples".split("really")));

		System.out.println(Arrays.toString("applespineapplesbreadlettustomatobaconmayohambreadcheese".split("bread")));
		
		System.out.println(Arrays.toString("applesbreadpineapplesbreadlettustomatobreadbaconmayohambreadcheese".split("bread")));
		
		System.out.println(Arrays.toString("apples pineapples bread lettus tomato bacon mayo ham bread cheese".split(" ")));

		System.out.println(Arrays.toString("apples pineapples bread lettus tomato bacon mayo ham bread cheese".split(" bread ")));
		
		


	}

}
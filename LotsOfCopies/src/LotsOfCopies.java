/* Ying Qian
 * Array Mini-Lab
 */
import java.util.Arrays;

public class LotsOfCopies {
	
	public static void main (String[] args) {
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1, 2, 3, 4, 5};
		changeMe(num, strMain, arrMain);
		System.out.println(num);
		System.out.println(strMain);
		System.out.println(Arrays.toString(arrMain));
	}
	
	public static void changeMe (int x, String str, int[] arr) {
		x = 8;
		str = "APCS1";
		for (int i=0; i<arr.length; i++) {
			arr[i]++;
		}
		
		int b = x;
		x = 12;
		System.out.println("b:" + b);
		
		String bStr = str;
		str = "Hi There!";
		System.out.println("bstr:" + bStr);
		
		int[] barr = arr;
		for(int i=0; i<arr.length; i++) {
			arr[i]=0;
		}
		System.out.println("barr:" + Arrays.toString(barr));
	}
}

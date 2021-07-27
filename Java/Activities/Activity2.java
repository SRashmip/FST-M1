package Activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		int[] sum = {10,77,10,54,-11,10};
		System.out.println("Actual array:"+ Arrays.toString(sum));
		
		int num1 = 10;
		int finalsum = 30;
		
		System.out.println("Final result:" + result(sum,num1,finalsum));

	}
	public static boolean result(int[] sum,int num1, int finalsum) {
		int temp = 0;
		for(int number: sum) {
			if(number == num1) {
				temp  += num1;
			}
			if(temp>finalsum) {
				break;
			}
		}
		return temp == finalsum;
	}

}

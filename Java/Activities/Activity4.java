package Activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		int[] numArray = {10,6,15,4,45,1};
		System.out.println("Original Array:"+ Arrays.toString(numArray));
		
		//insertion logic
		for (int i=1; i<numArray.length;i++) {
			int temp = numArray[i];
			int j = i-1;
			while(j>=0 && temp<=numArray[j]) {
				numArray[j+1] = numArray[j];
				j=j-1;
			}
			numArray[j+1] = temp;
		}
      //sorted array
		System.out.println("Sorted Array:"+ Arrays.toString(numArray));
	}

}

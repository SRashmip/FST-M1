package FileClassActivity;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	ArrayList<Integer> list = new ArrayList<Integer>();
	Random indexGen = new Random();
	System.out.println("Enter integer");
	while(scan.hasNextInt()){
		list.add(scan.nextInt());
		
	}
	Integer nums[] = list.toArray(new Integer[0]);
	int index = indexGen.nextInt(nums.length);
	System.out.println("index value:"+ index);
	System.out.println("values in array:"+ nums[index]);
	scan.close();
}
}

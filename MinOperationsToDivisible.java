package ittihat;

import java.util.*;

public class MinOperationsToDivisible {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[]array = arrayGenerator(scan);
		System.out.println(minOperations(array,5));
	}
	 public static int minOperations(int[] nums, int k) {
	        int sum = 0;
	        for(int num : nums) sum += num;
	        return sum % k;
	    }
	  public static int[] arrayGenerator(Scanner scan) {
		   System.out.println("Please enter the number of staff : "); 
			int staff=scan.nextInt(); 
			int[] array = new int[staff];
			for(int i=0;i<array.length;i++) {
				System.out.println("Please "+(i+1)+" enter the numbered element :");
				array[i]=scan.nextInt();
			}	
			return array;
	   }
}

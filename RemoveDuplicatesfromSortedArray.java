package ittihat;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] array = arrayGenerator(scan);
		int k = removeDuplicates(array);
		System.out.println(k);
		 for (int i = 0; i < k; i++)
		 {
	            System.out.print(array[i] + " ");
	     }
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
	
     public static int removeDuplicates(int[] nums) {
    	if(nums.length==0) {
    		return 0;
    	}
    	int writeIndex=1;
    	for(int i=1;i<nums.length;i++) {
    		if(nums[i]!=nums[i-1]) {
    			nums[writeIndex]=nums[i];
    			writeIndex++;
    		}
    	}
    	return writeIndex;
    }
}

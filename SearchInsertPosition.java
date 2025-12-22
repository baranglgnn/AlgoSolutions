package ittihat;

import java.util.Scanner;

public class SearchInsertPosition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int[] array = arrayGenerator(scan);
	    System.out.println("Please enter your target number : ");
	    int target = scan.nextInt();
	    System.out.println("Binary Search : " + searchInsert(array, target));
	    

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
	 public static int searchInsert(int[] nums, int target) {
		 int left =0;
		 int right = nums.length-1;
		 while(left<=right) {
			 int mid = (right+left)/2;
			 if(target>nums[mid])
			 {
				 left=mid+1;
			 }else if(target<nums[mid])
			 {
				 right=mid-1;
			 }else if(target==nums[mid])
			 {
				 return mid;
			 } 
		 }
	        return left;
	    }
}

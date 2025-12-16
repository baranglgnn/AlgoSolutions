package ittihat;

import java.util.*;

public class RemoveElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int [] array = arrayGenerator(scan);
        System.out.println("Please enter the number you want to remove: ");
        int removeNumber = scan.nextInt();
        int k = removeElement(array, removeNumber);
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
	 public static int removeElement(int[] nums, int val) {
	      //3,3,2,
		 int k =0;
		 int writeIndex=0;
		 for(int i=0;i<nums.length;i++) 
		 {
			 if(nums[i]!=val) 
			 {
				 nums[writeIndex]=nums[i];
				 k++;
				 writeIndex++;
			 }
		 }
		 return k;
	        
	    }
}

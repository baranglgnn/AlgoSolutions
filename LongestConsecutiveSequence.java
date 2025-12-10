package ittihat;

import java.util.*;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int[]array=arrayGenerator(scan);
		System.out.println(longestConsecutive(array));

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
	public static int longestConsecutive(int[] nums) {
		Set<Integer> numSet= new HashSet<>();
		for(int i=0;i<nums.length;i++) {
			numSet.add(nums[i]);
		}
		int longest=0;
		for (int index : nums) {
			if(!numSet.contains(index-1)) {
				int current = index;
				int count=1;
				while(numSet.contains(current+1)) {
					current++;
					count++;
				}
				longest=Math.max(longest, count);
		}	
		}
		return longest;
       
	}
}

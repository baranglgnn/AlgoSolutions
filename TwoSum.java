package ittihat;

import java.util.*;

public class TwoSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array=arrayGenerator(scan);
		System.out.println("Please enter your target : ");
		int target = scan.nextInt();
		int[] result = twoSum(array, target);
		
		for(int i=0;i<result.length;i++) {
			System.out.println(array[i]);
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
   public static int[] twoSum(int[] array, int target) {
	   
	   Map<Integer,Integer> targetMap = new HashMap<>();
	   for(int i =0;i<array.length;i++) {
		   int remainder=target-array[i];
		   if(targetMap.containsKey(remainder)) {
			   return new int[] {targetMap.get(remainder),i};
		   }
		   targetMap.put(array[i],i);
	   }
	   throw new IllegalStateException("Not found");
	   
   }
   
}

package ittihad;

import java.util.*;

public class DuplicateFinder {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    System.out.println("Please enter the number of staff :");
	    int staff=sc.nextInt();
	    int [] mainArray = new int[staff];
	    appender_to_array(mainArray,sc);
	    printer(separatingDuplicateNumbers(mainArray));
	}
	public static int[] appender_to_array(int[]array,Scanner sc) 
	{
		
		for(int i=0;i<array.length;i++) 
		{
			System.out.println("Please enter element number "+ (i+1) +" :");
			array[i]=sc.nextInt();
		}
		return array;
	}
	public static int[] separatingDuplicateNumbers(int[]array) 
	{
		ArrayList<Integer> duplicateList = new ArrayList<>();
		for(int i=0;i<array.length;i++) 
		{
			for(int j=i+1;j<array.length;j++) 
			{
				if(array[i]==array[j]&& !duplicateList.contains(array[i])) 
				{
					duplicateList.add(array[i]);
				}
				
			}
		}
		int[] duplicate = duplicateList.stream().mapToInt(Integer::intValue).toArray();
		return duplicate;
	}
			
	public static void printer(int[]array) 
	{
		if(array.length>0) {
		for(int value:array) 
		{
			System.out.println(value);
		}
		}else
			System.out.println("The requested array could not be created.");
	}
}

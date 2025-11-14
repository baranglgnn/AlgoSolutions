package ittihad;

import java.util.*;

public class CommonElementsFinder {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    System.out.println("Please enter the number of staff :");
	    int staff=sc.nextInt();
	    System.out.println("Please enter the number of second staff :");
	    int staff_2=sc.nextInt();
	    int [] mainArray = new int[staff];
	    int [] secondArray = new int[staff_2];
	    appender_to_array(mainArray,sc);
	    appender_to_array(secondArray,sc);
	    System.out.print("Main Array : ");
	    printer(mainArray);
	    System.out.println();
	    System.out.print("Second Array : ");
	    printer(secondArray);
	    System.out.println();
	    System.out.print("Common Elements : ");
	    printer(commonElementsFinder(mainArray, secondArray));
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
	public static int[] commonElementsFinder(int[]array1,int[]array2) 
	{
		Set<Integer> mainSet = new HashSet<>();
		for(int num : array1) 
		{
			mainSet.add(num);
		}
		Set<Integer> commonElements = new HashSet<>();
		for(int num : array2) 
		{
			if(mainSet.contains(num)) 
			{
				commonElements.add(num);
			}
		}
		int[] commonElementsArray = commonElements.stream().mapToInt(Integer::intValue).toArray();
	    return commonElementsArray;
		
		
	}
	public static void printer(int[]array) 
	{
		if(array.length>0) {
		for(int value:array) 
		{
			System.out.print(value+",");
		}
		}else
			System.out.println("The requested array could not be created.");
	}
}

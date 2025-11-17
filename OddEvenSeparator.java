package ittihad;

import java.util.*;

public class OddEvenSeparator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the number of staff :");
		int staff=sc.nextInt();
		int [] mainArray = new int[staff];
		appender_to_array(mainArray);
		System.out.println("Press 1 to see the array of odd numbers, or press 2 to see the array of even numbers.");
		int choice=sc.nextInt();
		printer(splitArray(mainArray, choice));	
	}
	public static int[] appender_to_array(int[]array) 
	{
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<array.length;i++) 
		{
			System.out.println("Please enter element number "+ (i+1) +" :");
			array[i]=sc.nextInt();
		}
		return array;
	}
	public static int[] splitArray(int[]array, int choice) 
	{
		int odd=0;
		int even=0;
		for(int i=0;i<array.length;i++) 
		{
			if(array[i]%2==0) 
			{
				even++;
			}else 
			{
				odd++;
			}	
		}
		int oddIndex=0;
		int evenIndex=0;
		int [] oddArray= new int[odd];
		int [] evenArray = new int[even];
		for(int i=0;i<array.length;i++) 
		{
			if(array[i]%2==0) 
			{
				evenArray[evenIndex]=array[i];
				evenIndex++;
			}else 
			{
				oddArray[oddIndex]=array[i];
				oddIndex++;
			}
		}
		if(choice==1) 
		{
			return oddArray;
		}else
			return evenArray;
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

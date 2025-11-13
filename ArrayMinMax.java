package ittihad;

import java.util.*;

public class ArrayMinMax {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the number of staff :");
        int staff = sc.nextInt();
        int[] array = new int[staff];
        for(int i=0;i<array.length;i++) 
        {
        	System.out.println("Please "+(i+1)+" enter the numbered element :");
        	array[i]=sc.nextInt();
        }
        System.out.println("Maximum value :"+ maxFind(array));
        System.out.println("-------------------");
        System.out.println("Minumum value :"+minFind(array));
        
	}
	
	public static int maxFind(int[]array) 
	{
		int max=array[0];
		for(int i=0;i<array.length;i++) 
		{
			if(array[i]>max) 
			{
				max=array[i];
			}
		}
		return max;
	}
	public static int minFind(int[]array) 
	{
		int min = array[0];
		for(int i=0;i<array.length;i++) 
		{
			if(min>array[i]) 
			{
				min=array[i];
			}
		}
		return min;
	}
}

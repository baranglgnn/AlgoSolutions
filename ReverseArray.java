package ittihat;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    System.out.println("Please enter the number of staff :");
	    int staff=sc.nextInt();
	    int [] mainArray = new int[staff];
	    appender_to_array(mainArray,sc);
	    printer(mainArray);
	    System.out.println();
	    System.out.println("------REVERSE-------");
	    printer(reverseArray(mainArray));
	    
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
	public static int[] reverseArray(int[]array) 
	{
		int staff=array.length;
		for(int i=0;i<array.length/2;i++) 
		{
			int temp=array[i];
			array[i]=array[staff-1];
			array[staff-1]=temp;
			staff--;
		}
		return array;
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

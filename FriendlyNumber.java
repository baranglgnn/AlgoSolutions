package ittihad;

import java.util.*;

public class FriendlyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your first number :");
		int number1= sc.nextInt();
		System.out.println("Please enter your second number :");
		int number2 = sc.nextInt();
        System.out.println("Friendly number : " + friendlyNumber(number1, number2));
	}
    public static boolean friendlyNumber(int number1,int number2) {
    if(SumOfDivisors(number1)==number2 && SumOfDivisors(number2)==number1) 
    {
    	return true;
    }
    return false;
    }
    public static int SumOfDivisors(int number) {
    	int count=0;
    	for(int i=1;i<number;i++) 
    	{
    		if(number%i==0) 
    		{
    			count = count +i;
    		}
    	}
    	return count;
    }
}

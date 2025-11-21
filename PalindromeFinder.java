package ittihad;

import java.util.Scanner;

public class PalindromeFinder {
	public static void main(String[] args) {
		Scanner Kingo= new Scanner(System.in);
		int sayi = Kingo.nextInt();
		int temp=sayi;
		int result=0;
		while(temp>0) 
		{
			int digit=temp%10;
			result=result*10+digit;
			temp=temp/10;
		}
        if(sayi==result) 
        {
        	System.out.println("Palindrom Kingo");
        }else
        	System.out.println("Palindrom deðil kingo");
	}

}

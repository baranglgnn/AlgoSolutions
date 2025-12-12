package ittihat;

import java.util.*;

public class FindtheIndexoftheFirstOccurrenceinaString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter haystack : ");
		String hayStackt = scan.nextLine();
		System.out.println("Please enter needle : ");
		String needle = scan.nextLine();
		System.out.println("match ýndex : " + strStr(hayStackt, needle));

	}
	public static int strStr(String haystack, String needle) {
	   if(needle.length()>haystack.length()) 
	   {
		   return -1;
	   }
	   for(int i=0;i<=haystack.length()-needle.length();i++) {
		   boolean match=true;
		   for(int j=0;j<needle.length();j++) {
			   if(haystack.charAt(i+j)!=needle.charAt(j))
			   {
				   match = false;
				   break;
			   }
		   }
		   if(match) 
	       {
		   return i;
	       }
	   }
	   return -1;
	}
}

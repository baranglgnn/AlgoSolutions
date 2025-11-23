package ittihad;

import java.util.*;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your word :");
        String mainString = sc.next();
        System.out.println("Palindrome status: " + palindromeString(mainString));
    }
    
    public static boolean palindromeString(String mainString) {
       StringBuilder sb = new StringBuilder();
       for(int i= mainString.length()-1;i>=0;i--) 
       {
    	   sb.append(mainString.charAt(i));
       }
       String reverse = sb.toString();
       return mainString.equals(reverse);
    }
}

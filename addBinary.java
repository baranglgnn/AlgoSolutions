package ittihat;

import java.util.Scanner;

public class addBinary {

	public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Please enter first binary : ");
         String firstBinary=scan.nextLine();
         System.out.println("Please enter seconf binary : ");
         String seconfBinary=scan.nextLine();
         System.out.println(addBinary(firstBinary, seconfBinary));
        
	} 
	//1+1=0 elde: 1
	//1+0=1 elde: 0
	//0+0=0 elde: 0
	public static String addBinary(String a, String b) {

	    StringBuilder result = new StringBuilder();

	    int i = a.length() - 1;
	    int j = b.length() - 1;
	    int carry = 0;
	    while (i >= 0 || j >= 0 || carry == 1) {
	        int sum = carry;
	        if (i >= 0) {
	            sum += a.charAt(i) - '0';
	            i--;
	        }
	        if (j >= 0) {
	            sum += b.charAt(j) - '0';
	            j--;
	        }
	        result.append(sum % 2);
	        carry = sum / 2;
	    }
	    return result.reverse().toString();
	}


}

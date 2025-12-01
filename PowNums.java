package ittihat;

import java.util.*;

public class PowNums {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number : ");
        int num=scan.nextInt();
        System.out.println("Please enter pow : ");
        int powNum=scan.nextInt();
        System.out.println(pow(num,powNum));
	}
    public static int pow(int num,int powNum) {
    	int result=1;
    	for(int i=0;i<powNum;i++) {
    		result*=num;
    	}
    	return result;
    }
}

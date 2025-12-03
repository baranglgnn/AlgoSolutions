package ittihat;

import java.util.*;


public class Roman_to_Integer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.println("Please enter your roman number : ");
	    String romanNumber=scan.nextLine();
	    System.out.println("Result : " + romanToInt(romanNumber));
	}
	
   public static HashMap<Character, Integer> romanNumberMachine(){
	   HashMap<Character,Integer> romanMap = new HashMap<>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X',10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
		return romanMap;   
   }
   public static int romanToInt(String s) {
	    HashMap<Character, Integer> map = romanNumberMachine();
	    int result = 0;
	    for (int i = 0; i < s.length(); i++) {
	        int currentValue = map.get(s.charAt(i));
	        if (i + 1 < s.length()) {
	            int nextValue = map.get(s.charAt(i + 1));
	            if (currentValue < nextValue) {
	                result += (nextValue - currentValue);
	                i++; 
	                continue;
	            }
	        }
	        result += currentValue;
	    }

	    return result;
	}

}


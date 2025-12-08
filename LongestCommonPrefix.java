package ittihat;
import java.util.*;
	public class LongestCommonPrefix {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
		    String[] strs = arrayGenerator(scan);
		    System.out.println(longestCommonPrefix(strs));
		}	
		public static String[] arrayGenerator(Scanner scan) {
			   System.out.println("Please enter the number of staff : "); 
				int staff=scan.nextInt(); 
				scan.nextLine();
				String[] array = new String[staff];
				for(int i=0;i<array.length;i++) {
					System.out.println("Please "+(i+1)+" enter the numbered element :");
					array[i]=scan.nextLine();
				}	
				return array;
		   }
		 public static String longestCommonPrefix(String[] strs) {
			 if (strs == null || strs.length == 0) {
			        return "";
			    }
		        String minlenght = strs[0];
		        for (String string : strs) {
					if(string.length()<minlenght.length())
                    {
						minlenght=string;
					}
				}
		        for (int i = 0; i < minlenght.length(); i++) {
		            char c = minlenght.charAt(i);
		            for (String word : strs) {
		                if (word.charAt(i) != c) {
		                    return minlenght.substring(0, i); 
		                }
		            }
		        }
		        return minlenght;   
		    }	
	}

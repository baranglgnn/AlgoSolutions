package ittihad;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramChecker {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Please enter your first word : ");
	 String mainWord=sc.next();
	 System.out.println("Please enter your second word :");
	 String secondWord=sc.next();
	 System.out.println("Anagram :" + anagramChecker(mainWord, secondWord));
	}
	public static boolean anagramChecker(String mainWord,String secondWord) {
		boolean anagram = false;
		HashMap<Character, Integer> mapMainWord = new HashMap<>();
		HashMap<Character, Integer> mapSecondWord = new HashMap<>();
		for(char i : mainWord.toCharArray()) 
		{
			mapMainWord.put(i,mapMainWord.getOrDefault(i, 0)+1);
		}
		for(char i : secondWord.toCharArray()) 
		{
			mapSecondWord.put(i, mapSecondWord.getOrDefault(i, 0)+1);
		}
			if(mapMainWord.equals(mapSecondWord)) 
			{
				return anagram=true;
			}
		return anagram;
	}

}

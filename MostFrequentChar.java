package ittihad;

import java.util.*;

public class MostFrequentChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your word :");
		String mainWord= sc.next();
		System.out.println("Max Frequence :"+ mostFrequentChar(mainWord));
	}

	public static Character mostFrequentChar(String mainWord){
		HashMap<Character, Integer> mapMainWord = new HashMap<>();
		for(char i : mainWord.toCharArray()) 
		{
			mapMainWord.put(i, mapMainWord.getOrDefault(i, 0)+1);
		}
		char mostFrequent = mainWord.charAt(0);
	    int maxCount = 0;
		for(char key : mapMainWord.keySet()) 
		{
			int count = mapMainWord.get(key);
			if (count > maxCount) {
	            mostFrequent = key;
	            maxCount = count;
	        }
		}
		return mostFrequent;
	}
}

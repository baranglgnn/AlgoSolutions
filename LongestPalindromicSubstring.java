package ittihat;

import java.util.*;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your word :");
        String mainWord = sc.next();
        System.out.println("Main Word : "+mainWord);
        System.out.println("---------------");
        System.out.println("Longest Palindromic Substring: " + longestPalindromicSubstring(mainWord));
    }
    public static String longestPalindromicSubstring(String mainWord) {
        if (mainWord == null || mainWord.length() < 1)
        {
        	return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < mainWord.length(); i++) {
            int len1 = expandFromCenter(mainWord, i, i);
            int len2 = expandFromCenter(mainWord, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return mainWord.substring(start, end + 1);
    }
    private static int expandFromCenter(String mainWord, int left, int right) {
        while (left >= 0 && right < mainWord.length() && mainWord.charAt(left) == mainWord.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}


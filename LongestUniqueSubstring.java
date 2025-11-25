package ittihad;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestUniqueSubstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your word :");
        String mainString = sc.next();
        System.out.println("Longest Unique Substring: " + longestUniqueSubstring(mainString));
    }
    public static String longestUniqueSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0, right = 0;
        int maxLen = 0, startIndex = 0;

        while (right < s.length()) {
            char current = s.charAt(right);
            while (seen.contains(current)) {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(current);
            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                startIndex = left;
            }
            right++;
        }
        return s.substring(startIndex, startIndex + maxLen);
    }
}

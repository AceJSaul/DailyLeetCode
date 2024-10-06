package october2024.weekOne;

import java.util.Arrays;

public class PermutationInString {

    /*
    Given two strings s1 and s2, return true if s2 contains a permutation
    of s1, or false otherwise.

    In other words, return true if one of s1's permutations is the substring of s2.
     */

    // I'll use pointers to search only if there is the exact number of occurrences of s1
    // In a range that fits the length of s1 in s2
    public boolean checkInclusion(String s1, String s2){
        if (s1.length() > s2.length()) return false;
        int[] s1Appearances = new int[26]; // Only lowercase English letters
        for (int i=0; i<s1.length(); i++){
            int letterInIndex = s1.charAt(i) - 'a';
            s1Appearances[letterInIndex]++;
        }

        // Range that needs to be checked in s2
        int leftPointer = 0;
        int rightPointer = s1.length();

        int[] s2Appearances = new int[26];
        for (int j=0; j<s1.length(); j++){
            int letterInIndex = s2.charAt(j) - 'a';
            s2Appearances[letterInIndex]++; // If s1="ab" and s2="eidboaoo", I'm checking "ei", then I'll keep checking s1.length() subStrings
            if (Arrays.equals(s2Appearances, s1Appearances)) return true;
        }

        while(rightPointer < s2.length()){
            s2Appearances[s2.charAt(leftPointer) - 'a']--;
            s2Appearances[s2.charAt(rightPointer) - 'a']++;
            if(Arrays.equals(s2Appearances, s1Appearances)) return true;
            leftPointer++;
            rightPointer++;
        }
        return false;
    }
}

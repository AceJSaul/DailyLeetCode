package october2024.weekTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SentenceSimilarityIII {

    /*
    You are given two strings sentence1 and sentence2, each representing a sentence composed of words.
    A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
    Each word consists of only uppercase and lowercase English characters.

    Two sentences s1 and s2 are considered similar if it is possible to insert an arbitrary sentence (possibly empty) inside
    one of these sentences such that the two sentences become equal.
    Note that the inserted sentence must be separated from existing words by spaces.

    For example,

    s1 = "Hello Jane" and s2 = "Hello my name is Jane" can be made equal by inserting "my name is" between "Hello" and "Jane" in s1.
    s1 = "Frog cool" and s2 = "Frogs are cool" are not similar, since although there is a sentence "s are" inserted into s1,
    it is not separated from "Frog" by a space.
    Given two sentences sentence1 and sentence2, return true if sentence1 and sentence2 are similar. Otherwise, return false.
     */

    // I couldn't solve it :(

    public boolean areSentencesSimilar(String sentence1, String sentence2){
        String[] wordsInS1 = sentence1.split(" ");
        String[] wordsInS2 = sentence2.split(" ");

        String longestCommonPrefix = getStringPrefix(wordsInS1, wordsInS2);
        String longestCommonSuffix = getStringSuffix(wordsInS1, wordsInS2);
        return (!longestCommonPrefix.isEmpty() || !longestCommonSuffix.isEmpty()) &&
                (Arrays.stream(wordsInS1).toList().contains(Arrays.stream(wordsInS2).toList())
                || Arrays.stream(wordsInS2).toList().contains(Arrays.stream(wordsInS1).toList()));
    }

    private static String getStringPrefix(String[] wordsInS1, String[] wordsInS2) {
        StringBuilder longestCommonPrefixSb = new StringBuilder();
        if (wordsInS1.length <= wordsInS2.length){
            for (int i = 0; i<wordsInS1.length; i++){
                if (wordsInS1[i].equals(wordsInS2[i])) longestCommonPrefixSb.append(wordsInS1[i]).append(" ");
                else break;
            }
        }
        else{
            for (int i = 0; i< wordsInS2.length; i++){
                if (wordsInS2[i].equals(wordsInS1[i])) longestCommonPrefixSb.append(wordsInS2[i]).append(" ");
                else break;
            }
        }
        return longestCommonPrefixSb.toString();
    }
    private static String getStringSuffix(String[] wordsInS1, String[] wordsInS2){
        int indexForSentence = 0;
        String longestCommonSuffix = "";
        if (wordsInS1.length <= wordsInS2.length){
            for (int i=wordsInS1.length-1; i>=0; i--){
                if (wordsInS1[i].equals(wordsInS2[wordsInS2.length-(1+indexForSentence)])) {
                    longestCommonSuffix = wordsInS1[i] + longestCommonSuffix;
                }
                else break;
            }
        }
        else{
            for (int i= wordsInS2.length-1; i>=0; i--){
                if (wordsInS2[i].equals(wordsInS1[wordsInS1.length-(1+indexForSentence)])){
                    longestCommonSuffix = wordsInS2[i] + longestCommonSuffix;
                }
                else break;
            }
        }
        return longestCommonSuffix;
    }
}

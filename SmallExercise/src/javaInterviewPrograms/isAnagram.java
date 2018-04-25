package javaInterviewPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by n0271239 on 3/30/2018.
 */
public class isAnagram {

    /**
     * Two words are anagrams of each other if they contain the same number of characters and the same characters.
     You should only need to sort the characters in lexicographic order, and compare if String a is equal to
     String b at all steps
     O(nlogn), n is the length of the string
     * @param firstWord
     * @param secondWord
     * @return
     */
    public boolean isAnagram(String firstWord, String secondWord) {
        char[] word1 = firstWord.replaceAll("[\\s]", "").toCharArray();
        char[] word2 = secondWord.replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }

    /**
     *Here's a simple fast O(n) solution without using sorting or multiple loops or hash maps.
     * We increment the count of each character in the first array and decrement
     * the count of each character in the second array. If the resulting counts array is full of zeros,
     * the strings are anagrams.
     * Can be expanded to include other characters by increasing the size of the counts array.
     * @param leftString
     * @param rightString
     * @return
     */
    public boolean isAnagramBetterPerformance(String leftString, String rightString) {
        if (leftString == null || rightString == null) {
            return false;
        } else if (leftString.length() != rightString.length()) {
            return false;
        }

        Map<Character, Integer> occurrencesMap = new HashMap<>();

        for(int i = 0; i < leftString.length(); i++){
            char charFromLeft = leftString.charAt(i);
            int nrOfCharsInLeft = occurrencesMap.containsKey(charFromLeft) ? occurrencesMap.get(charFromLeft) : 0;
            occurrencesMap.put(charFromLeft, ++nrOfCharsInLeft);
            char charFromRight = rightString.charAt(i);
            int nrOfCharsInRight = occurrencesMap.containsKey(charFromRight) ? occurrencesMap.get(charFromRight) : 0;
            occurrencesMap.put(charFromRight, --nrOfCharsInRight);
        }

        for(int occurrencesNr : occurrencesMap.values()){
            if(occurrencesNr != 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String a[]) {
        isAnagram ia = new isAnagram();
        System.out.println(ia.isAnagram("aba", "baa"));
    }
}

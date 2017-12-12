package HackerRank.TwoSigmaCodeTest;

import java.io.*;
import java.util.*;

public class Solution2 {

//    /*
//    * Complete the function below.
//    */
//    static int longestChain(String[] words) {
//
//
//        for (int i=0; i<words.length; i++) {
//            char[] row = words[i].toCharArray();
//
//
//        }
//        return 0;
//
//    }
//
//    static int findChainNum(String[] words, char[] word){
//
//        if (word.length==1)
//            return 1;
//        else {
//
//        }
//
//        for (int j = 0; j < word.length; j++) {
//
//        }
//        return 0;
//    }

    /**
     * longestChain calls findChainLen to get the chain number for each word,
     * and then uses a hash map to store result : word - chain number pairs,
     * after all the chain number were found for each word in words, it return the max chain number, aka longest chain length.
     * @param words words array from stdin
     * @return longest chain length
     */
    static int longestChain(String[] words) {
        if (null == words || words.length < 1) {
            return 0;
        }

        int maxChainLen = 0;

        HashSet<String> wordsMap = new HashSet<>(Arrays.asList(words));
        HashMap<String, Integer> wordToLongestChain = new HashMap<>();

        for (String word : words) {
            if (maxChainLen > word.length()) {
                continue;
            }
            int curChainLen = findChainLen(word, wordsMap, wordToLongestChain) + 1;
            wordToLongestChain.put(word, curChainLen);
            maxChainLen = Math.max(maxChainLen, curChainLen);
        }
        return maxChainLen;
    }

    /**
     * findChainLen is a recursive method
     * base case: when wordToLongestChain contains the nextWord, the curChainLen will be the max between curChainLen from last
     * iteration and the chainLen of the corresponding word in wordToLongestChain
     * recursive case/otherwise: update word parameter to be nextWord
     * @param word the word to find chain len for
     * @param wordsMap include words
     * @param wordToLongestChain include each word
     * @return curChainLen
     */
    static int findChainLen(String word, HashSet<String> wordsMap, HashMap<String, Integer> wordToLongestChain) {
        int curChainLen = 0;

        for (int i = 0; i < word.length(); i++) {
            String nextWord = word.substring(0, i) + word.substring(i + 1);
            if (wordsMap.contains(nextWord)) {
                if (wordToLongestChain.containsKey(nextWord)) {
                    curChainLen = Math.max(curChainLen, wordToLongestChain.get(nextWord));
                } else {
                    int nextWordChainLen = findChainLen(nextWord, wordsMap, wordToLongestChain);
                    curChainLen = Math.max(curChainLen, nextWordChainLen + 1);
                }
            }
        }

        return curChainLen;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        int res;
        int words_size = 0;
        words_size = Integer.parseInt(in.nextLine().trim());

        String[] words = new String[words_size];
        for(int i = 0; i < words_size; i++) {
            String words_item;
            try {
                words_item = in.nextLine();
            } catch (Exception e) {
                words_item = null;
            }
            words[i] = words_item;
        }

        res = longestChain(words);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}


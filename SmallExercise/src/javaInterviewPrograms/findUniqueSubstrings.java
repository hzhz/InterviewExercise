package javaInterviewPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by n0271239 on 3/30/2018.
 *
 Problem Statement : Given a string of lowercase alphabets, count all possible substrings (not necessarily distinct) that has exactly k distinct characters. Example:

 Input: abc, k = 2 Output: 2 Possible substrings are {"ab", "bc"}

 I have written the solution with a two pointer approach. I am not sure how to calculate the time complexity of the program?

 According to me complexity should be O(n*k)
 */
public class findUniqueSubstrings {

    public static void main(String[] args){
        String s = "abacuusttlvbnc";
        int k=3;
        char[] sArr = s.toCharArray();
        int strLen = sArr.length;
        Set<Character> set = new LinkedHashSet<Character>();
        int l=0;
        int r=0;

        while(l<=strLen-k){  // will run (arrayLength - k) times
            for(int i=0;i<k;i++){   // will run k times for every while iteration
                set.add(sArr[l]);
                l++;
            }
            if(set.size()==k){
                System.out.println("substring : " + set);
            }
            set.clear(); // O(k) for every while iteration
            r++;
            l= r;
        }
    }
}


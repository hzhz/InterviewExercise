package javaInterviewPrograms;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class LeetCodeEasy1 {

    private static String defangIPaddr(String address) {
        String[] spl = address.split("\\.");
        System.out.println(spl.length);
        String s = "";
        for (int i = 0; i < spl.length; i++) {
            if (i==spl.length-1)
               s= s + spl[i];
            else
                s = s + spl[i] + "[.]";
        }
        return s;
    }

    private static int balancedStringSplit(String s) {
        int res = 0, cnt = 0;
        for (int i = 0; i < s.length(); ++i) {
            cnt += s.charAt(i) == 'R' ? 1 : -1;
            if (cnt == 0) ++res;
        }
        return res;
    }

/*    private static int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null) return 0;
        if(root.val > R) return rangeSumBST(root.left, L, R);
        if(root.val < L) return rangeSumBST(root.right, L, R);
        return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
    }*/

    private static int minTimeToVisit( int[][] pts){
        int minT=0;
        for(int i=1; i<pts.length; i++){
            int[] last = pts[i-1];
            int[] curr = pts[i];
            minT += Math.max(Math.abs(curr[0]-last[0]), Math.abs(curr[1]-last[1]));
        }
        return minT;
    }

    private static char[] reverstString(char[] s){
        for(int i=0; i<s.length/2; i++){
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i]=temp;
        }
        return s;
    }

/*    private static int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }*/

    private static int singleNumber(int[] nums){
        int result = 0;
        for(int i : nums) {
            result ^= i;
        }
        return result;
    }

    private static List<String> fizzBuzz(int n) {
        ArrayList<String> str = new ArrayList<String>();

        for(int i=1; i<n+1; i++){
            if(i%3==0 && i%5==0)
                str.add("FizzBuzz");
            else if(i%3==0)
                str.add("Fizz");
            else if(i%5==0)
                str.add("Buzz");
            else
                str.add(Integer.toString(i));
        }
        return str;
    }

    private static void moveZeroes(int[] nums) {
/*        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
            System.out.println("i and j:   "+ i +"  " +j);
            for(int k = 0; k < nums.length; k++) {
                System.out.print(nums[k]+" ");
            }
        }*/
        if (nums == null || nums.length == 0) return;

        int insertPos = 0;
        for (int num: nums) {
            if (num != 0) nums[insertPos++] = num;
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
        System.out.println("final:");
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

    /*
    lgoic based on  similation: http://www.cs.utexas.edu/~moore/best-ideas/mjrty/
     */
    private static int majorityElement(int[] num){
        int m=num[0];
        int c=1;
        for(int i=0; i<num.length; i++){
            if(c==0) {
                m = num[i];
                c++;
            }else if(num[i]==m){
                c++;
            }else
                c--;
        }
        return m;
    }



    public static void main(String args[]) {
        System.out.println(defangIPaddr("1.1.1.1")); // expect 4

        System.out.println(balancedStringSplit("RLRRLLRLRL")); // expect 4

        // System.out.println(rangeSumBST([10,5,15,3,7,null,18], 7, 15); // expect

        int[][] pts = { {1, 1}, {3,4}, {-1, 0} };
        int[][] pts2 = { {3, 2}, {-2,2} };
        System.out.println(minTimeToVisit(pts)); // expect 7
        System.out.println(minTimeToVisit(pts2)); // expect 5

        System.out.println(reverstString("hello".toCharArray())); // expected ["o","l","l","e","h"]

        // System.out.println(maxDepth([3,9,20,null,null,15,7])); // expected 3

        int[] nums = {2, 2, 1};
        int[] nums2 ={4,1,2,1,2};
        System.out.println(singleNumber(nums)); //expected 1
        System.out.println(singleNumber(nums2)); //expected 4

        System.out.println(fizzBuzz(15)); // expected [1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]

        int[] nums_1 = {0,1,0,3,12};
        moveZeroes(nums_1); // expected [1,3,12,0,0]

        int[] nums_2_1 = {2,2,1,1,1,2,2};
        int[] nums_2_2 = {3,2,3};
        System.out.println(majorityElement(nums_2_1)); // expected 2
        System.out.println(majorityElement(nums_2_2)); // expected 3
    }
}

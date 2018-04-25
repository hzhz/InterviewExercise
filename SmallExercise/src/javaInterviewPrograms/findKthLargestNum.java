package javaInterviewPrograms;
import java.util.Collections;
import java.util.PriorityQueue;


/** CommondBond Interview Question 4/24/2018
 * Created by n0271239 on 4/25/2018.
 */
public class findKthLargestNum {


    int findKthNum (int[] nums, int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder()); // reverse order of priority queue, by the default The head of this queue is the least element with respect to the specified ordering.

        for (int i =0; i<nums.length; i++) {

            if (i < k - 1) {
                queue.offer(nums[i]);
            }
            else if (nums[i] < queue.peek()) {
                queue.poll();
                queue.offer(nums[i]);
            }
        }

        return queue.peek();
    }

    public static void main(String[] args) {
        findKthLargestNum fkln =new findKthLargestNum();

        int k=5;
        int[] nums = new int[]{-12, 2, 1, 4, 14, 333, 2, 13, 10, -222}; // expect 2
        System.out.println("the kth largest number in the array is :    "+fkln.findKthNum(nums, k));
    }
}

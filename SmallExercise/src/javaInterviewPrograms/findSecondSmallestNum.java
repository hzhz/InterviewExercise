package javaInterviewPrograms;

import java.util.ArrayList;

/**
 * Created by n0271239 on 3/30/2018.
 */
public class findSecondSmallestNum {

    public static int findSecondSmallest(int[] elements) {
        if (elements == null || elements.length < 2) {
            throw new IllegalArgumentException();
        }
        int smallest = elements[0];
        int secondSmallest = elements[0];
        for (int i = 1; i < elements.length; i++) {
            if (elements[i] < smallest) {
                secondSmallest = smallest;
                smallest = elements[i];
            }
            else if (elements[i] < secondSmallest) {
                secondSmallest = elements[i];
            }
        }
        return secondSmallest;
    }

    public static void main(String a[]) {

        int[] intArray = new int[]{ 101,6,9,-2,-1,100 };
        findSecondSmallestNum fssn = new findSecondSmallestNum();
        System.out.println(fssn.findSecondSmallest(intArray));
    }
}

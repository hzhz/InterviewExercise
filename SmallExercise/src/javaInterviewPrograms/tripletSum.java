package javaInterviewPrograms;

/**
 * Commond Bond interview Q's 4/24/2018
 */
// example
//{5, 1, 3, 4, 7}
//12
// (1, 3, 4), (1, 3, 5), (1, 3, 7) and
//            (1, 4, 5)
// -> 4


/** find how many triplets of the int array sums less than k
 * Created by n0271239 on 4/25/2018.
 */
public class tripletSum {
    public static void main(String[] args) {

        int[] nums= new int[]{5, 1, 3, 4, 7};
        int n=12;
        int c=0;

        for (int i=0; i< nums.length; i++){
            for (int j=i+1; j <nums.length; j++){
                for (int k=j+1; k <nums.length; k++){
                    if(nums[i]+nums[k]+nums[j]<n){
                        System.out.println(nums[i] +" "+nums[j] +" "+nums[k]);
                        c++;
                    }
                }
            }
        }
        System.out.println(c);
    }
}

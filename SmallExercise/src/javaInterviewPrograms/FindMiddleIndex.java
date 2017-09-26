package javaInterviewPrograms;

/**
 * Created by n0271239 on 9/20/2017.
 * You are given an array of numbers. Find out the array index or position
 where sum of numbers preceeding the index is equals to sum of numbers
 succeeding the index.
 */
public class FindMiddleIndex {

    public int findMiddleIndex(int[] numbers){

        int sumLeft=0;
        int sumRight=0;
        for(int i=0; i< numbers.length; i++){
            sumLeft=findSum(numbers, 0,i);
            sumRight=findSum(numbers, i+1, numbers.length-1);
            if(sumLeft==sumRight)
                return i;
        }


        return 0;
    }

    public int findSum(int[] number, int startIndex, int endIndex){
        int sum=0;
        for(int i=startIndex; i<=endIndex; i++){
            sum+= number[i];
        }
        return sum;
    }

    public static void main(String a[]) {
        int[] num = { 2, 4, 4, 5, 4, 1 };
        FindMiddleIndex fmi= new FindMiddleIndex();
        try {
            System.out.println("Starting from index 0, adding numbers till index "
                    + fmi.findMiddleIndex(num) + " and");
            System.out.println("adding rest of the numbers can be equal");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

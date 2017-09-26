package javaInterviewPrograms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by n0271239 on 9/20/2017.
 *You have got a range of numbers between 1 to N, where one of the number is repeated. You need to write a program to find out the duplicate number.
 */
public class DuplicateNumber {

    public int findDuplicateNumber(List<Integer> numbers){
        int max= numbers.size()-1;
        int sum=getSum(numbers);
        return sum-max*(max+1)/2;

    }

    public int getSum(List<Integer> numbers){
        int sum=0;
        for(int num: numbers){
            sum=sum+num;
        }
        return sum;
    }

    public static void main(String a[]){
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i=1;i<30;i++){
            numbers.add(i);
        }
        //add duplicate number into the list
        numbers.add(52);
        DuplicateNumber dn = new DuplicateNumber();
        System.out.println("Duplicate Number: "+dn.findDuplicateNumber(numbers));
    }
}

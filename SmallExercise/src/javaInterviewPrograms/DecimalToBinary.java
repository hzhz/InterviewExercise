package javaInterviewPrograms;

/**
 * Created by n0271239 on 9/20/2017.
 * Write a program to convert decimal number to binary format using numeric operations. Below example shows how to convert decimal number to binary format using numeric operations.
 */
public class DecimalToBinary {

    public void printBinaryFormat(int number){

        int binary[] = new int[number];
        int index = 0;
        while(number > 0){
            binary[index++] = number%2;
            System.out.println(number%2);
            number = number/2;
        }
        for(int i = index-1;i >= 0;i--){
        //for(int i=0; i<index; i++){
            System.out.print(binary[i]);
        }
    }

    public static void main(String a[]){
        DecimalToBinary dtb = new DecimalToBinary();
        dtb.printBinaryFormat(26);
    }
}

package javaInterviewPrograms;

/**
 * Created by n0271239 on 9/20/2017.
 * Write a program to reverse a string using recursive methods.
 You should not use any string reverse methods to do this.
 */
public class StringRecursiveReversal {

    public String reverseString(String str){

        String reverse="";
        if (str.length()==1){
            return str;
        }else{
            return str.charAt(str.length()-1)+reverseString(str.substring(0, str.length()-1));
        }

    }

    public static void main(String a[]){
        StringRecursiveReversal srr = new StringRecursiveReversal();
        System.out.println("Result: "+srr.reverseString("Java2novice"));
    }
}

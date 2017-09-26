package Recursion;

public class MyFindNthFibonacci {


    public int findNthFibonacci(int n){
        if(n==0)
            return 0;
        else if (n==1)
            return 1;
        else
            return findNthFibonacci(n-1)+findNthFibonacci(n-2);
    }
    public static void main(String[] args){
        MyFindNthFibonacci mfnf=new MyFindNthFibonacci();
        System.out.println(mfnf.findNthFibonacci(14));
    }
}

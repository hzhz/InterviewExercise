package javaInterviewPrograms;

/**
 * Created by n0271239 on 12/12/2017.
 */
public class powerOfSomeInt {

    /** determine if a is a power of b */
    public boolean isPowerOfSomeInt( int a, int b) {
        System.out.println(a +" is a power of " + b);
        while(a%b==0) {
            a /= b;
        }
        //note 1 is the the 0th power of b
        System.out.println(a ==1);
        return a==1;

    }

    public static void main(String a[]){
        powerOfSomeInt posi = new powerOfSomeInt();

        posi.isPowerOfSomeInt(49,7);
        posi.isPowerOfSomeInt(1,7);
        posi.isPowerOfSomeInt(343,7);

        posi.isPowerOfSomeInt(56,7);
        posi.isPowerOfSomeInt(98,7);
        posi.isPowerOfSomeInt(9,7);
    }
}

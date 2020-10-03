package javaInterviewPrograms;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class InteractiveBrokerTest1 {

    private final Character m='a';
    public String toString(){
        return ""+m;
    }
    public static void main(String[] args) {
        int a=1;
        int b=a++;
        int c=++b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int a2=1<<2;
        System.out.println(a2);


        System.out.println("Q4_____________");
        final char sep=0X20;
        final int mes=1;
        System.out.println(sep+mes+"=A");

        System.out.println("Q12_____________");
        try{
            Field f= InteractiveBrokerTest1.class.getDeclaredField("m");
            f.setAccessible((true));
            InteractiveBrokerTest1 i =new InteractiveBrokerTest1();
            f.set(i, (char)'b');
            System.out.println(i);
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("Q13_____________");

        for(byte b2=Byte.MIN_VALUE; b2<Byte.MAX_VALUE; b2++){
//            if (b2==0x90){
//                System.out.println("found it");
//            }
        }

        System.out.println("Q15_____________");
        Map<Integer, String> hashMap =new HashMap<Integer, String>(5);
        hashMap.put(1, "apple");
        hashMap.put(2, null);
       //hashMap.put(new Integer(3), "peach");
        hashMap.put(3, "orange");
        hashMap.put(4, "peach");

        for(String v: hashMap.values()){
            if("oranges".equals(v)){
                System.out.println("Q15_   debug____________");
                hashMap.put(5, "babdfd");
            }
        }
        System.out.println(hashMap.get(5));


    }


}

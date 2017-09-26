/**
 * 
 */
package javaInterviewPrograms;

/**
 * @author Ellen
 * The binary numeral system, or base-2 number system, represents numeric values using two symbols: 0 and 1.
 * More specifically, the usual base-2 system is a positional notation with a radix of 2.
 * Because of its straightforward implementation in digital electronic circuitry using logic gates,
 * the binary system is used internally by almost all modern computers.
 */
public class MyBinaryCheck {

	public boolean isBinaryNumber( int num){

	    while(num!=0) {
            if (num == 0 | num==1)
                return true;
            else {
                int r = num % 10;
                if (r > 1)
                    return false;
                num = num / 10;
            }
        }
        return true;
	}
   /* public boolean isBinaryNumber(int binary){

        boolean status = true;
        while(true){
            if(binary == 0){
                break;
            } else {
                int tmp = binary%10;
                if(tmp > 1){
                    status = false;
                    break;
                }
                binary = binary/10;
            }
        }
        return status;
    }*/

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyBinaryCheck mbc= new MyBinaryCheck();

        System.out.println("Is 1000111 binary? :"+mbc.isBinaryNumber(1000111));
        System.out.println("Is 10300111 binary? :"+mbc.isBinaryNumber(10300111));
	}

}

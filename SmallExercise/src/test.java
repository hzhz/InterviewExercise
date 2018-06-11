/**
 * Created by n0271239 on 5/17/2018.
 * [[2, 5,  9],
 [3, 8, 12],
 [5, 9, 14]]

 */
public class test {

    static boolean findNum (int a, int[][] array){
       // int contents[][] = { {1, 2} , { 4, 5} };
     //int[][] array=  { {2, 5,  9}, {3, 8, 12}, {5, 9, 14}};

     //
        // compare int a with max element of first row if less, compare to second largest... until we find an element smaller than a


        int row=0;
        int col=array[0].length-1;
        while (row <array.length & col >-1) {
            //System.out.println(row);
            if (a==array[row][col]){
                return true;
            }
            else if (a > array[row][col]){
                row++;
            }else{
                col--;
            }
        }
         return false;
    }

    //static void main()
    public static void main(String[] args){
        test t=new test();
        int[][] array=  { {2, 5,  9}, {3, 8, 12}, {5, 9, 14}};
        System.out.println(t.findNum(9, array));
    }
}

package sorting;

/**
 * Created by n0271239 on 9/21/2017.
 */
public class MyInsertionSort {

    public static void main(String[] args) {

        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        insertionSort(input);
    }

    private static void printNumbers(int[] input) {

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }

    private static void swapNumbers(int i, int j, int[] array) {

        int temp=array[j];
        array[j]=array[i];
        array[i]=temp;
    }
    public static void insertionSort(int array[]) {

        for (int j = 1; j < array.length; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
            printNumbers(array);
        }
    }
    // acidentally implemented selection sort
/*    public static void insertionSort(int array[]) {

        for(int i=0; i< array.length; i++){
            for(int j=i; j<array.length; j++){
               if(array[i]> array[j])
                    swapNumbers(i, j, array);
            }
            printNumbers(array);
        }
    }*/

}

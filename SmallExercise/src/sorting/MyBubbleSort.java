package sorting;

/**
 * Created by n0271239 on 9/21/2017.
 * Bubble sort is a simple sorting algorithm that works by repeatedly stepping through the list to be sorted,
 * comparing each pair of adjacent items and swapping them if they are in the wrong order.
 * The pass through the list is repeated until no swaps are needed, which indicates that the list is sorted.
 * The algorithm gets its name from the way smaller elements bubble to the top of the list.
 * Because it only uses comparisons to operate on elements, it is a comparison sort.
 * You can see the code implementation below:
 */
public class MyBubbleSort {
    // logic to sort the elements
    public static void bubble_srt(int[] array) {

        for(int j=0; j<array.length; j++) {


            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] < array[i])
                    swapNumbers(i, i + 1, array);
            }
            printNumbers(array);
        }
    }

    private static void swapNumbers(int i, int j, int[] array) {

        int temp=array[j];
        array[j]=array[i];
        array[i]=temp;
    }

    private static void printNumbers(int[] input) {
        for(int i =0; i< input.length; i++){
            System.out.print(input[i]+",");
        }

        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        bubble_srt(input);

    }
}

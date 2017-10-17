package algorithm;

/**
 * Implement Binary search in java using divide and conquer technique.
 * A binary search or half-interval search algorithm finds the position of a specified value (the input "key")
 * within a sorted array. In each step, the algorithm compares the input key value with the key value of
 * the middle element of the array. If the keys match, then a matching element has been found so its index,
 * or position, is returned. Otherwise, if the sought key is less than the middle element's key,
 * then the algorithm repeats its action on the sub-array to the left of the middle element or,
 * if the input key is greater, on the sub-array to the right. If the remaining array to be searched
 * is reduced to zero, then the key cannot be found in the array and a special "Not found" indication is returned.
 **/
public class MyBinarySearch {

    public int binarySearch(int[] inputArr, int key) {

        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        MyBinarySearch mbs = new MyBinarySearch();
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println("Key 14's position: "+mbs.binarySearch(arr, 14));
        int[] arr1 = {6,34,78,123,432,900};
        System.out.println("Key 432's position: "+mbs.binarySearch(arr1, 432));
    }
}

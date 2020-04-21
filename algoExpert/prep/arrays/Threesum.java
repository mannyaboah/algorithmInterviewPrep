package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * Write a function that takes in a non-empty array of distinct integers and an
 * integer representing a target sum. The function should find all triplets in
 * the array that sum up to the target sum and return a two-dimensional array of
 * all these triplets. The numbers in each triplet should be ordered in
 * ascending order, and the triplets themselves should be ordered in ascending
 * order with respect to the numbers they hold.
 * 
 * Solution: first sort the list - Create a left pointer and a right pointer, -
 * for each item in the array set the left pointer to the current item + 1 and
 * the right to the end of the list, - compare the tree numbers and if they add
 * to the sum add to the list, - if it is less than the sum then we want to pick
 * the next compariso that will increase our current sum, - since we already
 * sorted our array -> if we move the left pointer >> we increase the sum. -
 * Else if is is greater, we decrease by moving the right pointer <<. - We keep
 * squeezing the pointers until we reach the target sum (then we add the
 * triplets to the final list) or the pointers cross each other (We exit and
 * move to the next number in the list).
 */
public class Threesum {

    public static void main(String[] args) {

        int[] testdata = { 12, 3, 1, 2, -6, 5, -8, 6 };

        List<Integer[]> results = threeNumberSum(testdata, 0);

        results.forEach(array -> {
            System.out.print(Arrays.toString(array));
        });
        System.out.println();
    }

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {

        Arrays.sort(array);
        List<Integer[]> finalList = new ArrayList<Integer[]>();

        for (int i = 0; i < array.length; i++) {

            int leftPointer = i + 1;
            int rightPointer = array.length - 1;

            while (leftPointer < rightPointer) {

                int currentsum = array[i] + array[leftPointer] + array[rightPointer];

                if (currentsum < targetSum) {
                    leftPointer++;
                } else if (currentsum > targetSum) {
                    rightPointer--;
                } else {
                    finalList.add(new Integer[] { array[i], array[leftPointer], array[rightPointer] });
                    rightPointer--;
                    leftPointer++;
                }
            }

        }

        return finalList;
    }

}
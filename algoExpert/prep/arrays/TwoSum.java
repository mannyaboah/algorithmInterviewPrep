package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
  Write a function that takes in a non-empty array of distinct integers and an
  integer representing a target sum. If any two numbers in the input array sum
  up to the target sum, the function should return them in an array, in any
  order. If no two numbers sum up to the target sum, the function should return
  an empty array.

  soln:
  The solution is to follow the x + y = sum formula and solve for y where x is the
  current number, y is a number that was previously seen in the provided array and
  sum is the target sum:
  so -> targertSum - curentNumber = y (a previously seen number stored in a list)
  Track the current some during iterations: check if the sum is in the list, this
  sum would also be a number previously seen if the twoSum exists
 */
public class TwoSum {
    public static void main(String[] args) {
        
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};

        System.out.println(Arrays.toString(twoNumberSum(array, 10)));
    }

    public static int[] twoNumberSum(int[] array, int targetSum){

        if(array.length < 2) return new int[]{};

        List<Integer> numsSofar = new ArrayList<Integer>();

        for(int i=0; i < array.length; i++){
            int currentSum = targetSum - array[i];
            if(!numsSofar.contains(currentSum)) numsSofar.add(array[i]);
            else return new int[]{array[i], currentSum};
        }

        return new int[]{};
    }

}
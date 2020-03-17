package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SmallestDifference {

    public static void main(String[] args) {
        System.out.println("Test");

        int[] arrayOne = { -1, 5, 10, 20, 28, 3 };
        int[] arrayTwo = { 26, 134, 135, 15, 17 };

        System.out.println(Arrays.toString(smallestDifference(arrayOne, arrayTwo)));

    }

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {

        if (arrayOne.length < 1)
            return new int[] {};

        int smallestdiff = Integer.MAX_VALUE;
        int[] differences = { 0, 0 };

        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        int p1 = 0;
        int p2 = 0;

        while (p1 < arrayOne.length && p2 < arrayTwo.length) {
            int currentDiff = Math.abs(arrayOne[p1] - arrayTwo[p2]);
            if (smallestdiff > currentDiff) {
                smallestdiff = currentDiff;
                differences[0] = arrayOne[p1];
                differences[1] = arrayTwo[p2];
            }
            if (arrayOne[p1] < arrayTwo[p2])
                p1++;
            else if (arrayOne[p1] > arrayTwo[p2]) {
                p2++;
            } else {
                return differences = new int[] { arrayOne[p1], arrayTwo[p2] };
            }

        }

        return differences;
    }

    public int solution(int[] A) {
        // write your code in Java SE 8

        List<Integer> seen = new ArrayList<Integer>();

        int minvalue = Integer.MAX_VALUE;
        int currentMin = 0;

        for (int i = 0; i < A.length; i++) {
            seen.add(A[i]);
            if (A[i] < minvalue)
                minvalue = A[i];
            if (minvalue < 0)
                minvalue = 1;
        }

        currentMin = setMinNotInList(seen, minvalue);

        return currentMin;

    }

    public static int setMinNotInList(List<Integer> l, int n) {

        while (l.contains(n)) {
            n++;
        }
        return n;
    }

}
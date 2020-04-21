package arraysAndStrings;

import java.util.Arrays;

class ArrayRotation {

    public static void main(String[] args) {

        int d = 13;
        int[] a = { 33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97 };

        System.out.println(Arrays.toString(rotLeft(a, d)));

    }

    static int[] rotLeft(int[] a, int d) {

        if (a.length < 2)
            return a;
        int result[] = new int[a.length];
        for (int i = 0; i < a.length; ++i) {
            int nextIdx = (d - i) > 0 ? a.length - (d - i) : i - d;
            result[nextIdx] = a[i];
        }
        return result;
    }
}
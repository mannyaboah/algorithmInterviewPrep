package recursion;

import java.util.ArrayList;
import java.util.List;

public class Productsum {

    public static void main(String[] args) {

    }

    public static int productSum(List<Object> array) {

        return productSummer(array, 1);
    }

    public static int productSummer(List<Object> array, int depth) {

        int sum = 0;

        for (Object e : array) {
            if (e instanceof ArrayList) {
                sum += productSummer((ArrayList) e, depth + 1);
            } else {
                sum += (int) e;
            }
        }

        return sum * depth;
    }

}
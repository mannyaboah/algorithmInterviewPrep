package recursion;

import java.util.HashMap;

class Nthfibonacci {

    public static void main(String[] args) {
        
        System.out.println("Testing nth fibonacci sequence using memoization, " 
            + "dynamic programming and regular recursion"
            + "\n--------------------------------------------------------------------------------\n");
        
        long startTime = System.nanoTime();
        System.out.println("Get 40th fibonacci sequence recursively: " + getNthfibRecurr(40));
        long endTime = System.nanoTime();
        long elapsed = endTime - startTime;
        System.out.println("Recursive method took: " + elapsed + " nano seconds to run\n");

        startTime = System.nanoTime();
        System.out.println("Get 40th fibonacci sequence with memoized recursion: " + getNthFibMemo(40));
        endTime = System.nanoTime();
        elapsed = endTime - startTime;
        System.out.println("Memoization method took: " + elapsed + " nano seconds to run\n");

        startTime = System.nanoTime();
        System.out.println("Get 40th fibonacci sequence with dynamic programming: " + getNthFibDynamo(40));
        endTime = System.nanoTime();
        elapsed = endTime - startTime;
        System.out.println("Dynamic Programming method took: " + elapsed + " nano seconds to run\n");

    }

    // Memoization
    public static int getNthFibMemo(int n){

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 0);
        map.put(2, 1);

        return getNthFibMemo(map, n);
    }

    private static int getNthFibMemo(HashMap<Integer, Integer> map, int n) {
        
        if(map.containsKey(n)) return map.get(n);
        else map.put(n, getNthFibMemo(map, n - 1) + getNthFibMemo(map, n - 2));
        
        return map.get(n);
    }

    // Dynamic programming
    public static int getNthFibDynamo(int n) {

        int[] fibArray = {0, 1};
        int i = 2;

        while(i < n){
            int next = fibArray[0] + fibArray[1];
            fibArray[0] = fibArray[1];
            fibArray[1] = next;
            ++i;
        }

        return n < 2 ? fibArray[0] : fibArray[1];
    }

    // Regular recursion
    public static int getNthfibRecurr(int n){
        if(n == 1) return 0;
        if(n == 2) return 1;

        return getNthfibRecurr(n - 1) + getNthfibRecurr(n - 2);
    }

    public static int getFib(int n){

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(2, 1);
        
        return getFibber(map, n);
    }

    private static int getFibber(HashMap<Integer, Integer> map, int n) {
        if(map.containsKey(n)){
            return map.get(n);
        }else{
            map.put(n, getFibber(map, n - 1) + getFibber(map, n - 2));
        }
        
        return map.get(n);
    }


}
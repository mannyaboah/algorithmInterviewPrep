package graphs;

class SingleCycleCheck {


    public static void main(String[] args) {

        int[] test = {2, 3, 1, -4, -4, 2};

        System.out.println(hasSingleCycle(test));

    }

    public static boolean hasSingleCycle(int[] array) {

        int currentIndex = 0;
        int visitedCount = 0;
        int len = array.length;

        while (visitedCount < len) {
            if((visitedCount > 0) && (currentIndex == 0)) return false;
            currentIndex = getNextIndex(currentIndex, array);
            ++visitedCount;
        }

        return currentIndex == 0;
    }

    private static int getNextIndex(int index, int[] array) {
        
        int next = (index + array[index]) % array.length;
        
        return next >= 0 ? next : (next + array.length);
    }
}
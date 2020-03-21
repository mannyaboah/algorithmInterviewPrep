package  algoExpert.prep.searching;

class BinarySearch {

    public static void main(String[] args) {

        int[] array = { 0, 1, 21, 33, 45, 45, 61, 71, 72, 73 };

        System.out.println(binarySearchIter(array, 33));
        System.out.println(binarySearch(0, array.length - 1, array, 33));
    }

    public static int binarySearchIter(int[] array, int target) {

        if (array.length < 1)
            return -1;

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (array[mid] > target) {
                end = mid - 1;
            } else if (array[mid] < target) {
                start = mid + 1;
            } else
                return mid;
        }

        return -1;
    }

    public static int binarySearch(int start, int end, int[] array, int target) {

        int mid = (start + end) / 2;

        if(start > end){
            return -1;
        }

        if (array[mid] > target) {
            end = mid - 1;
            return binarySearch(0, end, array, target);
        } else if (array[mid] < target) {
            start = mid + 1;
            return binarySearch(start, end, array, target);
        } else if (array[mid] == target) {
            return mid;
        }

        return -1;
    }

}
import java.util.ArrayList;
import java.util.List;

class AsignmentII {

    public static void main(String[] args) {

        int[] array = {2, 4, 9, 6, 7, 9, 2};

        System.out.println(countForme(array));
        
        
    }


    //array of integers : return count of integer pairs that sum to 11 : positive integers, 0 - 9
    // [2, 4, 9, 6, 7, 9, 2] return 2

    public static int countForme(int[] array){
        
        int count = 0;

        List<Integer> nums = new ArrayList<Integer>();

        // x + y = 11

        for(int i=0; i < array.length; ++i){
            
            if(!nums.contains(array[i])){
                nums.add(array[i]);
            }
            int res = 11 - array[i];
            if(nums.contains(res)){
                count++;
            }
            
        }

        return count;
    }
}
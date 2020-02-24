import java.util.ArrayList;
import java.util.List;

public class VWtest{
    
    public static void main(String[] args) {
       
        List<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        test.add(6);
        test.add(7);
        test.add(8);
        test.add(9);
        test.add(10);

        System.out.println(plusMult(test));

    }


    public static String plusMult(List<Integer> A){

        int fast = 4;
        int slow = 2;

        int oddfast = 5;
        int oddSlow = 3;

        int even = A.get(0);
        int odd = A.get(1);

        while(fast < A.size() && oddfast < A.size()){
        
            even = even * A.get(slow) + A.get(fast);
            odd = odd * A.get(oddSlow) + A.get(oddfast);

            oddSlow = oddfast + 2;
            oddfast += 4;
      
            slow = fast + 2;
            fast += 4;
        }

        return (even % 2) > (odd % 2) ? String.valueOf(even % 2) : String.valueOf(odd % 2);
    }
    
}
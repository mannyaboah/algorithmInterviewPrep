package warmup;

import java.util.Stack;

public class MountainAndValleys {

    public static void main(String[] args) {

        String s = "UDDDUDUU";

        System.out.println(countingValleystwo(8, s));

    }

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {

        Stack<Character> mntVal = new Stack<>();
        int cnt = 0;
        char prev = Character.MIN_VALUE;

        mntVal.push(s.charAt(0));

        for (int i = 1; i < n; i++) {
            if (mntVal.isEmpty() && prev == 'D') {
                cnt++;
            } else if (s.charAt(i) == mntVal.peek())
                mntVal.push(s.charAt(i));
            else
                prev = mntVal.pop();
        }

        return cnt;
    }

    static int countingValleystwo(int n, String s) {

        int sealevel = 0;
        int cnt = 0;

        for(int i = 0; i < n; i++){

            if(s.charAt(i) == 'D') sealevel -= 1;
            else if(s.charAt(i) == 'U') {
                if((sealevel + 1) == 0) cnt++;
                sealevel += 1;
            }
            
        }

        return cnt;
    }

}
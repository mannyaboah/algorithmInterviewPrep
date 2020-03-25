package strings;

/**
 * Write a function that, given a string, returns its longest palindromic
 * substring. A palindrome is defined as a string that is written the same
 * forward and backward. Assume that there will only be one longest palindromic
 * substring.
 */

class LongestPalindromicSubstring {

    public static void main(String[] args) {
        String test = "asghkrjklabaxyzzyxfwfhjhjvbsgel";

        long start = System.nanoTime();
        String result = longestPalindromicSubstringII(test);
        long end = System.nanoTime();

        long durationInNano = (end - start);
        
        System.out.println("longest palindrome for my method is: " + result + "\nRan in : " + durationInNano + " nano seconds");

        long startII = System.nanoTime();
        String resultII = longestPalindromicSubstring(test);
        long endII = System.nanoTime();

        long durationInNanoII = (endII - startII);

        System.out.println("longest palindrome for AlgoExpert method is: " + resultII + "\nRan in : " + durationInNanoII + " nano seconds");

    }

    public static String longestPalindromicSubstring(String str) {
        int[] currentLongest = {0, 1};
        for(int i=0; i < str.length(); i++){
            int[] odd = getLongestPalindrome(str, i - 1, i + 1);
            int[] even = getLongestPalindrome(str, i - 1, i);
            int[] longest = odd[1] - odd[0] > even[1] - even[0] ? odd : even;
            
            currentLongest = currentLongest[1] - currentLongest[0] > longest[1] - longest[0] ? currentLongest : longest;
        }
        
        return str.substring(currentLongest[0], currentLongest[1]);
    }

    private static int[] getLongestPalindrome(String str, int leftidx, int rightidx) {
        while(leftidx >= 0 && rightidx < str.length()){
            if(str.charAt(leftidx) != str.charAt(rightidx)) break;
            leftidx --;
            rightidx ++;
        }
        return new int[] {leftidx + 1, rightidx};
    }

    public static String longestPalindromicSubstringII(String str) {
       
        int front = 0;
        int end = str.length();
        String longest = "";

        while(front < end){
            if(str.charAt(front) == str.charAt(end - 1)){
                String sub = str.substring(front, end);
                longest = longest.length() < palindromicSubstring(sub).length() ? palindromicSubstring(sub) : longest;
                front++;
                end = str.length();
            }
            else if(front == end && (end < str.length())){
                front++;
                end = str.length();
            }else{
                end--;
            }
        }

        return longest;
    }

    public static String palindromicSubstring(String str){
        boolean isPalindrome = true;
        int  j = str.length() - 1;
        for(int i=0; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(j)) isPalindrome = false;
            j--;
        }
        return isPalindrome == true ? str : "";
    }

    // n^3 solution
    

}
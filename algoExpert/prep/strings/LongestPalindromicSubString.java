package strings;

/**
 * Write a function that, given a string, returns its longest palindromic
 * substring. A palindrome is defined as a string that is written the same
 * forward and backward. Assume that there will only be one longest palindromic
 * substring.
 */

class LongestPalindromicSubstring {

    public static void main(String[] args) {
        String test = "abaxyzzyxf";

        long start = System.nanoTime();
        String result = longestPalindromicSubstringII(test);
        long end = System.nanoTime();

        long durationInNano = (end - start);
        
        System.out.println("longest palindrome for my method is: " + result + "\nRan in : " + durationInNano + " nano seconds");

    }

    public static String longestPalindromicSubstring(String str) {
        // Write your code here.
        return "";
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

}
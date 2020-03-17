package arrays;

import java.util.List;

class EndOfList {

    public static void main(String[] args) {

        // List<Integer> test = new ArrayList<>(Arrays.asList(2,1,2,3,4,5,2,2,2,2,5));

        // System.out.println(test);

        // //swap(test, 1, 9);

        // //System.out.println(/* "Test find index :\n" + findIndex(test, 2) */ test);

        // System.out.println("Array size: " + test.size());

        // System.out.println(moveElementToEnd(test, 2));
        // char c = 'a';
        //String s = "start";
        // for(int i = 0; i < s.length(); i++){
            
        //     if(s.charAt(i) == '?'){
        //         s = s.replace(s.charAt(i), c);
        //         c++;
        //     }
           
        // }
        
        //System.out.println(s.substring(0, 4) + "a" + s.substring(4));

        System.out.println(greatestInt(23476, 5));

    }

    public String solution(String riddle) {
        // write your code in Java SE 8
        char c = 'a';
        
        int len = riddle.length() - 1;
        
        if(riddle.charAt(0) == '?'){
            riddle = riddle.replace(riddle.charAt(0), c);
        }
       
        if(riddle.charAt(len) == '?'){
            riddle = riddle.replace(riddle.charAt(len), c);
        }
        
        for(int i=1; i < len - 2; i++){
            if(riddle.charAt(i) == '?'){
               if(riddle.charAt(i-1) == c) c++;
               if(riddle.charAt(i+1) == c) c++;
               riddle = riddle.replace(riddle.charAt(i), c);
               c++;
            }

        }
        
        return riddle;
    }

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        
        int i = 0;
        int j = array.size() - 1;

        while(i < j){
            while((i < j) && array.get(j) == toMove) j--;
            if(array.get(i) == toMove) swap(array, i, j);
            i++;
        }
        
        return array;
    }

    public static void swap(List<Integer> array, int i, int j) {
        int temp = array.get(j);
        array.set(j, array.get(i));
        array.set(i, temp);
    }

    public static int greatestInt(int n, int num){
        
        int max = Integer.valueOf(String.valueOf(n) + num) > Integer.valueOf(num + String.valueOf(n)) 
        ? Integer.valueOf(String.valueOf(n) + num) 
        : Integer.valueOf(num + String.valueOf(n));

        String s = String.valueOf(n);
        System.out.println("previous number: " + n);
        for(int i=1; i < s.length(); i++){
           String word = s.substring(0, i) + num + s.substring(i);
           System.out.println("New number: " + word);
           max = max > Integer.parseInt(word) ? max : Integer.parseInt(word);
        }

        return max;
    }

}
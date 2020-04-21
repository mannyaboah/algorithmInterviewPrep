import java.util.List;

/**
 * Write GetNBytes with a library that exposes Get4Bytes
 * [a, b, c, d]
 */

 class AssignmentTwo {

    public static void main(String[] args) {
        
    }
    //Rest call
    public static byte[] getNBytes(int n){

        //if less, not a multiple of 4, negative number
        
       
        byte[] bytes = new byte[4];
        byte[] results = new byte[n];
        

        if(n < 4){
           bytes = get4Bytes();
           for(int i=0; i < n; ++i){
            results[i] = bytes[i];
        }
        int numObytesTogetrm = n % 4;
        int numObytesToget = n / 4;
        
        // n= 10
        for(int i=0; i < numObytesToget; i++){
            byte[] moreBytes = new byte[n * 4];
            moreBytes =
            results = get4Bytes();
        }

        if(n % 4 != 0){
            numObytesToget = n % 4;
        }

        }

       

        return results;
    }

    private static byte[] get4Bytes() {
        return null;
    }
 }
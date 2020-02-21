package algorithmsPrep.arrayProblems;

public class AmazonGCD {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] array = {2, 4, 6, 8, 10};
		
		System.out.println(generalizedGCD(5, array));

	}

	public static int generalizedGCD(int num, int[] arr)
	{
		// WRITE YOUR CODE HERE
		int gcd = 0;
		
		int max = findmax(arr);
		
		//System.out.println("Max in array: " + max);
				
		while(max > 0) {
						
			int count = 0;
			
			for(int i=0; i < num; i++) {
				
				if(arr[i] % max == 0) count ++;
				
				if(count == num) gcd = gcd > max ? gcd : max;
				
			}
			
			max--;
		}
		
		
		return gcd;
	}
	
	public static int findmax(int[] arr) {
		
		int max = 0;
		
		for(int i=0; i < arr.length; i++) {
			max = max > arr[i] ? max : arr[i];
		}
		
		return max;
	}

}

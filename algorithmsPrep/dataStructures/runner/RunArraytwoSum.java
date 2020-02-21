package algorithmsPrep.dataStructures.runner;

import java.util.ArrayList;
import java.util.List;

public class RunArraytwoSum {

	public static void main(String[] args)
	{
		int[] array = {3,5,-4,8,11,1,-1,6};
		int targetSum = 10;
		
		int[] result = twoSum(array, targetSum);
		
		System.out.println("["+ result[0] + ", " + result[1] + "]");

	}
	
	static int[] twoSum(int[] array, int targetSum)
	{
		List<Integer> sums = new ArrayList<Integer>();
		
		for(int i = 0; i < array.length; i++){
			
			int x = targetSum - array[i];
			
			if(!sums.contains(x)) {
				sums.add(array[i]);
				continue;
			}
			return new int[] {array[i], x};
		}
		
		return new int[] {};
	}

}

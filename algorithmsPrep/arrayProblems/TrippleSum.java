package algorithmsPrep.arrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrippleSum {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

	public static List<Integer[]> threeNumberSum(int[] array, int targetSum)
	{
		Arrays.sort(array);
		
		List<Integer[]> tripples = new ArrayList<Integer[]>();

		for (int i = 0; i < array.length; i++)
		{

			int left = i + 1;
			int right = array.length - 1;

			while (left < right)
			{

				int currSum = array[i] + array[left] + array[right];
				
				if (currSum == targetSum)
				{
					Integer[] tripple = {array[i], array[left], array[right]};
					tripples.add(tripple);
					left ++;
					right --;
				}
				else if(currSum < targetSum) left++;
				else if(currSum > targetSum) right--;

			}

		}

		return tripples;
	}

}

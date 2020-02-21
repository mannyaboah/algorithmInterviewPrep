package algorithmsPrep.arrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AmazonDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] array = {1,0,0,0,0,1,0,0};
		
		System.out.println(cellCompete(array, 1));
		
	}

	public static List<Integer> cellCompete(int[] states, int days)
	{
		// WRITE YOUR CODE HERE
		List<Integer> finalarray = new ArrayList<Integer>();

		int[] prev = new int[states.length];

		if(states.length < 1) return finalarray;
		
		while (days > 0)
		{
			prev = Arrays.copyOf(states, states.length);
			finalarray = new ArrayList<Integer>();
			
			for(int i=0; i < prev.length; i++) {
				
				if(i == 0) {
					states[i] = prev[i+1] == 0 ? 0 : 1;
					finalarray.add(states[i]);
				}
				else if(i == prev.length - 1) {
					states[i] = prev[i-1] == 0 ? 0 : 1;
					finalarray.add(states[i]);
				}
				else {
					states[i] = prev[i - 1] == prev[i + 1] ? 0 : 1;
					finalarray.add(states[i]);
				}
			}
			days = days -1;
		}
		
		return finalarray;

	}

}

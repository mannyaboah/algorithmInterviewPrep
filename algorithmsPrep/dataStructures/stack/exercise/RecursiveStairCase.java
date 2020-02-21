package algorithmsPrep.dataStructures.stack.exercise;

import java.util.ArrayList;

public class RecursiveStairCase {
	
	int numberOfStairs;
	ArrayList<Integer> visited = new ArrayList<Integer>();
	
	public RecursiveStairCase(int numberOfStairs, ArrayList<Integer> visited)
	{
		this.numberOfStairs = numberOfStairs;
		this.visited.addAll(visited);
		this.visited.add(numberOfStairs);
	}

}

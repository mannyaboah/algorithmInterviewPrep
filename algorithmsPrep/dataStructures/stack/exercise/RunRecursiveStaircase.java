package algorithmsPrep.dataStructures.stack.exercise;

import java.util.ArrayList;
import java.util.Stack;

public class RunRecursiveStaircase {

	/**
	 * A program to solve the recursive Staircase problem Using a stack of
	 * arraylists
	 */
	public static void main(String[] args)
	{
		int destination = 4;
		Stack<RecursiveStairCase> stairStack = new Stack<RecursiveStairCase>();

		// add initial step to the stairStack
		stairStack.add(new RecursiveStairCase(0, new ArrayList<Integer>()));

		// Iterate throught the stack and
		while (!stairStack.isEmpty())
		{
			RecursiveStairCase currentStep = stairStack.pop(); System.out.println("We are at: " + currentStep.numberOfStairs);

			if (currentStep.numberOfStairs == destination)
			{
				System.out.println("Reached last step: \n" + "step#: "+ currentStep.numberOfStairs + ", list: " + currentStep.visited);
				continue;
			}
			int oneStep = currentStep.numberOfStairs + 1;
			int twoStep = currentStep.numberOfStairs + 2;
			
			if(oneStep <= destination) stairStack.add(new RecursiveStairCase(oneStep, currentStep.visited)); 
			System.out.println("adding step: [" + oneStep + "] and visited list so far: " + currentStep.visited);
			if(twoStep <= destination) stairStack.add(new RecursiveStairCase(twoStep, currentStep.visited));
			System.out.println("adding step: [" + twoStep + "] and visited list so far: " + currentStep.visited);
			
		}

	}

}

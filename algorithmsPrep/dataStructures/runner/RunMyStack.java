package algorithmsPrep.dataStructures.runner;

import algorithmsPrep.dataStructures.stack.MyStack;

public class RunMyStack {

	public static void main(String[] args)
	{
		MyStack<String> stack = new MyStack<String>(10);
		
		String[] elems = {"Gret", "Goose", "Manny", "Mom", "Sayid", "Fozzy", "Ms Piggy", "Gran", "SheyShey", "Samiat", "Samiat"};
		
		int i=0;
		while(i < elems.length)
		{
			stack.push(elems[i]);
			System.out.println("Pushed: [" + elems[i] + "] on to the stack");
			i++;
		}
		System.out.println("Value of top is: " + stack.getTop());
		
		System.out.println("________________________________________\n");
		
		while(stack.getTop() > -1)
		{
			System.out.println("Popped: [" + stack.pop() + "] off the stack");
		}
		
	}
}

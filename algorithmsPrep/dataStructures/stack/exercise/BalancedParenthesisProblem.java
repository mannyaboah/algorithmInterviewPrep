package algorithmsPrep.dataStructures.stack.exercise;

import java.util.Stack;

public class BalancedParenthesisProblem {

	private static final String balancedToken = "[{}()[]({[]})]";
	private static final String unbalancedToken = "([({)}() {}])";

	// Test strings to see if they are balanced
	public static void main(String[] args)
	{
		boolean result1 = isBalanced(balancedToken);
		boolean result2 = isBalanced(unbalancedToken);

		System.out.println("Token 1 is balanced?: " + result1);
		System.out.println("Token 2 is balanced?: " + result2);

	}

	public static boolean isBalanced(String exp)
	{
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < exp.length(); ++i)
		{
			char c = exp.charAt(i);
			if (isOpen(c))
			{
				stack.push(c);
			}
			else if (isClosed(c))
			{
				char top = stack.pop();
				if (!isMatch(top, c))
					return false;
			}
		}
		System.out.println("\nIn my stack: " + stack);
		return stack.isEmpty();
	}

	public static boolean isMatch(char open, char close)
	{
		return ((open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}'));
	}

	public static boolean isOpen(char open)
	{
		return (open == '(' || open == '{' || open == '[');
	}

	public static boolean isClosed(char close)
	{
		return (close == ')' || close == '}' || close == ']');
	}

}

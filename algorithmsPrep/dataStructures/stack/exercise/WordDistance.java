package algorithmsPrep.dataStructures.stack.exercise;

import java.util.Stack;

public class WordDistance {
	
	/*
	 * Program to determine if there is a distance(a path via similar chars)
	 * between a start word and an end word in a list 
	 */
	public static void main(String[] args)
	{
		String[] dict = {"hot", "dot", "dog", "lot", "log", "cog"};
		
		String startword = "hit";
		String endword = "cog";		
		
		boolean path = findPath(dict, startword, endword);
		System.out.println("There is a path form " + startword + " to " + endword + ": " + path);
	}
	
	public static boolean findPath(String[] dict, String start, String end)
	{
		boolean isFound = false;
		boolean[] visited = new boolean[dict.length];
		
		Stack<String> stack = new Stack<String>();
		stack.push(start);
		
		while(!stack.isEmpty())
		{
			String word = stack.pop();
			if(distance(word, end) == 0)
			{
				stack.push(word);
				System.out.println(stack);
				isFound = true;
				break;
			}
			
			for(int i=0; i < dict.length; ++i)
			{
				if(visited[i] == true) continue;
				
				int distance = distance(word, dict[i]);
				
				if(distance == 1)
				{
					visited[i] = true;
					if(!stack.contains(word)) stack.push(word);
					stack.push(dict[i]);
				}
			}
		}
		
		return isFound;
	}

	private static int distance(String word, String end)
	{
		int diff = word.length();
		for(int i=0; i < word.length(); ++i)
		{
			if(word.charAt(i) == end.charAt(i)) --diff;
		}
		return diff;
	}

}

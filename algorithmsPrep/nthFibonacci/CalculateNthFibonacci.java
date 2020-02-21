package algorithmsPrep.nthFibonacci;

import java.util.HashMap;
import java.util.Map;

public class CalculateNthFibonacci {

	public static void main(String[] args)
	{
		System.out.println("Recursive: " + getNthFib(6));
		System.out.println("Recursive with memoization: " + getNthFibMem(6));
		System.out.println("Iterative: " + getNthFibIter(6));
	}

	/*
	 * Recursive solution Time: O(2^n) | Space: O(1)
	 */
	public static int getNthFib(int n)
	{

		if (n == 2)
			return 1;

		if (n == 1)
			return 0;

		return getNthFib(n - 1) + getNthFib(n - 2);

	}

	/*
	 * Memoized recursion Time: O(n) | Space: O(n)
	 */
	public static int getNthFibMem(int n)
	{
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 0);
		map.put(2, 1);

		return getNthFibMem(map, n);
	}

	/*
	 * Momoize Helper
	 */
	public static int getNthFibMem(Map<Integer, Integer> memoize, int n)
	{
		if (memoize.containsKey(n))
		{
			return memoize.get(n);
		} else
		{
			memoize.put(n, getNthFibMem(memoize, n - 1) + getNthFibMem(memoize, n - 2));
			return memoize.get(n);
		}
	}

	/*
	 * Iterative soln
	 * Time: O(n) | Space: O(n)
	 * */
	public static int getNthFibIter(int n)
	{
		int[] lastTwo = { 0, 1 };

		int cnt = 3;

		while (cnt <= n)
		{
			int nthFib = lastTwo[0] + lastTwo[1];
			lastTwo[0] = lastTwo[1];
			lastTwo[1] = nthFib;
			cnt ++;
		}

		return n > 1 ? lastTwo[1] : lastTwo[0];
	}

}

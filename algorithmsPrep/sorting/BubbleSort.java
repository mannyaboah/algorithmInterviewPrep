package algorithmsPrep.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args)
	{
		int[] testArray = {2, 5, 1, 3, 4, 9, 7, 6, 5};
		
		int[] res = sort(testArray);
		
		System.out.println(Arrays.toString(res));
	}

	/*
	 * Iterate through the array, starting from the beginning, check if the current
	 * number is < or > the next and if > swap. Keep swapping until the end of the
	 * array an start over until no swaps occur
	 */
	public static int[] sort(int[] array)
	{
		if(array.length == 0) return new int[] {};
		
		boolean didSwap = true;
		int counter = 0;

		while (didSwap)
		{
			didSwap = false;

			for (int i = 0; i < array.length - 1 - counter; i++)
			{
				if (array[i] > array[i+1])
				{
					swap(i, i+1, array);
					didSwap = true;
				}
			}
			counter++;
		}

		return array;
	}

	public static void swap(int i, int j, int[] array)
	{
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}

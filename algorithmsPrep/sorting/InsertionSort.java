package algorithmsPrep.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args)
	{
		int[] testArray = { 2, 5, 1, 3, 4, 9, 7, 6, 5 };

		int[] res = sort(testArray);

		System.out.println(Arrays.toString(res));

	}

	public static int[] sort(int[] array)
	{

		if (array.length == 0)
			return new int[] {};

		for (int i = 1; i < array.length; i++)
		{
			int j = i;

			while (j > 0 && array[j] < array[j - 1])
			{
				swap(j, j - 1, array);
				j -= 1;
			}

		}

		return array;
	}

	public static void swap(int i, int j, int[] array)
	{
		int temp = array[j];
		array[j] = array[i];
		array[i] = temp;
	}

}

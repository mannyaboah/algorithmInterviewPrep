package algorithmsPrep.dataStructures.runner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import algorithmsPrep.dataStructures.hashMap.MyHashMap;

public class RunMyHashMap {

	public static void main(String[] args)
	{
		MyHashMap<String> map = new MyHashMap<String>(10);

		map.put(13, "Manny");
		map.put(11, "Greta");
		map.put(10, "Goose");

		System.out.println("item 10: " + map.getItem(10));
		System.out.println("item 11: " + map.getItem(11));
		System.out.println("item 13: " + map.getItem(13));

		/*
		 * Amazon interview question: Given an integer array, return all unique integers
		 * in the array Ex: {6,6,1,5,5,8,7,7,2,3,2,9}
		 */

		int[] numbers = { 6, 6, 1, 5, 5, 8, 7, 7, 2, 3, 2, 9, 5 };

		HashMap<Integer, Integer> numMap = new HashMap<>();

		List<Integer> uniqNums = new ArrayList<Integer>();

		/*
		 * Iterate through the Array, check if the number(key) is in the map, If the
		 * number is found, increment it's count(value) else add to the map and mark
		 * count as 1
		 */
		for (int i = 0; i < numbers.length; ++i)
		{
			if (numMap.get(numbers[i]) != null)
			{
				int count = numMap.get(numbers[i]);
				numMap.put(numbers[i], count + 1);
			} else
			{
				numMap.put(numbers[i], 1);
			}
		}

		System.out.println("unique numbers: ");
		numMap.forEach((k, v) ->
		{
			if (v == 1)
				System.out.print(k + " ");
		});

	}
}

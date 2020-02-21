package algorithmsPrep.arrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AmazonTopNcompetitors {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		List<String> reviews = new ArrayList<String>();
		reviews.add("this is a split test");
		reviews.add("I want to split this and split again with test and test");
		reviews.add("blah blah test blah");

		// String[] words = {};

		// words = reviews.get(0).split(" ");

		List<String> competitors = new ArrayList<String>();
		competitors.add("blah");
		competitors.add("test");
		competitors.add("split");

//		for (int i = 0; i < reviews.size(); i++)
//		{
//			String[] temp = reviews.get(i).split(" ");
//			splitReviews.add(temp);
//		}
//
//		// System.out.println("words array size: " + words.length + ", " +
//		// Arrays.deepToString(words));
//
//		splitReviews.forEach(a ->
//		{
//			System.out.println(Arrays.toString(a));
//		});
//		
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		map.put("a", 1);
//		map.put("b", 2);
//		map.put("c", 5);
//		map.put("d", 8);
//		
//		System.out.println(calculateMax(map));

		System.out.println(topNCompetitors(3, 2, competitors, 3, reviews));

	}

	public static ArrayList<String> topNCompetitors(int numCompetitors, int topNCompetitors, List<String> competitors,
			int numReviews, List<String> reviews)
	{

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < reviews.size(); i++)
		{
			String[] temp = reviews.get(i).split(" ");

			for (int j = 0; j < temp.length; j++)
			{
				if (competitors.contains(temp[j]))
				{

					map.put(temp[j], map.getOrDefault(temp[j], 0) + 1);
//					if (map.containsKey(temp[j]))
//					{
//						int value = map.get(temp[j]);
//						map.put(temp[j], value + 1);
//					} else
//					{
//						map.put(temp[j], 1);
//					}
				}
			}

		}

		List<String> myreviews = new ArrayList<String>(map.keySet());
		System.out.println("my reviews before: " + myreviews);
		
		System.out.println();
		
		Collections.sort(myreviews,
				(r1, r2) -> map.get(r1).equals(map.get(r2)) ? r1.compareTo(r2) : map.get(r2) - map.get(r1));
		System.out.println("my reviews after: " + myreviews);
		
		// Sort by keys
//		TreeMap<String, Integer> sorted = new TreeMap<String, Integer>();
//		Iterator<String> it = map.keySet().iterator();
//		while (it.hasNext())
//		{
//			String key = it.next();
//			sorted.put(key, map.get(key));
//			System.out.println("current tree: " + sorted);
//		}
//		System.out.println();
//		System.out.println("Sorted map: " + sorted);
//
//		// Sort by value
//		List<Integer> vals = new ArrayList<>(map.values());
//		Collections.sort(vals);
//
//		ArrayList<String> finalList = new ArrayList<String>();
//
//		while (topNCompetitors > 0)
//		{
//			int max = calculateMax(map);
//
//			for (Map.Entry<String, Integer> entry : map.entrySet())
//			{
//				if (entry.getValue().equals(max))
//				{
//					finalList.add(entry.getKey());
//					map.remove(entry.getKey());
//				}
//			}
//			topNCompetitors--;
//		}
//
//		System.out.println("My map: " + map + "\nSorted by key: " + sorted + "\nSorted by value: " + vals);

		// ArrayList<String> result = new ArrayList<String>(myreviews.subList(0,
		// topNCompetitors));

		System.out.println("My map: " + map);

		return new ArrayList<String>(myreviews.subList(0, topNCompetitors));
	}

	public static int calculateMax(Map<String, Integer> map)
	{

		int max = Collections.max(map.values());

		return max;
	}

}

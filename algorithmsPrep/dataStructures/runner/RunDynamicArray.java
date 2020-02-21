package algorithmsPrep.dataStructures.runner;

import algorithmsPrep.dataStructures.dynamicArray.DynamicArray;

public class RunDynamicArray {

	public static void main(String[] args)
	{
		System.out.println("Testing");

		// Testing Dynamic array
		DynamicArray<Integer> da = new DynamicArray<Integer>();

		da.put(2);
		System.out.println("Array size: " + da.getSize());
		da.put(4);
		System.out.println("Array size: " + da.getSize());
		da.put(6);
		System.out.println("Array size: " + da.getSize());
		da.put(8);
		System.out.println("Array size: " + da.getSize());
		da.put(10);
		System.out.println("Array size: " + da.getSize());
		da.put(12);
		System.out.println("Array size: " + da.getSize());
		da.put(14);
		System.out.println("Array size: " + da.getSize());

		for (int i = 0; i < da.getSize(); i++)
		{
			System.out.print("[" + da.get(i) + "]");
		}

	}
}

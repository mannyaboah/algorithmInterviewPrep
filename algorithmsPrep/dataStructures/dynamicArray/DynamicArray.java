package algorithmsPrep.dataStructures.dynamicArray;

import java.util.Arrays;

public class DynamicArray<T> {

	Object[] array;
	int size;

	public DynamicArray() {
		array = new Object[1];
		size = 0;
	}

	public int getSize()
	{
		return array.length;
	}

	@SuppressWarnings("unchecked")
	public T get(int index)
	{
		return (T) array[index];
	}

	public void put(T element)
	{
		isfull(size + 1);
		array[size++] = element;
	}

	public void isfull(int minCapacity)
	{
		int oldCapacity = getSize();
		if (minCapacity > oldCapacity)
		{
			int newCapacity = oldCapacity * 2;
			if (newCapacity < minCapacity)
			{
				newCapacity = minCapacity;
			}
			array = Arrays.copyOf(array, newCapacity);
		}
	}
}

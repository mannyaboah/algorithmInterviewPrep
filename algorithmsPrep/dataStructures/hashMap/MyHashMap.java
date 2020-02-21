package algorithmsPrep.dataStructures.hashMap;

/**
 * Contains an array used to map/ link items via a hash function
 * 
 * @author Manny Aboah
 **/
public class MyHashMap<T> {

	Item[] itemArray;
	int size;

	public MyHashMap(int size) {
		this.size = size;
		itemArray = new Item[size];

		for (int i = 0; i < size; ++i)
		{
			itemArray[i] = new Item();
		}
	}

	/**
	 * A hash function used to link items and retrieve them from an index in the
	 * item array using a provided key
	 * 
	 * @param key
	 **/
	public int hashfunction(int key)
	{
		return key % size;
	}

	/**
	 * A method that adds an item to the front of the item linked list
	 * 
	 * @param item
	 */
	public void put(int key, Object value)
	{
		// first use the hash function to generate an index
		int index = hashfunction(key);

		Item newItem = new Item(key, value);
		Item itemInArray = itemArray[index];

		// put the new item into the array and link to head of the item linked list
		newItem.next = itemInArray.next;
		itemInArray.next = newItem;

	}

	/**
	 * Retrieve an item from the hashmap
	 */
	@SuppressWarnings("unchecked")
	public T getItem(int key)
	{
		// get the hash value of the key for reference
		int index = hashfunction(key);
		T value = null;

		// find the head item at the index returned
		Item item = itemArray[index];

		// iterate through the list till the specified item is found
		while (item != null)
		{
			if (item.getKey() == key)
			{
				value = (T) item.getValue();
				break;
			}
			item = item.next;
		}
		return value;
	}

}

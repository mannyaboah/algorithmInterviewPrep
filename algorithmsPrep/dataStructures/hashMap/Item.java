package algorithmsPrep.dataStructures.hashMap;

/**
 * An Item Node that holds a key and a value to be entered into a hashMap
 * 
 * @author Manny Aboah
 */
public class Item {

	int key;
	Object value;
	Item next;

	public Item(int key, Object value) {
		this.key = key;
		this.value = value;
		next = null;
	}

	public Item() {
		next = null;
	}

	public int getKey()
	{
		return key;
	}

	public Object getValue()
	{
		return value;
	}

}

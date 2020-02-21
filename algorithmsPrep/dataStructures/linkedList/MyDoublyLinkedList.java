package algorithmsPrep.dataStructures.linkedList;

public class MyDoublyLinkedList<T> {

	DoublyNode headNode;

	public MyDoublyLinkedList() {
		headNode = null;
	}

	public void add(Object value)
	{
		DoublyNode newNode = new DoublyNode(value, null, null);
		if (headNode == null)
			headNode = newNode;
		else
			newNode.next = headNode;
		headNode.prev = newNode;
		headNode = newNode;
	}

	public void delete()
	{
		headNode = headNode.next;
		headNode.prev = null;
	}

	@SuppressWarnings("unchecked")
	public void display()
	{
		DoublyNode node = headNode;

		while (node != null)
		{
			System.out.println((T) node.value);
			node = node.next;
		}
	}
}

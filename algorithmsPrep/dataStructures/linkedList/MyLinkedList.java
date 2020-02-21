package algorithmsPrep.dataStructures.linkedList;

public class MyLinkedList<T> {

	Node headNode;

	public MyLinkedList() {
		headNode = null;
	}

	public void add(Object value)
	{
		Node newNode = new Node(value, null);
		if (headNode == null)
			headNode = newNode;
		else
			newNode.next = headNode;
		headNode = newNode;
	}

	public void delete()
	{
		headNode = headNode.next;
	}

	// Implementing pop method for Stack
	@SuppressWarnings("unchecked")
	public T pop()
	{
		if (headNode == null)
		{
			System.out.println("The Stack underflow!");
			return null;
		}

		T value = (T) headNode.value;

		headNode = headNode.next;

		return value;
	}

	public void push(Object value)
	{
		Node newNode = new Node(value, null);
		if (headNode == null)
			headNode = newNode;
		else
			newNode.next = headNode;
		headNode = newNode;
	}

	@SuppressWarnings("unchecked")
	public void display()
	{
		Node node = headNode;

		while (node != null)
		{
			System.out.print("[" + (T) node.value + "] -> ");
			node = node.next;
		}
		System.out.print("null");
	}

	public Node getHeadNode()
	{
		return headNode;
	}

	public void setHeadNode(Node headNode)
	{
		this.headNode = headNode;
	}

}

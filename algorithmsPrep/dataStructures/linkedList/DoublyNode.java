package algorithmsPrep.dataStructures.linkedList;

public class DoublyNode {

	Object value;
	DoublyNode next;
	DoublyNode prev;

	public DoublyNode(Object value, DoublyNode next, DoublyNode prev) {
		this.next = next;
		this.prev = prev;
		this.value = value;
	}
}

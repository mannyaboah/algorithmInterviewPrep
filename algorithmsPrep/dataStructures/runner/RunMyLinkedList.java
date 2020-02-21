package algorithmsPrep.dataStructures.runner;

import algorithmsPrep.dataStructures.linkedList.MyLinkedList;
import algorithmsPrep.dataStructures.linkedList.Node;

public class RunMyLinkedList {

	public static void main(String[] args)
	{

		MyLinkedList<String> A = new MyLinkedList<String>();

		A.add("Manny");
		A.add("Greta");
		A.add("Goosie");
		A.add("Fozzy");

		MyLinkedList<String> B = new MyLinkedList<String>();

		B.add("Trash");
		B.add("Food");
		B.add("Granola");
		B.add("Coffee");

		MyLinkedList<String> stack = new MyLinkedList<String>();

		/*
		 * Udemy lect.20 HW google intervie question. Combine two give linkedLists such
		 * that, Each item in the first list is paired with
		 *
		 * Given Lists, A => [Fozzy] -> [Goosie] -> [Greta] -> [Manny] B => [Coffee] ->
		 * [Granola] -> [food] -> [Trash]
		 * 
		 * Produce new list, c => [Fozzy] -> [Trash] -> [Goosie] -> [food] -> [Greta] ->
		 * [Granola] -> [Manny] -> [Coffee]
		 */

		System.out.println("\n--------------- Udemy lect.20 HW google interview question --------------\n");

		// Reverse ListB into stack
		Node n = B.getHeadNode();

		while (n != null)
		{
			stack.push(n.value);
			System.out.println("Pushed: [" + n.value + "] to stack");
			n = n.next;
		}

		System.out.println("\n\nItems in Stack: ");
		stack.display();

		// Now Add the items in the stack to combined LinkedList C
		MyLinkedList<String> c = new MyLinkedList<String>();
		n = A.getHeadNode();
		while (n != null && stack != null)
		{
			c.add(n.value);
			c.add(stack.pop());
			n = n.next;
		}
		System.out.println("\n\nItems in Combined List C: ");
		c.display();

	}

}

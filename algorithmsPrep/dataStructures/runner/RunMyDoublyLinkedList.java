package algorithmsPrep.dataStructures.runner;

import algorithmsPrep.dataStructures.linkedList.MyDoublyLinkedList;

public class RunMyDoublyLinkedList {

	public static void main(String[] args)
	{

		MyDoublyLinkedList<String> myLs = new MyDoublyLinkedList<String>();

		myLs.add("Manny");
		myLs.add("Greta");
		myLs.add("Goosie");
		myLs.add("Fozzy");

		System.out.println("Elements in myList before delete: ");
		myLs.display();

		myLs.delete();
		System.out.println("Elements in myList after delete: ");
		myLs.display();
	}

}

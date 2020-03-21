package  algoExpert.prep.trees;

public class BST {

	int value;
	BST left;
	BST right;

	public BST(int value) {
		this.value = value;
		left = right = null;
	}

	/*
	 * step 1: create a node for iterating through the tree - a tracker node 
	 * step 2: compare the current node with the value of the value to be inserted if left
	 * of current node.value > value then keep moving left until leaf is reached and
	 * insert the value. 
	 * Else: move to the right because if BST properties hold then
	 * the right.value should be less. Explore until the leaf is reached then insert
	 * new node(value)
	 * 
	 * Average: O(log(n)) time | O(1) space 
	 * Worst : O(n) time | O(1) space
	 */
	public BST insert(int value) {

		BST currentNode = this;

		while (true) {
			if (value < currentNode.left.value) {
				if (currentNode.left == null) {
					currentNode.left = new BST(value);
					break;
				} else {
					currentNode = currentNode.left;
				}
			} else {
				if (currentNode.right == null) {
					currentNode.right = new BST(value);
					break;
				} else {
					currentNode = currentNode.right;
				}
			}
		}

		return this;
	}

	/*
	 * Explore left if value < node.value, else explore right if > node.value else
	 * if equal, we have found the value so return true. otherwise false
	 * 
	 *  Average: O(log(n)) time | O(1) space 
	 *  Worst : O(n) time | O(1) space
	 */
	public boolean contains(int value) {

		BST currentNode = this;

		while (currentNode != null) {
			if (value < currentNode.value)
				currentNode = currentNode.left;
			else if (value > currentNode.value)
				currentNode = currentNode.right;
			else
				return true;
		}

		return false;
	}

	public BST remove(int value) {
		// Write your code here.
		// Do not edit the return statement of this method.
		return this;
	}

}

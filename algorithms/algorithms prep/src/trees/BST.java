package trees;

public class BST {

	int value;
	BST left, right;

	public BST(int value) {
		this.value = value;
		left = right = null;
	}

	public BST insert(int value) {

		BST currentNode = this;
		while (true) {
			if (value < currentNode.left.value) {
				if (currentNode.left == null) {
					currentNode.left = new BST(value);
					break;
				}
				currentNode = this.left;
			} else {
				if (currentNode.right == null) {
					currentNode.right = new BST(value);
					break;
				}
				currentNode = currentNode.right;
			}
		}
		return this;
	}

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

	/*
	 * To remove a node from a tree consider the following edge cases: 1. The node
	 * is the root - doesn't have a parent node 2. The node has two children nodes -
	 * so we find the min value in the right subtree(because it will be the next
	 * number that fits the BST property for a root node) 3. The node has one child
	 * either on the left or the right - we check that the parent node.left/right is
	 * our current node then we assign
	 */
	public void remove(int value, BST parentNode) {

		BST currentNode = this;

		while (currentNode != null) {
			if (value < currentNode.value) {
				parentNode = currentNode;
				currentNode = currentNode.left;
			} else if (value > currentNode.value) {
				parentNode = currentNode;
				currentNode = currentNode.right;
			} else {
				if (currentNode.left != null && currentNode.right != null) { // Edge case for when node to be removed
																				// has two children nodes.
					currentNode.value = currentNode.right.getMinValue(); // find the min value in the right subtree
					currentNode.right.remove(currentNode.value, currentNode); // remove the node(smallest value in the
																				// right subtree)
				} else if (parentNode == null) {
					if (currentNode.left != null) {
						currentNode.value = currentNode.left.value;
						currentNode.right = currentNode.left.right;
						currentNode.left = currentNode.left.left;
					} else if (currentNode.right != null) {
						currentNode.value = currentNode.right.value;
						currentNode.left = currentNode.right.left;
						currentNode.right = currentNode.right.right;
					} else {
						currentNode.value = 0;
					}
				} else if (parentNode.left == currentNode) {
					parentNode.left = currentNode.left != null ? currentNode.left : currentNode.right;
				} else if (parentNode.right == currentNode) {
					parentNode.right = currentNode.right != null ? currentNode.right : currentNode.left;
				}

			}
			break;
		}

	}

	public int getMinValue() {

		BST currentNode = this;

		while (currentNode.left != null) {
			currentNode = currentNode.left;
		}

		return currentNode.value;
	}

	/*
	 * Find the closest value in the BST
	 */
	public static int findClosestValueInBst(BST tree, int target) {
		// Write your code here.
		BST currentNode = tree;
		
		int closest = currentNode.value;

		while (currentNode != null) {
			if(Math.abs(target - closest) > Math.abs(target - currentNode.value)) closest = currentNode.value;			
			if(target < currentNode.value) currentNode = currentNode.left;
			else if(target > currentNode.value) currentNode = currentNode.right;
			else return closest;
		}
		return -1;
	}

}

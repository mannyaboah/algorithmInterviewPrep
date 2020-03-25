package trees;

public class BSTmain {

	public static void main(String[] args) {

		BST bst = new BST(10);
		bst.left = new BST(5);
		bst.right = new BST(15);

		bst.left.left = new BST(2);
		bst.left.right = new BST(5);

		bst.right.left = new BST(13);
		bst.right.right = new BST(22);
		
		//int closestMax = findClosestValueInBst(bst, 12);
		System.out.println("test");

	}

	public static int findClosestValueInBst(BST tree, int target) {
		
		int closestmax = 0;
		
		//BST tree = tree;
		
		while(tree != null) {
			if(tree.value <= tree.left.value || tree.value > tree.right.value) return -1;
			if(tree.value <= target && closestmax < target) closestmax = tree.value;
			
			if(tree.right.value <= target) tree = tree.right;
			else tree = tree.left;
		}		
		
		return -1;
	}

}

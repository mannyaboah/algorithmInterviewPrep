package trees;

import java.util.ArrayList;
import java.util.List;

public class BranchSums {

	public static void main(String[] args) {

		// Build a tree
		TreeNode tree = new TreeNode(1);
		tree.left = new TreeNode(2);
		tree.right = new TreeNode(3);

		tree.left.left = new TreeNode(4);
		tree.left.right = new TreeNode(5);

		tree.right.left = new TreeNode(6);
		tree.right.right = new TreeNode(7);

		tree.left.left.left = new TreeNode(8);
		tree.left.left.right = new TreeNode(9);

		tree.left.right.right = new TreeNode(10);
		
		List<Integer> results = branchSums(tree);
		
		System.out.println(results);
		

	}

	public static List<Integer> branchSums(TreeNode root) {

		List<Integer> listSums = new ArrayList<Integer>();
		
		
		calculateBranchSums(root, 0, listSums);
		
		return listSums;
	}
	
	public static void calculateBranchSums(TreeNode node, int runningSum, List<Integer>sums) {
		
		if(node == null) return;
		
		int newRunningSum = runningSum + node.value;

		if(node.left == null && node.right == null) {
			sums.add(newRunningSum);
			return;
		}
		
		calculateBranchSums(node.left, newRunningSum, sums);
		calculateBranchSums(node.right, newRunningSum, sums);
		
	}
	
	static long repeatedString(String s, long n) {

		long acount = 0;
		
		if(s.length() < 1) return acount;
		
		
		for(int i=0; i < s.length(); i++) {
			if(s.charAt(i) == 'a') acount++;
		}
		
		long strcount = n / s.length();
		
		int remainder = 0;
		if(n % s.length() > 0) {
			for(int i=0; i < (n % s.length()); i++) {
				if(s.charAt(i) == 'a') remainder ++;
			}
		}
		
		return (acount * strcount) + remainder;

    }


}

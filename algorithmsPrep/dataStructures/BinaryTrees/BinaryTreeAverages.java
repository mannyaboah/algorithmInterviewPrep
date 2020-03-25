import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class BinaryTreeAverages {

    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }

    }

    public static void main(String[] args) {

        /*
         * A Binary Tree: 
            4 
           / \ 
          2   9 
         / \   \ 
        3   5   7
         */

        Node root = null;
        root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(9);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
        System.out.println("Averages of levels : ");
        System.out.print(calculateLevelAverages(root));
        
    }

    public static List<Double> calculateLevelAverages(Node root) {

        Queue<Node> q = new ArrayDeque<Node>();
        q.add(root);

        List<Double> averages = new ArrayList<Double>();
        int count = 0;
        int sum = 0;

        while (!q.isEmpty()) {

            Queue<Node> temp = new ArrayDeque<Node>();
            count = 0;
            sum = 0;
            while (!q.isEmpty()) {
                Node n = q.remove();
                sum += n.value;
                count++;
                if (n.left != null)
                    temp.add(n.left);
                if (n.right != null)
                    temp.add(n.right);
            }
            q = temp;
            averages.add((sum * 1.0) / count);
        }

        return averages;
    }

}

package algorithmsPrep.dataStructures.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;


public class BFS {

	class Node {

		String name;
		List<Node> children = new ArrayList<Node>();

		public Node(String name) {
			this.name = name;
		}
		
		public List<String> bfs(List<String> array){
			
			ArrayDeque<Node> queue = new ArrayDeque<Node>();
			queue.add(this);
			
			while(queue.size() > 0) {
				
				Node current = queue.poll();
				array.add(current.name);
				
				for(int i=0; i < current.children.size(); i++) {
					queue.add(current.children.get(i));
				}
				
			}
			
			return array;
			
		}
		
		public void addChild(String name) {
			Node child = new Node(name);
			children.add(child);
		}

	}

}

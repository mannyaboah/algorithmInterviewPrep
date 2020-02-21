package algorithmsPrep.dataStructures.trees;

import java.util.ArrayList;
import java.util.List;

public class DFS {

	class Node {

		String name;
		List<Node> children = new ArrayList<Node>();

		public Node(String name) {
			this.name = name;
		}

		public List<String> dfs(List<String> array)
		{

			array.add(this.name);
			
			for(int i=0; i < children.size(); i++) {
				children.get(i).dfs(array);
			}			

			return array;

		}
		
		public void addChild(String name) {
			Node child = new Node(name);
			children.add(child);
		}

	}

}

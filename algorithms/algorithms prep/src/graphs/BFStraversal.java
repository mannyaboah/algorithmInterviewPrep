package graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class BFStraversal{

    class Node {

        int id;
        LinkedList<Node> adj = new LinkedList<Node>();

        Node (int id){
            this.id = id;
        }

        public void addEdge(int source, int dest){
            Node s = getNode(source);
            Node d = getNode(dest);
            s.adj.add(d);
        }
    
        private Node getNode(int source) {
            return null;
        }

        public int[] bfs(int s) {
            
            List<Integer> results = new ArrayList<>();
            List<Integer> visited = new ArrayList<>();
            Queue<Integer> q = new ArrayDeque<Integer>();

            q.add(s);

            while(!q.isEmpty()){
                int current = q.remove();
                if(visited.contains(q))
                if(!results.contains(current)){
                    results.add(current);

                }
                
            }
    
            return new int[]{};
        }
    }

    public static void main(String[] args) {
        
    }

}


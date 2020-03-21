package  algoExpert.prep.graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

/* --------------------------------------------------------------
 * Problem:
 *  -------------------------------------------------------------
 * Traverse a matrix and calculate the length of a river,
 * the matrix as a value of 1 for river and 0 for land
 * the length is calculated by adding values of 1 at a point
 * and it's neighbors
 * 
 * --------------------------------------------------------------
 * Solution:
 * --------------------------------------------------------------
 * Maintain a visited 2d matrix,
 * Use a queue to perform BFS as we treat this problem as a graph
 * if the point in the matrix is 0 or is visited then continue
 * first handle the inner parts of the matrix where one can move
 * back and forth and up and down, then handle the outer parts.
 * 
 * Maintain a running sum of the one's per point and add them to
 * a final array to be returned.
 * 
 * */

public class RiverLengthProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = {{1,0,0,1,0},
						  {1,0,1,0,0},
						  {0,0,1,0,1},
						  {1,0,1,0,1},
						  {1,0,1,1,0}};
		
		System.out.println(riverSizes(matrix));

	}

	
	public static List<Integer> riverSizes(int[][] matrix){
		
		boolean[][] visited = new boolean[matrix.length][matrix[0].length];
		
		for(boolean[] ar : visited) {
			Arrays.fill(ar, false);
		}
		
		System.out.println("Your bool array: " + Arrays.deepToString(visited));
		
		List<Integer> sizes = new ArrayList<>();
		
		for(int r=0; r < matrix.length; r++) {
			for(int c=0; c < matrix[0].length; c++) {
				if(visited[r][c]) continue;
				Node cell = new Node(matrix[r][c], r, c);
				
				traverseNode(cell, matrix, visited, sizes);
			}
		}
		
		
		return sizes;
	}
	
	
	public static void traverseNode(Node cell, int[][] matrix, boolean[][] visited, List<Integer> sizes) {
		
		int riverSize = 0;
		
		Queue<Node> q = new ArrayDeque<>();
		q.add(cell);
		
		while(!q.isEmpty()) {
			
			Node currentCell = q.poll(); 
			int row = currentCell.getRow();
			int col = currentCell.getCol();
			
			if(visited[row][col]) continue;
			
			visited[row][col] = true;
			
			if(matrix[row][col] == 0) continue;
			
			riverSize++;
			
			List<Node> unvisitedNeighbors = getUnvisitedNeighbors(currentCell, matrix, visited);
			
			for(Node n : unvisitedNeighbors) {
				q.add(n);
			}
		}
		
		if(riverSize > 0 ) sizes.add(riverSize);
	
	}
	
	public static List<Node> getUnvisitedNeighbors(Node cell, int[][] matrix, boolean[][] visited){
		
		int r = cell.getRow();
		int c = cell.getCol();
		
		List<Node> unvisitedNeigbors = new ArrayList<>();
		
		if(r > 0 && !visited[r - 1][c]) {
			unvisitedNeigbors.add(new Node(matrix[r - 1][c], r - 1, c));
		}
		
		if(r < matrix.length - 1 && !visited[r + 1][c]) {
			unvisitedNeigbors.add(new Node(matrix[r + 1][c], r + 1, c));
		}
		
		if(c > 0 && !visited[r][c - 1]) {
			unvisitedNeigbors.add(new Node(matrix[r][c - 1], r, c - 1));
		}
		
		if(c < matrix[0].length - 1 && !visited[r][c + 1]) {
			unvisitedNeigbors.add(new Node(matrix[r][c + 1], r, c + 1));
		}
		
		return unvisitedNeigbors;
	}
	
	public static class Node{
		
		int row;
		int col;
		int value;
		
		public Node(int value, int row, int col) {
			this.value = value;
			this.col = col;
			this.row = row;
		}

		public int getRow() {
			return row;
		}

		public void setRow(int row) {
			this.row = row;
		}

		public int getCol() {
			return col;
		}

		public void setCol(int col) {
			this.col = col;
		}
		
	}
	
}

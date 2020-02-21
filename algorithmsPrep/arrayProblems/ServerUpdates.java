package algorithmsPrep.arrayProblems;

import java.util.List;

public class ServerUpdates {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

	int minimumDays(int rows, int columns, List<List<Integer>> grid)
	{
		// WRITE YOUR CODE HERE
		
		boolean updateOcurred = true;
		
		int count = 0;
		
		
		while(updateOcurred) {
			
			List<List<Integer>> prev = grid;
			
			for(int i = 0; i < rows; i++) {
				for(int j = 0; j < columns; j++) {
					//left edge
					if(i == 0) {
						if(prev.get(i).get(j) == 0 && (prev.get(i).get(j+1) == 1 || prev.get(i+1).get(j) == 1)) grid.get(i).set(i, 1);
					}
					else if(i == 0 && j == columns - 1) {
						if(prev.get(i).get(j) == 0 && (prev.get(i).get(j-1) == 1 || prev.get(i+1).get(j) == 1)) grid.get(i).set(i, 1);
					}
					else if(i == rows - 1 && j == 0) {
						if(prev.get(i).get(j) == 0 && (prev.get(i).get(j+1) == 1 || prev.get(i-1).get(j) == 1)) grid.get(i).set(i, 1);
					}
					else if(i == rows - 1 && j == columns - 1) {
						if(prev.get(i).get(j) == 0 && (prev.get(i).get(j-1) == 1 || prev.get(i-1).get(j) == 1)) grid.get(i).set(i, 1);
					}
					else if(i == 0) {
						
					}
					else if(i == rows - 1) {
						
					}
					
				}
				
			}
			
		}
		
		return count;
	}

}

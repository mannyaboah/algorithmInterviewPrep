package interviewQuestions;

import java.util.ArrayList;

public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<Integer>> test = buildTriangleList(10);
		
		test.forEach(lst -> {
			lst.forEach(l ->{
				System.out.print("[" + l + "] ");
			});
			System.out.println();
		});
		
	}

	public int[][] buildTriangleArray(int nRows) {

		return new int[][] {};
	}

	public static ArrayList<ArrayList<Integer>> buildTriangleList(int nRows) {

		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		
		if(nRows <= 0) return res;
		
		ArrayList<Integer> prev = new ArrayList<Integer>();
		
		prev.add(1);
		res.add(prev);

		for(int i=2; i <= nRows; i++){
			
			ArrayList<Integer> current = new ArrayList<Integer>();
			
			current.add(1);	

			for(int j=0; j < prev.size() - 1; j++) {
				current.add(prev.get(j) + prev.get(j+1));
			}
			current.add(1);
			
			res.add(current);
			prev = current;
		}
		
		return res;
	}

}

package algorithmsPrep.dataStructures.unionFind;

public class UnionFind {

	int size;
	int numOfComponents;
	int[] parent;
	int[] compSize;
	
	public UnionFind(int size)
	{
		this.size = numOfComponents = size;
		parent = new int[size];
		compSize =  new int[size];
		
		for(int i=0; i < size; ++i)
		{
			parent[i] = i; 	 //initially every node is a component/ disjoint set/ root
			compSize[i] = 1; //initially all components have size 1;
		}
		
	}
	
	// Recursive find method
	public int find(int p)
	{
		if(parent[p] == p) return p;
		
		return parent[p] = find(p);
	}
	
	public int findAndCompress(int p)
	{
		return 0;
	}
	
	public void union(int comp1, int comp2)
	{
		
	}
	
}

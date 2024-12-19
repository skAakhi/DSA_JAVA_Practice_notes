package Data_structures;

public class DSUOne {
	//Finding union by rank
	int parent[];
	int rank[];
	int components;
	
	DSUOne(int nodes)
	{
		this.parent=new int[nodes];
		this.rank=new int[nodes];
		this.components=nodes;
		
		for(int i=0;i<nodes;i++)
		{
			parent[i]=i;
			rank[i]=0;
		}
	}
	
	//Path compression
	public int FindParent(int node)
	{
		if(node==parent[node])
		{
			return node;
		}
		parent[node]=FindParent(parent[node]);
		
		return parent[node];
	}
	
	
	public void UnionByRank(int n1,int n2) {
		
		int rootp1=FindParent(n1);
		int rootp2=FindParent(n2);
		
		if(rootp1==rootp2)
		{
			return;
		}
		
		components--;
		if(rank[rootp1]<rank[rootp2])
		{
			parent[rootp1]=rootp2;
		}
		else if(rank[rootp2]<rank[rootp1])
		{
			parent[rootp2]=rootp1;
		}
		else {//if both ranks are same
			parent[rootp2]=rootp1;
			rank[rootp1]++;
			
		}
		
	}

	public static void main(String[] args) {
		
		DSUOne dsu=new DSUOne(4);
		System.out.println(dsu.components);
		System.out.println(dsu.FindParent(0)==dsu.FindParent(3));
		dsu.UnionByRank(0, 3);
		System.out.println(dsu.components);
		System.out.println(dsu.FindParent(0)==dsu.FindParent(3));
		
		

	}

}

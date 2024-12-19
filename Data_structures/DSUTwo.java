package Data_structures;

public class DSUTwo {

	//Union by size
	
	int parent[];
	int size[];
	int components;
	
	DSUTwo(int nodes)
	{
		this.parent=new int[nodes];
		this.size=new int[nodes];
		this.components=nodes;
		
		for(int i=0;i<nodes;i++)
		{
			parent[i]=i;
			size[i]=1;
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
	
	
	public void UnionBySize(int n1,int n2) {
		
		int rootp1=FindParent(n1);
		int rootp2=FindParent(n2);
		
		if(rootp1==rootp2)
		{
			return;
		}
		
		components--;
		if(size[rootp1]<size[rootp2])
		{
			parent[rootp1]=rootp2;
			size[rootp2]+=size[rootp1];
		}
		else
		{
			parent[rootp2]=rootp1;
			size[rootp1]+=size[rootp2];
		}
		
	}

	public static void main(String[] args) {
		
		DSUTwo dsu=new DSUTwo(4);
		System.out.println(dsu.components);
		System.out.println(dsu.FindParent(0)==dsu.FindParent(3));
		dsu.UnionBySize(0, 3);
		System.out.println(dsu.components);
		System.out.println(dsu.FindParent(0)==dsu.FindParent(3));
		
		

	}

}

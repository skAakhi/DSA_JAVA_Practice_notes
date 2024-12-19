package Data_structures;

import java.util.ArrayList;
import java.util.Stack;

public class SCC { // SCC means strongly connected components
	// In which we can reach every vertex of the component , from every other vertex in that component
	// To find out Scc components for that making using of Kosurajus algorithm
	//Steps:
	//1.Get nodes in stack [Topological sort]
	//2.Transpose the graph[Reverse the all edges]
	//3.Do DFS according to the stack nodes & print it 
	
	static class Edge {
		int src;
		int dest;
		public Edge(int s, int d) {
		this.src = s;
		this.dest = d;
		}
	}
		public static void createGraph(ArrayList<Edge> graph[]) {
			
		for(int i=0; i<graph.length; i++) {
		graph[i] = new ArrayList<Edge>();
		}
		
		graph[0].add(new Edge(0, 2));
		graph[0].add(new Edge(0, 3));
		
		graph[1].add(new Edge(1, 0));
		
		graph[2].add(new Edge(2, 1));
		
		graph[3].add(new Edge(3, 4));
	}

		

		public static void topoSort(ArrayList<Edge> graph[],int curr,boolean vis[],Stack<Integer> s)
		{
			vis[curr]=true;
			
			for(int i=0;i<graph[curr].size();i++)
			{
				Edge e= graph[curr].get(i);
				
				if(!vis[e.dest])
				{
					topoSort(graph,e.dest,vis,s);
				}
			}
			
			s.push(curr);
		}
		
		public static void dfs(ArrayList<Edge> graph[], boolean vis[], int curr) {
			vis[curr] = true;
			System.out.print(curr+" ");
			
			for(int i=0; i<graph[curr].size(); i++) {
				
			Edge e = graph[curr].get(i);
			
			if(!vis[e.dest]) {
				
			dfs(graph, vis, e.dest);
		}
	}
}
		
		public static void Kosaraju(ArrayList<Edge> graph[])
		{
			Stack<Integer> s = new Stack<>();
			boolean vis[]=new boolean[graph.length];
			
			//Step 1
			for(int i=0;i<graph.length;i++)
			{
				if(!vis[i])
				{
					topoSort(graph,i,vis,s);
				}
			}
			
			//step 2
			ArrayList<Edge> transgraph[] = new ArrayList[graph.length];
			
			   for(int i=0; i<graph.length; i++) {
				   
				transgraph[i] = new ArrayList<Edge>();
				
				}
			   
			   for(int i=0;i<graph.length;i++)
			   {
				   vis[i]=false;
				   
				   for(int j=0;j<graph[i].size();j++)
				   {
					   Edge e = graph[i].get(j);
					   
					   transgraph[e.dest].add(new Edge(e.dest,e.src));
				   }
				
			   }
			   
	//Step 3
			   while(!s.isEmpty())
			   {
				   int curr=s.pop();
				   
				   if(!vis[curr]) {
					
					System.out.print("SCC : ");
				   dfs(transgraph,vis,curr);
				   System.out.println();
				   }
				   
			   }	
			
		}


	public static void main(String[] args) {
		
			int V = 5;
			ArrayList<Edge> graph[] = new ArrayList[V];
			
			createGraph(graph);
			
			
			Kosaraju(graph);

	}

}

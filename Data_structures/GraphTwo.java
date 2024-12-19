package Data_structures;

import java.util.ArrayList;

import Data_structures.GraphOne.Edge;

public class GraphTwo {
	//This is for directed graph
	static class Edge{
		int src;
		int dest;
		
		Edge(int s,int d)
		{
			this.src=s;
			this.dest=d;
		}
	}

	public static void createEdge(ArrayList<Edge> graph[])
	{
		for(int i=0;i<graph.length;i++)
		{
			graph[i]=new ArrayList<Edge>();
		}
		
		
		graph[0].add(new Edge(0, 2));
		
		graph[1].add(new Edge(1, 0));
		
		graph[2].add(new Edge(2, 3));
		
		graph[3].add(new Edge(3, 0));
		
	}
	
	public static boolean isCycle(ArrayList<Edge> graph[],boolean vis[],int curr,boolean rec[])
	{
		vis[curr]=true;
		rec[curr]=true;
		
		for(int i=0;i<graph[curr].size();i++)
		{
			Edge e=graph[curr].get(i);
			
			if(rec[e.dest])
			{
				return true;
			}
			else if(!vis[e.dest])
			{
				if(isCycle(graph,vis,e.dest,rec))
				{
					return true;
				}
				
			}			

		}
		
		rec[curr]=false;

		
		return false;
	}

	public static void main(String[] args) {
		
		int v=4;
		ArrayList<Edge> graph[]= new ArrayList[v];
		boolean vis[]=new boolean[v];
		boolean rec[]=new boolean[v];
		
		createEdge(graph);
		//System.out.println(isCycle(graph,vis,0,rec));
		
		
		//For disconnected components
         boolean hasCycle = false;
		
		// Checking for cycle in all disconnected components
		for (int i = 0; i < v; i++) {
			if (!vis[i]) {
				if (isCycle(graph, vis, i, rec)) {
					hasCycle = true;
					break;
				}
			}
		}
		
		System.out.println("Graph contains cycle: " + hasCycle);
		
		
		

	}
}



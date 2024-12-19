package Data_structures;

import java.util.ArrayList;

import Data_structures.SCC.Edge;

public class Brides {
	//Bridge means  in which an edge whose deletion increases the graph number of connected components & this is an un_directed graph
	//To find out this bridge making use of tarjans algorithm
	
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
		
		graph[0].add(new Edge(0, 1));
		graph[0].add(new Edge(0, 2));
		graph[0].add(new Edge(0, 3));
		
		graph[1].add(new Edge(1, 0));
		graph[1].add(new Edge(1, 2));
		
		graph[2].add(new Edge(2, 0));
		graph[2].add(new Edge(2, 1));
		
		graph[3].add(new Edge(3, 4));
		graph[3].add(new Edge(3, 5));
		graph[3].add(new Edge(3, 0));

		
		
		graph[4].add(new Edge(4, 3));
		graph[4].add(new Edge(4, 5));
		
		graph[5].add(new Edge(5, 3));
		graph[5].add(new Edge(5, 4));

	}
		
		public static void dfs(ArrayList<Edge> graph[],boolean vis[],int[] dt,int low[],int time,int curr,int par)
		{
			vis[curr]=true;
			
			dt[curr]=low[curr]=++time;
			
			for(int i=0;i<graph[curr].size();i++) {
				
				Edge e = graph[curr].get(i);
				
				if(e.dest==par)
				{
					continue;
				}
				else if(vis[e.dest]) {
					low[curr]=Math.min(low[curr], dt[e.dest]);
				}
				else {
					dfs(graph,vis,dt,low,time,e.dest,curr);
					low[curr]=Math.min(low[curr], low[e.dest]);
					
					if(dt[curr]<low[e.dest])
					{
						System.out.println("Bridge :"+curr+"------"+e.dest);
					}
				}
			}
		}
		

		public static void getBridge(ArrayList<Edge> graph[])
		{
			int dt[]=new int[graph.length];
			int low[]=new int[graph.length];
			int time=0;
			
			boolean vis[]=new boolean[graph.length];
			
			for(int i=0;i<graph.length;i++)
			{
				if(!vis[i])
				{
					dfs(graph,vis,dt,low,time,i,-1);
				}
			}
			
			
		}


	public static void main(String[] args) {
		
		int V = 6;
		ArrayList<Edge> graph[] = new ArrayList[V];
		
		createGraph(graph);
		
		getBridge(graph);

		
	}

}

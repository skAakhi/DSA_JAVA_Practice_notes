package Data_structures;

import java.util.ArrayList;

import Data_structures.Brides.Edge;

public class Articulation_Point {
	//AP means a vertex is an un_directed  connected graph is an AP , if removing it(vertex) dis_connects the graph 
	//To find AP making use of Tarjans algorithm
	

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
		graph[3].add(new Edge(3, 0));

		
		graph[4].add(new Edge(4, 3));
		
		

	}
		
		public static void dfs(ArrayList<Edge> graph[],boolean vis[],int[] dt,int[] low,int curr,int par,boolean ap[],int time)
		{
			vis[curr]=true;
			dt[curr]=low[curr]=++time;
			int child=0;
			
			for(int i=0;i<graph[curr].size();i++)
			{
				Edge e = graph[curr].get(i);
				
				if(par==e.dest)
				{
					continue;
				}
				else if(vis[e.dest])
				{
					low[curr]=Math.min(low[curr], dt[e.dest]);
				}
				else
				{
					dfs(graph,vis,dt,low,e.dest,curr,ap,time);
					
					low[curr]=Math.min(low[curr], low[e.dest]);
					
					if(dt[curr]<=low[e.dest] && par!=-1)
					{
						ap[curr]=true;
					}
					child++;
				}
			}
			
			if(par==-1 && child>1)
			{
				ap[curr]=true;
			}
		}
		
		public static void getAp(ArrayList<Edge> graph[])
		{
			int dt[]=new int[graph.length];
			int low[]=new int[graph.length];
			int time=0;
			
			boolean vis[]=new boolean[graph.length];
			boolean Ap[]=new boolean[graph.length];
			
			for(int i=0;i<graph.length;i++)
			{
				if(!vis[i])
				{
					dfs(graph,vis,dt,low,i,-1,Ap,time);
				}
			}
			
			
			for(int i=0;i<Ap.length;i++)
			{
				if(Ap[i])
				{
					System.out.println("Articulation point :"+i );
				}
			}

		}
		
		
	public static void main(String[] args) {
		

		int V = 5;
		ArrayList<Edge> graph[] = new ArrayList[V];
		
		createGraph(graph);
		
		getAp(graph);
	}

}

package Data_structures;

import java.util.ArrayList;
import java.util.PriorityQueue;

import Data_structures.GraphFour.Edge;

public class DijkStras {
	
	static class Edge {
		int src;
		int dest;
		int wt;
		public Edge(int s, int d,int w) {
		this.src = s;
		this.dest = d;
		this.wt=w;
		}
	}
		static void createGraph(ArrayList<Edge> graph[]) {
		for(int i=0; i<graph.length; i++) {
			
		graph[i] = new ArrayList<>();
		
		}
		graph[0].add(new Edge(0, 1, 2));
		graph[0].add(new Edge(0, 2, 4));
		
		graph[1].add(new Edge(1, 3, 7));
		graph[1].add(new Edge(1, 2, 1));
		
		graph[2].add(new Edge(2, 4, 3));
		
		graph[3].add(new Edge(3, 5, 1));
		
		graph[4].add(new Edge(4, 3, 2));
		
		graph[4].add(new Edge(4, 5, 5));
		
		
		
	}
		
	public  static class pair implements Comparable<pair>
	{
		int node;
		int path;
		
		pair(int n,int p)
		{
			this.node=n;
			this.path=p;
		}
		
		public int compareTo(pair p2)
		{
			return this.path-p2.path;
		}
	}
	
	public static void Diji(ArrayList<Edge> graph[],int src)
	{
		PriorityQueue<pair> pq= new PriorityQueue<>();
		int dist[]=new int[graph.length];
		boolean vis[]=new boolean[graph.length];
		
		
		for(int i=0;i<graph.length;i++)
		{
			if(i!=src)
			{
				dist[i]=Integer.MAX_VALUE;
			}
		}
		
		
		pq.add(new pair(src,0));
		
		while(!pq.isEmpty())
		{
			pair curr=pq.remove();
			
			if(!vis[curr.node])
			{
				vis[curr.node]=true;
			}
			
			for(int i=0;i<graph[curr.node].size();i++)
			{
				Edge e = graph[curr.node].get(i);
				
				int u=e.src;
				int v=e.dest;
				
				if(dist[u]+e.wt<dist[v])
				{
					dist[v]=dist[u]+e.wt;
					
					pq.add(new pair(v,dist[v]));//neighbor node(u) & newly updated weight(weight)
				}
			}
		}
		
		
		for(int i=0;i<dist.length;i++)
		{
			System.out.print(dist[i]+" ");
		}
	}
	
	
	
	
	
		

	public static void main(String[] args) {
		
		int V = 6;
		ArrayList<Edge> graph[] = new ArrayList[V];
		createGraph(graph);
		
		Diji(graph,0);
		
		
		

		

	}

}

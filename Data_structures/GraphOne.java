package Data_structures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphOne {
	//Implementing using AdjanceyList[arrayList of lists]
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
		
//		graph[0].add(new Edge(0,2));
//		
//		graph[1].add(new Edge(1,2));
//		graph[1].add(new Edge(1,3));
//		
//		graph[2].add(new Edge(2,0));
//		graph[2].add(new Edge(2,1));
//		graph[2].add(new Edge(2,3));
//		
//		graph[3].add(new Edge(3,1));
//		graph[3].add(new Edge(3,2));
		
		graph[0].add(new Edge(0,1));
		graph[0].add(new Edge(0,2));
		
		graph[1].add(new Edge(1,0));
		graph[1].add(new Edge(1,3));
		
		graph[2].add(new Edge(2,0));
		graph[2].add(new Edge(2,4));
		
		graph[3].add(new Edge(3,1));
		graph[3].add(new Edge(3,4));
		graph[3].add(new Edge(3,5));
		
		graph[4].add(new Edge(4,2));
		graph[4].add(new Edge(4,3));
		graph[4].add(new Edge(4,5));
		
		graph[5].add(new Edge(5,3));
		graph[5].add(new Edge(5,4));
		graph[5].add(new Edge(5,6));
		
		graph[6].add(new Edge(6,5));
		
	}
	
	public static void BFS(ArrayList<Edge> graph[],boolean vis[])
	{
		Queue<Integer> q=new LinkedList<>();
		q.add(0);
		
		while(!q.isEmpty())
		{
			int curr=q.remove();
			if(vis[curr]==false)
			{
				System.out.print(curr+" ");
				vis[curr]=true;
			}
			for(int i=0;i<graph[curr].size();i++)
			{
				Edge e=graph[curr].get(i);
				q.add(e.dest);
			}
		}
		
	}
	
	
	public static void DFS(ArrayList<Edge> graph[],int curr,boolean vis[])
	{
		System.out.print(curr+" ");
		vis[curr]=true;
		
		for(int i=0;i<graph[curr].size();i++)
		{
			Edge e=graph[curr].get(i);
			if(vis[e.dest]==false)
			{
				DFS(graph,e.dest,vis);
			}
		}
	}
	
	
	public static void printAllPaths(ArrayList<Edge> graph[],int curr,boolean vis[],String path,int target)
	{
		if(curr==target)
		{
			System.out.println(path+curr);
			return;
		}
		
		for(int i=0;i<graph[curr].size();i++)
		{
			Edge e = graph[curr].get(i);
			
			if(!vis[e.dest])
			{
				vis[curr]=true;
				printAllPaths(graph,e.dest,vis,path+curr,target);
				vis[curr]=false;
				
			}
		}
	}
	
	
	
			
	public static void main(String[] args) {
		
		int v=7;
		ArrayList<Edge> graph[]= new ArrayList[v];
		boolean vis[]=new boolean[v];
		createEdge(graph);
		//BFS(graph,vis);
		
//		for(int i=0;i<graph[2].size();i++)
//		{
//			Edge e=graph[2].get(i);
//			System.out.print(e.dest+" ");
//		}
		
		
		//for Dis_connected components for BFS & DFS
//		for(int i=0;i<v;i++)
//		{
//			if(vis[i]==false)
//			{
//				//BFS(graph,vis);
//				DFS(graph,0,vis);
//			}
//		}
		
		
		//DFS(graph,0,vis);
		//String path ="";
		printAllPaths(graph,0,vis,"",5);
		
		
		
		
		

	}

}

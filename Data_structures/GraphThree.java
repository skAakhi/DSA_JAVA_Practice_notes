package Data_structures;

import java.util.ArrayList;

public class GraphThree {
	
	static class Edge {
		int src;
		int dest;
		public Edge(int s, int d) {
		this.src = s;
		this.dest = d;
		}
	}
	
	static void createGraph(ArrayList<Edge> graph[]) {
		
		for(int i=0; i<graph.length; i++) {
			graph[i] = new ArrayList<>();
		
		}
		
		graph[0].add(new Edge(0, 1));
		graph[0].add(new Edge(0, 2));
		graph[0].add(new Edge(0, 3));
		
		graph[1].add(new Edge(1, 0));
		graph[1].add(new Edge(1, 2));
		
		graph[2].add(new Edge(2, 0));
		graph[2].add(new Edge(2, 1));
		
		graph[3].add(new Edge(3, 0));
		graph[3].add(new Edge(3, 4));
		
		graph[4].add(new Edge(4, 3));
		}

	
	 public static boolean isCyclicUtil(ArrayList<Edge>[] graph, boolean vis[], int curr, int par) {
	    	  
	      vis[curr] = true;
	      
			for(int i=0; i<graph[curr].size(); i++) {
				
			  Edge e = graph[curr].get(i);
			
			if(vis[e.dest] && par!=e.dest)
			{
				return true;
			}
			else if(!vis[e.dest])
			{
				if(isCyclicUtil(graph,vis,e.dest,curr))
				{
					return true;
				}
			}
	
			}
			return false;
	      }
	      
	  public static boolean isCyclic(ArrayList<Edge>[] graph, boolean vis[]) {
		for(int i=0; i<graph.length; i++) {
		
			if(!vis[i])
			{
				if(isCyclicUtil(graph, vis, i, -1)) 
			      return true;
			}
		
		}
		  return false;
		}

	public static void main(String[] args) {
		
		/*
		  0 -------  3
		 / |         |
	    /  |         |
	 1 |   |         4
	    \  |
		 \ | 
		  2
		*/
		int V = 5;
		ArrayList<Edge> graph[] = new ArrayList[V];
		createGraph(graph);
		
		System.out.println(isCyclic(graph, new boolean[V]));


	}

}
//package Data_structures;

//import java.util.ArrayList;
//
//public class GraphThree {
//
//    static class Edge {
//        int src;
//        int dest;
//
//        public Edge(int s, int d) {
//            this.src = s;
//            this.dest = d;
//        }
//    }
//
//    static void createGraph(ArrayList<Edge> graph[]) {
//        for (int i = 0; i < graph.length; i++) {
//            graph[i] = new ArrayList<>();
//        }
//
//        // Adding edges to the graph
//        graph[0].add(new Edge(0, 1));
//        graph[0].add(new Edge(0, 2));
//        graph[0].add(new Edge(0, 3));
//
//        graph[1].add(new Edge(1, 0));
//        graph[1].add(new Edge(1, 2));
//
//        graph[2].add(new Edge(2, 0));
//        graph[2].add(new Edge(2, 1));
//
//        graph[3].add(new Edge(3, 0));
//        graph[3].add(new Edge(3, 4));
//
//        graph[4].add(new Edge(4, 3));
//    }
//
//    public static boolean isCyclicUtil(ArrayList<Edge>[] graph, boolean vis[], int curr, int par) {
//        vis[curr] = true;
//
//        for (int i = 0; i < graph[curr].size(); i++) {
//            Edge e = graph[curr].get(i);
//
//            // If the adjacent node is already visited and is not the parent, there is a cycle
//            if (vis[e.dest] && par != e.dest) {
//                return true;
//            }
//            // If the adjacent node is not visited, do a DFS
//            else if (!vis[e.dest]) {
//                if (isCyclicUtil(graph, vis, e.dest, curr)) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    public static boolean isCyclic(ArrayList<Edge>[] graph, boolean vis[]) {
//        for (int i = 0; i < graph.length; i++) {
//            if (!vis[i]) {
//                if (isCyclicUtil(graph, vis, i, -1)) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        /*
//         Graph structure:
//         0 ------- 3
//         / |         |
//        /  |         |
//       1  |         4
//        \  |
//         \ |
//         2
//         */
//        int V = 5;
//        ArrayList<Edge> graph[] = new ArrayList[V];
//        createGraph(graph);
//
//        System.out.println(isCyclic(graph, new boolean[V]));
//    }
//}


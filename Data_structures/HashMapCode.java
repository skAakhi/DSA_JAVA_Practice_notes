package Data_structures;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapCode {

	static class HashMap<K,V>{
		
		   private class Node{
			K key;
			V value;
			private Node(K key, V value)
			{
				this.key=key;
				this.value=value;
			}
		}
		
		private int n;//number of nodes
		private int N;//Number of buckets
		private LinkedList<Node>buckets[];
		
		//@suppreswarning("unchecked")
		HashMap()
		{
			this.N=4;
			this.buckets=new LinkedList[N];
			for(int i=0;i<buckets.length;i++)
			{
				buckets[i]=new LinkedList<>();
			}
		}
		
		
		private int HashFunction(K key)
		{
			int bi=hashCode();
			
			return Math.abs(bi)%N;
		}
		
		
		private int SearchLL(K key,int bi)
		{
			LinkedList<Node> l = buckets[bi];
			
			for(int i=0;i<l.size();i++)
			{
				if(l.get(i).key==key)
				{
					return i;
				}
			}
			return -1;
		}
		
		public void put(K key,V value)
		{
			int bi=HashFunction(key);
			int di=SearchLL(key,bi);
			
			if(di==-1)//If does not exist
			{
				buckets[bi].add(new Node(key,value));
				n++;
			}
			else//If node exist
			{
				Node node=buckets[bi].get(di);
				
				node.value=value;
			}
			
			double lambda=(double)n/N;
			
			if(lambda>2.0)
			{
				rehash();
			}
		}
		
	  private void rehash()
	  {
		  LinkedList<Node> oldBuckets[]=buckets;
		  buckets=new LinkedList[N*2];
		  
		  for(int i=0;i<oldBuckets.length;i++)
		  {
			  LinkedList<Node> l=oldBuckets[i];
			  
			  for(int j=0;j<l.size();i++)
			  {
				  Node node=l.get(i);
				  put(node.key,node.value);
			  }
		  }
		  
	  }
	  
	  
		public V get(K key)
		{
			int bi=HashFunction(key);
			int di=SearchLL(key,bi);
			
			if(di==-1)
			{
				return null;
			}
			else
			{
				Node node=buckets[bi].get(di);
				return node.value;
			}
		}
		
		public V remove(K key)
		{
			int bi=HashFunction(key);
			int di=SearchLL(key,bi);
			
			if(di==-1)
			{
				return null;
			}
			else {
				Node node=buckets[bi].remove(di);
				n--;
				return node.value;
			}
			
		}
		
		
		public boolean containsKey(K key)
		{
			int bi=HashFunction(key);
			int di=SearchLL(key,bi);
			
			if(di==-1)
			{
				return false;
			}
			else
			{
				return true;
			}
			
		}
		
		
		public boolean isEmpty() {
			
			return n==0;
		}
		
		
		public ArrayList<K> keySet()
		{
			ArrayList<K> keys= new ArrayList<>();
			
			for(int i=0;i<buckets.length;i++)
			{
				LinkedList<Node> l = buckets[i];
				
				for(int j=0;j<l.size();j++)
				{
					Node node=l.get(j);
					keys.add(node.key);
				}
			}
			return  keys;
		}
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		
		HashMapCode hs=new HashMapCode();
		
	   HashMap<String,Integer> map=new HashMap<>();
	   map.put("India", 140);
	   map.put("China", 135);
	   map.put("USA", 80);
	   
	  //System.out.println(map.get("India"));
	   //map.remove("China");
//	   if(map.containsKey("China"))
//	   {
//		   System.out.println("Yes");
//	   }
//	   else
//	   {
//		   System.out.println("NO");
//	   }
	   
	  // System.out.println(map.isEmpty());
	   
	       ArrayList<String> keys=map.keySet();
	   
	   for (String n : keys) {
		System.out.println(n+" "+map.get(n));
	}
	 
		
		

	}

}

package Data_structures;

import java.util.LinkedList;
import java.util.Queue;

public class TreeOne {
	//Implementing binary tree
	
	class Node{
		int data;
		Node left;
		Node right;
		public Object SubRoot;
		
		Node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}	
	}

	// class BinaryTree{
		int i=-1;
		int i1=-1;
		public Node buildTree(int[] nodes)
		{
			i++;
			if(nodes[i]==-1)
			{
				return null;
			}
			Node newnode = new Node(nodes[i]);
		    newnode.left=buildTree(nodes);
		    newnode.right=buildTree(nodes);
		    
		    
		    return newnode;
			
		}
	// }
		//int i1=-1;
		public Node buildTree1(int[] nodes)
		{
			i1++;
			if(nodes[i1]==-1)
			{
				return null;
			}
			Node newnode = new Node(nodes[i1]);
		    newnode.left=buildTree1(nodes);
		    newnode.right=buildTree1(nodes);
		    
		    
		    return newnode;
			
		}
	 
		
	
		//Pre_oreder traversal 
		
		public  void PreOrder(Node root)
		{
			if(root == null)
			{
				return;
			}
			System.out.println(root.data);
			PreOrder(root.left);
			PreOrder(root.right);
	
		}
		
		
		
		//In_order traversal
		
		public void InOrder(Node root)
		{
			if(root==null)
			{
				return;
			}
			InOrder(root.left);
			System.out.println(root.data);
			InOrder(root.right);
		}
		
		
		//Post_Oder traversal
		
		public void PostOrder(Node root)
		{
			if(root==null)
			{
				return;
			}
			PostOrder(root.left);
			PostOrder(root.right);
			System.out.println(root.data);
			
		}
		
		
		//Level_Order traversal
		public void LevelOrder(Node root)
		{
			if(root==null)
			{
				return;
			}
			Queue<Node> q=new LinkedList<>();
			q.add(root);
			q.add(null);
			
			while(!q.isEmpty())
			{
				Node curr=q.remove();
				if(curr==null)
				{
					System.out.println();
					if(q.isEmpty())
					{
						break;
					}
					else
					{
						q.add(null);
					}
				}
				else
				{
					System.out.print(curr.data+" ");
					if(curr.left!=null)
					{
						q.add(curr.left);
					}
					if(curr.right!=null)
					{
						q.add(curr.right);
					}
				}
			}
			
			
		}
       
		
		//Counting no of Nodes 
		public int CountNode(Node root)
		{
			if(root==null)
			{
				return 0;
			}
			int left=CountNode(root.left);
			int right=CountNode(root.right);
			
			return left+right+1;
			
			
		}
		
		//To find sum of nodes in tree
		public int SumNode(Node root)
		{
			if(root==null)
			{
				return 0;
			}
			int left=SumNode(root.left);
			int right=SumNode(root.right);
			
			return left+right+root.data;
			
			
		}
		
		//To find Height of a tree
		public int Height(Node root)
		{
			if(root==null)
			{
				return 0;
			}
			int left=Height(root.left);
			int right=Height(root.right);
			
			int myHeight=Math.max(left, right)+1;
			
			return myHeight;
			
			
		}
		
		
		//Diameter of a tree
		//[Here we have to find three cases Left sub tree as dia1, right sub tree as dia2 and LST & RST including main root as dia3 , finally finding out max of dia1,2,3]
		public int Diameter(Node root)
		{
			if(root==null)
			{
				return 0;
			}
			int dia1=Diameter(root.left);
			int dia2=Diameter(root.right);
			int dia3=Height(root.left)+Height(root.right)+1;
			
			return Math.max(dia3, Math.max(dia1, dia2));
			
		}
		
		
		//Sub_tree of another tree
		
		public boolean isSubTree(Node root, Node SubRoot)
		{
			if(SubRoot==null)
			{
				return true;
			}
			
			if(root==null)
			{
				return false;
			}
			
			if(root.data==SubRoot.data)
			{
				if(isIdentical(root,SubRoot))
				   return true;
			}
			
			return isSubTree(root.left,SubRoot) || isSubTree(root.right,SubRoot);
			
		}
		
		//isIdentical function to check whether both the subTrees are identical or NOT
		
		public boolean isIdentical(Node root, Node SubRoot) {
			if(root==null && SubRoot==null)
			{
				return true;
			}
			
			if(root==null || SubRoot==null)
			{
				return false;
			}
			
			
			if(root.data==SubRoot.data) {
				return isIdentical(root.left,SubRoot.left) && isIdentical(root.right,SubRoot.right);
			}
			return false;
		}
		
		
		
		//Finding sum of nodes at Kth level
		public int SumAtKthLevel(Node root,int k)
		{
			if(root==null)
			{
				return 0;
			}
			Queue<Node> q=new LinkedList<>();
			q.add(root);
			//add null;
			int level=1;
			int sum=0;
			
			while(!q.isEmpty())
			{
				int size=q.size();
				sum=0;
				for(int i=0;i<size;i++)
				{
				Node curr=q.remove();
				
				if(level==k)
				{
					sum+=curr.data;
				}
				if(curr.left!=null)
				{
					q.add(curr.left);
				}
				if(curr.right!=null)
				{
					q.add(curr.right);
				}
				}
				if(level==k)
				{
					break;
				}
				level++;
			}
			
			return sum;
		}
		
		//Finding greatest element at Kth level
		public int GreatestAtKthLevel(Node root,int k)
		{
			if(root==null)
			{
				return 0;
			}
			Queue<Node> q=new LinkedList<>();
			q.add(root);
			//add null;
			int level=1;
			int sum=0;
			
			while(!q.isEmpty())
			{
				int size=q.size();
				sum=0;
				for(int i=0;i<size;i++)
				{
				Node curr=q.remove();
				
				if(level==k)
				{   // To find greatest element at kth level
					if(sum<curr.data)
					{
						sum=curr.data;
					}
				}
				if(curr.left!=null)
				{
					q.add(curr.left);
				}
				if(curr.right!=null)
				{
					q.add(curr.right);
				}
				}
				if(level==k)
				{
					break;
				}
				level++;
			}
			
			return sum;
		}
		
		
		//Finding smallest element at Kth level
				public int SmallestAtKthLevel(Node root,int k)
				{
					if(root==null)
					{
						return 0;
					}
					Queue<Node> q=new LinkedList<>();
					q.add(root);
					//add null;
					int level=1;
					//int sum=0;
					
					while(!q.isEmpty())
					{
						int size=q.size();
						int min=Integer.MAX_VALUE;
						for(int i=0;i<size;i++)
						{
						Node curr=q.remove();
						
						if(level==k)
						{   // To find smallest element at kth level
						   min=Math.min(min, curr.data);
						}
						if(curr.left!=null)
						{
							q.add(curr.left);
						}
						if(curr.right!=null)
						{
							q.add(curr.right);
						}
						}
						if(level==k)
						{
							return min;
						}
						level++;
					}
					
					return -1;
				}
		
		


	public static void main(String[] args) {
		
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		int nodes1[]= {2,4,-1,-1,5,-1,-1};
		
		TreeOne b=new TreeOne();
		//BinaryTree b1=new BinaryTree();
		//b1.buildTree(nodes);
		
		Node root=b.buildTree(nodes);
		Node SubRoot=b.buildTree1(nodes1);
		//System.out.println(SubRoot.data);
		
		//System.out.println(root.data);
		
		//b.PreOrder(root);
		//b.InOrder(root);
		//b.PostOrder(root);
		//b.LevelOrder(root);
		
		//System.out.println(b.CountNode(root));
		
		//System.out.println(b.SumNode(root));
		
		//System.out.println(b.Height(root));
		
		//System.out.println(b.Diameter(root));
		
		//System.out.println(b.isSubTree(root, SubRoot));
		
		//System.out.println(b.SumAtKthLevel(root, 2));
		
		//System.out.println(b.GreatestAtKthLevel(root, 1));
		
		System.out.println(b.SmallestAtKthLevel(root, 2));

	}

	

	}

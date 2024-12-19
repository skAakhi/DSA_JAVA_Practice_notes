package Data_structures;

import java.util.ArrayList;

import Data_structures.TreeOne.Node;

public class BSTOne {
	
	class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data)
		{
			this.data=data;
		}
	}
	
	
	//Build a BST tree
	public Node insert(Node root, int val)
	{
		if(root==null)
		{
			root=new Node(val);
			return root;
		}
		
		if(root.data>val) {
			root.left=insert(root.left,val);
			
		}
		else {
			root.right=insert(root.right,val);
		}
		
		return root;
	}
	
	//In_order traversal to traverse a BST tree in sequence order
	public void InOrder(Node root)
	{
		if(root==null)
		{
			return;
		}
		InOrder(root.left);
		System.out.print(root.data+" ");
		InOrder(root.right);
	}
	
	
	//Delete a particular node in BST tree
	//There are three different senarios to delete a node at different cases
	//case 1: [NO child]- Delete a node return null to parent
	//case 2: [One child]-Delete a node & replace with child node(left or right) by comparing with its parent
	//case 3: [Two child]-Replace a node with in_order successor & delete it [left most in right sub_tree]
	
	public Node deleteNode(Node root,int val)
	{
		if(root.data>val) {
			root.left=deleteNode(root.left,val);
		}
		else if(root.data<val)
		{
			root.right=deleteNode(root.right,val);
			
		}
		else {
			//case 1
			if(root.left==null && root.right==null)
			{
				return null;
			}
			//case 2
			if(root.left==null)
			{
				return root.right;
			}
			else if(root.right==null)
			{
				return root.left;
			}
			//case 3
			else {
				Node IS=inorderSuccessor(root.right);
				root.data=IS.data;
				root.right=deleteNode(root.right,IS.data);
				
			}
		}
		
		return root;
	}
	
	// InorderSuccessor to assist case 3 
	public Node inorderSuccessor(Node root)
	{
		while(root.left!=null)
		{
			root=root.left;
		}
		
		return root;
	}
	
	
	//Printing range of nodes
	public void PrintRange(Node root,int x,int y)
	{
		if(root==null)
		{
			return;
		}
		//case 1
		if(root.data>=x && root.data<=y)
		{
			PrintRange(root.left,x,y);
			System.out.print(root.data+" ");
			PrintRange(root.right,x,y);
		}
		//case 2
		else if(root.data>=y)
		{
			PrintRange(root.left,x,y);
		}
		else
		{
			PrintRange(root.right,x,y);
		}
	}
	
	
	//Printing root to leaf node of every individual path
	public void RootToLeaf(Node root,ArrayList<Integer> path)
	{
		if(root==null)
		{
			return;
		}
		path.add(root.data);
		if(root.left==null && root.right==null) {
			Print(path);
		}
		else {
			RootToLeaf(root.left,path);
			RootToLeaf(root.right,path);
		}
		path.remove(path.size()-1);
	}
	
	//To print List of elements
	public void Print(ArrayList<Integer> path)
	{
		for(int i=0;i<path.size();i++)
		{
			System.out.print(path.get(i)+"->");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		int values[]= {5,1,3,4,2,7};
		
		BSTOne b = new BSTOne();
		Node root=null;
		for(int i=0;i<values.length;i++)
		{
			root=b.insert(root,values[i]);
		}
		
		//b.InOrder(root);
		
		//b.deleteNode(root, 3);
		//b.InOrder(root);
		
		//b.PrintRange(root, 2,4);
		
		ArrayList<Integer> path=new ArrayList<>();
		
		b.RootToLeaf(root,path);
		
		
		
		
	}

}

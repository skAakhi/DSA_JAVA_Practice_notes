package Data_structures;

import Data_structures.LL.Node;


//Stack using LinkedList
public class Stack {

	Node head;
    int size;
	
	Stack()
	{
		this.size=0;
	}
	
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data=data;
			this.next=null;
			size++;
		}
		
	}	
		
	public void push(String data) {
		
	Node newnode=new Node(data);
	    //size++;
		if(isEmpty())
		{
			head=newnode;
			return;
		}
		newnode.next=head;
		head=newnode;
	}
	
	
	public String pop()
	{
		if(isEmpty())
		{
			return null;
		}
		size--;
		String val=head.data;
		head=head.next;
		
		return val;
		
	}
	
	public String peek()
	{
		if(head==null)
		{
			return null;
		}
		
		return head.data;
	}

	
	
	public boolean isEmpty() {
		if(head==null) {
		return true ;
		}
		return false;
	}
	
	public int getSize()
	{
		return size;
	}


	
	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		s.push("1");
		s.push("2");
		s.push("3");
		s.pop();
		//s.peek();
		
		System.out.println("Size of your Stack is =" +s.getSize());
		while(!s.isEmpty())
		{
			System.out.println(s.peek());
			s.pop();
		}
		//System.out.println(s.getSize());
		//System.out.println(size);

	}

	

	}
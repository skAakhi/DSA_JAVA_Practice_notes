package Data_structures;

public class QueueThree {
	//Queue using LinkedList
	
	Node head=null;
	Node tail=null;
	class Node{
		int data;
		Node next=null;
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public boolean isEmpty()
	{
		return head==null && tail==null;
	}
	
	public void add(int data)
	{
		Node newnode = new Node(data);
		if(head==null)
		{
			head=tail=newnode;
		}
		tail.next=newnode;
		tail=newnode;
		
	}
	
	public int remove()
	{
		if(isEmpty())
		{
			System.out.println("No elements in Queue");
			return -1;
		}
		int front=head.data;
		if(head==tail)
		{
			head=tail=null;
			return -1;
		}
		head=head.next;
		return front;
		
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("No elements in Queue");
			return -1;
		}
		return head.data;
		
	}

	public static void main(String[] args) {
		QueueThree q = new QueueThree();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		while(!q.isEmpty())
		{
			System.out.println(q.peek());
			q.remove();
		}
		System.out.println(q.isEmpty());

	}

}

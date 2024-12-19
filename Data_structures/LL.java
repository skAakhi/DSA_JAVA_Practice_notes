package Data_structures;

public class LL {
	
	//private static final Node Node = null;
	 Node head;
	//Node tail;
	private int size;
	
	LL()
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

	
	//addFirst and addLast
	//addFirst
	public  void addFirst(String data)
	{
		Node newNode = new Node(data);
		
		if(head==null)
		{
			head=newNode;
			return;
		}
		
		newNode.next=head;
		head=newNode;
	}
	//addLast
	public  void addLast(String data)
	{
		Node newNode = new Node(data);
		
		if(head==null)
		{
			head=newNode;
			return;
		}
		
		Node curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
			
		}
		curr.next=newNode;
		//newNode.next=null;
		
		
	}
	
	
	//Printing list of elements
	
	public void PintList()
	{
		if(head==null)
		{
			System.out.println("Linked list is empty");
			return;
		}
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+"--->");
			curr=curr.next;
			
		}
		System.out.println("NULL");
		
	}
	
	//DeleteFirst and DeleteLast
	
	//DeleteFirst
	public void deleteFirst() {
		
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		size--;
		head=head.next;
	}
	
	
	//DeleteLast
      public void deleteLast() {
		
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		size--;
		if(head.next==null)
		{
			head=null;
			return;
		}
		Node curr=head;
		
		while(curr.next.next!=null)
		{
		
			curr=curr.next;
		}
		
		curr.next=null;
			
		}
      
      
      //Return Size
      public int getSize()
      {
    	  return size;
      }
	
      
      
      
      public Node reverse(Node head) {
    	  
    	  if(head==null || head.next==null)
    	  {
    		  System.out.println("List is empty");
    		  return head;
    	  }
    	  Node pre=head;
    	  Node curr=head.next;
    	  
    	  while(curr!=null)
    	  {
    		  Node nextnode=curr.next;
    		  curr.next=pre;
    		  
    		  //Updation 
    		  pre=curr;
    		  curr=nextnode;
    		  
    	  }
    	  
    	  head.next=null;
    	  head=pre;
    	  
    	  return head;
      }
      
      
     // Reversing linked list using recursive call
      
      public static Node reverseRecursive(Node head)
      {
    	  if(head==null ||head.next==null)
    	  {
    		  return head;
    	  }
    	  
    	  Node newHead=reverseRecursive(head.next);
    	  head.next.next=head;
    	  head.next=null;
    	  
    	  
		return newHead;
      }
	

	public Node FindNthNode(int k)
	{
		if(head==null || head.next==null)
		{
			return head;
		}
		Node curr=head;
		int size=0;
		
		while(curr!=null)
		{
			curr=curr.next;
			size++;
		}
		int index=size-k+1;
		int i=1;
		 curr=head;
		while(i<index)
		{
			curr=curr.next;
			i++;
			
		}
		
		return curr;
		
	}
	
	//BruteForce approch     TC = O(2Xlen)
	public Node DeleteNthNode(int k)
	{
		if(head==null || head.next==null)
		{
			return head;
		}
		Node curr=head;
		int size=0;
		
		while(curr!=null)
		{
			curr=curr.next;
			size++;
		}
		if(size==k) {
			return head.next;
		}
		int index=size-k;
		int i=1;
		 Node pre=head;
		while(i<index)
		{
			pre=pre.next;
			i++;
			
		}
		pre.next=pre.next.next;
		
		return head;
		
	}
	
	
	//Fast technique which will reduce TC than above one
	@SuppressWarnings("unused")
	public Node DeleteNthNodeOne(int k)
	{
		Node rabb=head;
		
		for(int i=0;i<k;i++)
		{
			rabb=rabb.next;
		}
		if(rabb==null) 
		{
			return head.next;
		}
		
		Node trut=head;
		
		while(rabb.next!=null)
		{
			trut=trut.next;
			rabb=rabb.next;
		}
		
		trut.next=trut.next.next;
		
		return head;
	}
	
	
	//Checking palindrome or NOT
	public boolean isPalindrome()
	{
		if(head==null || head.next==null)
		{
			return true;
		}
		Node mid=FindMiddle(head);
		 Node secondHalf=reverseOne(mid.next);
		 Node FirstHalf=head;
		
		 while(secondHalf!=null)
		 {
			 if(!FirstHalf.data.equals(secondHalf.data))
			 {
				 return false;
			 }
			  
			 FirstHalf=FirstHalf.next;
			    secondHalf=secondHalf.next;
		 }
		 
		 return true;
	}
	
	public Node reverseOne(Node head)
	{
		Node pre=null;
		Node curr=head;
		
		while(curr!=null)
		{
			Node next=curr.next;
			curr.next=pre;
			
			pre=curr;
			curr=next;
		}
		
		return pre;
	}
	
	
	
	public Node FindMiddle(Node head) {
		
		Node rab=head;
		Node Turt=head;
		
		while(rab.next!=null && rab.next.next!=null)
		{
			rab=rab.next.next;
			Turt=Turt.next;
		}
		
		return Turt;
	}
	
	
	//Detecting there is cycle or NOT
	public boolean hasCycle() {
		if(head==null)
		{
			return false;
		}
		Node rab=head;
		Node trut=head;
		
		while(rab!=null && rab.next!=null)
		{
			rab=rab.next.next;
			trut=trut.next;
			
			
			if(rab==trut)
			{
				return true;
			}
			
		}
		return false;
	}
	
	
	

	public static void main(String[] args) {
		
		LL list=new LL();
		//list.addFirst("1");
		//list.addFirst("2");
		list.addLast("1");
		list.addLast("2");
		list.addLast("2");
		list.addLast("1");
		list.addLast("3");
		list.addFirst("3");
	
		list.PintList();
//		list.deleteFirst();
//		list.PintList();
//		list.deleteLast();
//		list.PintList();
//		System.out.println(list.getSize());
//		list.addFirst("Who");
//		System.out.println(list.getSize());
		
//	    list.reverse();
		//list.head=reverseRecursive(list.head);
		//list.PintList();
		//System.out.println(list.FindNthNode(4).data);
		
//		list.head=list.DeleteNthNode(3);
//		list.PintList();
		
//		list
		//list.head=list.DeleteNthNodeOne(4);
		//list.PintList();
		
		if(list.isPalindrome())
			System.out.println("Palindrome");
		else 
			System.out.println("Not a palindrome");
		
		if(list.hasCycle())
		System.out.println("Yes has a cycle");
		else
			System.out.println("There is no cycle");
		//list.PintList();
	}

}

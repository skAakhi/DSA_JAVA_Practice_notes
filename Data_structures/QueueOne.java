package Data_structures;

public class QueueOne {
  //Queue using arrays
	int arr[];
	int size;
	//int front=-1;
	int rear=-1;
	
	QueueOne(int n)
	{
		arr=new int[n];
		this.size=n;
		
	}
	
	

	public boolean isEmpty()
	{
		return rear==-1;
	}
	public void add(int data)
	{
		if(rear==size-1)
		{
			System.out.println("Queue is full");
			return;
		}
		
		rear++;
		arr[rear]=data;
		
	}
	
	public int remove()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return -1;
		}
		int front=arr[0];
		
		for(int i=0;i<rear;i++)
		{
			arr[i]=arr[i+1];
		}
		rear--;
		
		return front;
	}
	
	
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return -1;
		}
		
		return arr[0];
	}
	
	
	
	public static void main(String[] args) {
		
		
		QueueOne q = new QueueOne(5);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(7);
		
		while(!q.isEmpty())
		{
			System.out.println(q.peek());
			q.remove();
		}
	}

}

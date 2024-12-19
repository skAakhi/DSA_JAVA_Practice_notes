package Data_structures;

public class QueueTwo {
//Circular_Queue using array but [Insertion takes places at front & rear] 
	
	int arr[];
	int size;
	int front=-1;
	int rear=-1;
	
	QueueTwo(int n)
	{
		arr=new int[n];
		this.size=n;
		
	}
	
	public boolean isEmpty()
	{
		return rear==-1 && front==-1;
	}
	
	
	public boolean isFull()
	{
		return (rear+1)%size==front;
	}
	
	
	public void add(int data)
	{
		if(isFull())
		{
			System.out.println("Circular_Queue is full");
			return;
		}
		
		if(front==-1)
		{
			front++;
		}
		rear=(rear+1)%size;
		
		arr[rear]=data;
	}
	
	
	public int remove()
	{
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		
		int res=arr[front];
		if(rear==front)
		{
			front=rear=-1;
		}else {
		front=(front+1)%size;
		}
		return res;
	}
	
	public int peek()
	{
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return arr[front];
		
	}
	
	
	
	public static void main(String[] args) {
		QueueTwo q = new QueueTwo(5);
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.remove();
		q.remove();
		q.add(6);
		q.add(7);
		
		while(!q.isEmpty())
		{
			System.out.println(q.peek());
			q.remove();
		}
	}

}

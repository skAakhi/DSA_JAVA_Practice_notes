package Data_structures;

import java.util.LinkedList;
import java.util.Queue;

public class QueueFour {
	//Queue using collection frameWork by implementing Queue interface using LinkedList class 

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		//System.out.println(q);
		while(!q.isEmpty())
		{
			System.out.println(q.peek());
			q.remove();
		}
		

	}

}

package Data_structures;

import java.util.ArrayList;

public class StackOne {
	//Stack using ArrayList
	
	ArrayList<Integer> ls=new ArrayList<>();
	
	
	public void push(int data)
	{
		ls.add(data);
	}
	
	public int pop()
	{
		int top=ls.get(ls.size()-1);
        ls.remove(ls.size()-1);
        
        return top;
	}
	
	public boolean isEmpty() {
		
		return ls.size()==0;
	}
	
	public int peek()
	{
		return ls.get(ls.size()-1);
	}
	
	public void PushAtBottom(int data,StackOne s)
	{
		if(s.isEmpty())
		{
			s.push(data);
			return;
		}
		
		int top=s.pop();
		PushAtBottom(data,s);
		s.push(top);
		
	}

	public static void main(String[] args) {
		
		StackOne s=new StackOne();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.PushAtBottom(10,s);
		while(!s.isEmpty())
		{
			System.out.println(s.peek());
			s.pop();		
		}
		
	}

}

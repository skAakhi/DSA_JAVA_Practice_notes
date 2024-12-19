package Data_structures;

import java.util.*;
public class LLOne {
	
	public static void main(String[] args) {
		
		List<String> list=new LinkedList<>();
		
		// addFirst  & addLast or add
		list.addFirst("hai");
		list.addFirst("hey");
		System.out.println(list);
		
		list.addLast("You");
		list.addLast("wait");
		list.add("hah");
		System.out.println(list);
		
		
		// get() [To retrive every element of object]
		
		//Option 1
//		for (String s : list) {
//			System.out.println(s);
//		}
		
		//Option 2
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		
		
		
		//removeFirst  && removeLast  && remove(index)
		
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		
		
		
		
		// set() [To modify elements at particular index]
		
		list.set(1, "Heloo");
		System.out.println(list);
		
			
	}

}

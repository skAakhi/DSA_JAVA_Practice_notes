package Data_structures;

import java.util.HashMap;

public class HashMapThree {
	
	public String Itinerary(HashMap<String,String> map)
	{
		HashMap<String,String> revmap = new HashMap<>();
		
		for (String i : map.keySet()) {
			
			revmap.put(map.get(i),i);
		}
		for (String i: map.keySet()) {
			
			if(!revmap.containsKey(i))
			{
				return i;
			}
		}
		return null;
		
	}

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		
		//from - To
		map.put("Chennai", "Bengaluru");
		map.put("Mumbai", "Delhi");
		map.put("Goa", "Chennai");
		map.put("Delhi", "Goa");
		
		HashMapThree hp=new HashMapThree();
		String start=hp.Itinerary(map);//Finding start
		
		System.out.print(start+"-->");
		
		for(int i=0;i<map.size();i++)
		{
			System.out.print(map.get(start)+"-->");
			  start=map.get(start);
			//System.out.println(map.get(start));
		}
	}

}

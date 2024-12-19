package Data_structures;

import java.util.HashSet;

public class HashSetOne {
	
	//union of two arrays [which will give unique elements among two]
	public void union(int[] arr1,int[] arr2)
	{
		HashSet<Integer> hs=new HashSet<>();
		
		for(int i=0;i<arr1.length;i++)
			hs.add(arr1[i]);
		for(int j=0;j<arr2.length;j++)
		hs.add(arr2[j]);
		
		System.out.println(hs.size());
		
		for (Integer i : hs) {
			System.out.print(i+" ");
		}
		
	}
	
	//Intersection of two arrays which will give common elements among two arrays
	public void intersection(int[] arr1,int[] arr2)
	{
		HashSet<Integer> hs=new HashSet<>();
		HashSet<Integer> hs1=new HashSet<>();
		int count=0;
		
		for(int i=0;i<arr1.length;i++)
			hs.add(arr1[i]);
		
		for(int j=0;j<arr2.length;j++) {
			
			if(hs.contains(arr2[j]))
			{
				count++;//counting common elements among two
				//hs1.add(arr2[j]); // To print common elements i can use hs1 before deleting it from hs HashSet
				hs.remove(arr2[j]);
				
			}
			
		}
		
		System.out.println(count);
		
//		for (Integer i : hs1) {
//			System.out.print(i+" ");
//		}
//	
		
		
	}
	

	public static void main(String[] args) {
		int arr1[]= {7,3,9};
		int arr2[]= {6,3,9,6,2,4};
		
		HashSetOne hs=new HashSetOne();
		
		//hs.union(arr1,arr2);
		
		hs.intersection(arr1, arr2);
		
		

	}

}

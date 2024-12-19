package Data_structures;

import java.util.HashMap;

public class HashMapTwo {
	
	//Finding majority elements which the frequency of each element is greater than n/3[n is size of your array]
	public void majority(int[] nums)
	{
		HashMap<Integer,Integer> map=new HashMap<>();
        
		for(int i=0;i<nums.length;i++)
		{
			if(map.containsKey(nums[i]))
			{
				map.put(nums[i], map.get(nums[i])+1);
			}
			else
			{
				map.put(nums[i], 1);
			}
		}
		
		//Finding majority element
		int n=nums.length;
		for (int i : map.keySet()) {
			
			if(map.get(i)>n/3)
			{
				System.out.print(i+" ");
			}
			
		}
		
		
		
		
	}

	public static void main(String[] args) {
		int nums[]= {1,2}; //{1,3,2,5,1,3,1,5,1};
		
       HashMapTwo hs=new HashMapTwo();
       
       hs.majority(nums);
       

	}

}

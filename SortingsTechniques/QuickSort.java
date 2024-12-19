package SortingsTechniques;

import java.util.Scanner;

public class QuickSort {
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your size of your array: ");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Quick(arr,0,n-1);
		
		//After sorting
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}
	
	
	public static void Quick(int[] arr, int low, int high)
	{
		if(low<high)
		{
			int pivot=Partition(arr,low,high);
			
			Quick(arr,low,pivot-1);
			Quick(arr,pivot+1,high);
		}
	}

	
	
	
	public static int Partition(int[] arr,int low,int high)
	{
		int pivot=arr[high];
		int x=-1;
		
		for(int i=0;i<high;i++)
		{
			if(arr[i]<pivot)
			{
				x++;
				int temp=arr[x];
				arr[x]=arr[i];
				arr[i]=temp;
			}
		}
		
		//swapping last most element [if comparing element is smallest than last then (x) and (high) of its elements swap itself into same positions]  
		x++;
		int temp=arr[high];
		arr[high]=arr[x];
		arr[x]=temp;
		
		return x;
		
	}
	
	
	
	
	
	
	
	
}

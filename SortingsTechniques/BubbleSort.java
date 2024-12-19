package SortingsTechniques;

import java.util.Scanner;

public class BubbleSort {
	// Time Complexity O(N^2)
	
	public static void swap(int first,int second)
	{
		int temp=first;
		first=second;
		second=temp;
		
		//return(first , second);
	}
	public static void sort(int n,int[] arr)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					//swap(arr[j],arr[j+1]);
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("After sorting ");
		for(int i=0;i<n;i++)
		{
		 System.out.print(arr[i]+" ");
		}
		//return arr;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
     	sort(n,arr);
//		System.out.println("After sorting ");
//		for(int i=0;i<n;i++)
//		{
//			System.out.print(newone[i]+" ");
//		}

	}

}

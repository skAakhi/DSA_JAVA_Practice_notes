package Recursions;

import java.util.Scanner;

public class Five {
    
	//Finding out is array is sorted or not
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(isSorted(arr,0));
		

	}
	//public static boolean val[]=new boolean[26];
	
	
	public static boolean isSorted(int[] arr,int i)
	{
		if(i==arr.length-1)
		{
			
			return true;
		}
		if(arr[i]<arr[i+1])
			isSorted(arr,i+1);
		else
			return false;
		
		return true;
	}
}

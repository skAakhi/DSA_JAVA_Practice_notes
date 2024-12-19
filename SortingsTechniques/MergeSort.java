package SortingsTechniques;

import java.util.Scanner;

public class MergeSort {
    // Merge--->[Divide and conquer]
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your size of your array: ");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int n1=arr.length;
		Divide(arr,0,n1-1);
		
		//After sorting your array
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
	
	//Logic for dividing
	public static void Divide(int[] arr,int low,int high) {
		if(low>=high)
		{
			return;
		}
		int mid=low+(high-low)/2;
		Divide(arr,low,mid);
		Divide(arr,mid+1,high);
		
		Conquer(arr,low,high);
	}
	
	public static void Conquer(int[] arr,int low,int high) {
	
		int[] merged=new int[high-low+1];
		
		int mid=low+(high-low)/2;
		//Comparing two arrays
		int i1=low;
		int i2=mid+1;
		int x=0;
		while(i1<=mid && i2<=high) {
			if(arr[i1]<arr[i2])
			{
				merged[x++]=arr[i1++];
			}
			else {
				merged[x++]=arr[i2++];
			}
		}
		
		//Remaining elements anything remains in array will fulfill by anyone of this among two while loops below
		while(i1<=mid)
		{
			merged[x++]=arr[i1++];
		}
		
		while(i2<=high)
		{
			merged[x++]=arr[i2++];
			
		}
		
		//Copying elements from duplicate array to original array 
		for(int i=0;i<merged.length;i++)
		{
			arr[low+i]=merged[i];
//			System.out.print(merged[i]+" ");
		}
	}

}

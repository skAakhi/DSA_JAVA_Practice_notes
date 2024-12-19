package SortingsTechniques;

import java.util.Scanner;

public class InsertionSort {
	//Time complexity O(N)
	public static void insertionsort(int n,int[] a)
	{
		for(int i=1;i<n;i++)
		{
			int curr=a[i];
			int j=i-1;
			while(j>=0 && curr<a[j])
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=curr;
		}
		System.out.println("After sorting");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int[] a=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		insertionsort(n,a);
		
		

	}

}

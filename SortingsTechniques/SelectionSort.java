package SortingsTechniques;

import java.util.Scanner;

public class SelectionSort {
	
	public static void Selection(int n,int[] a) {
		
		
		for(int i=0;i<n;i++)
		{
			int small=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[small]>a[j])
				{
					small=j;
				}
//				int temp=a[small];
//				   a[small]=a[i];
//				   a[i]=temp;
////				
			}
			int temp=a[small];
			   a[small]=a[i];
			   a[i]=temp;
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
		
		Selection(n,a);
		
	}

}

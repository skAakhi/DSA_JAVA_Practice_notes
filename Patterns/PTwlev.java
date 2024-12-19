package Patterns;

import java.util.Scanner;

public class PTwlev {
	
	public static void print(int n)
	{   int sum=1; // pattern type 1 (Flyoid triangle)
		for(int i=0;i<n;i++)
		{   //int sum=1;  // pattern type 2
			for(int j=0;j<=i;j++)
			{
				System.out.print(sum++ +" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      print(n);
      sc.close();
	}

}

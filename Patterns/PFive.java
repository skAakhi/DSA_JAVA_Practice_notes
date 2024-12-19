package Patterns;

import java.util.Scanner;

public class PFive {
	
	public static void print(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			System.out.print(" ");
			
			for(int j=0;j<n;j++)
				System.out.print("*");
			
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

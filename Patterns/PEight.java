package Patterns;

import java.util.Scanner;

public class PEight {
	
	public static void print(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			System.out.print(" ");
			
			for(int j=i;j>=1;j--)
				System.out.print(j);
			
			for(int j=2;j<=i;j++)
				System.out.print(j);
			
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

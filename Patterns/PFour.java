package Patterns;

import java.util.Scanner;

public class PFour {
	
	public static void print(int n)
	{
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n-i;j++)
			System.out.print(" ");
			
			for(int j=1;j<=i;j++)
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

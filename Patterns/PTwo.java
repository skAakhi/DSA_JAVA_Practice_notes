package Patterns;

import java.util.Scanner;

public class PTwo {
	
	public static void print(int n)
	{
		for(int i=n;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
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

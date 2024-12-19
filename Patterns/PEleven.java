package Patterns;

import java.util.Scanner;

public class PEleven {
	
	public static void print(int n)
	{
		int start=0;
		int size=2*n-1;
		int end=size-1;
		while(n!=0) {
		for(int i=start;i<=end;i++)
		{   
			for(int j=start;j<=end;j++)
			{
				if(i==start||i==end||j==start|| j==end) {
					System.out.print(n);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		++start;
		--end;
		--n;

		}
	}

	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      print(n);
      sc.close();
	}

}

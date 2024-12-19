package Recursions;

import java.util.Scanner;

public class Twelve {
   //Place tiles of size 1 x M in a floor of size N x M 
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		System.out.println(TileWays(n,m));

	}
	
	public static int TileWays(int n,int m) {
		
		if(n==m)
		{
			return 2;
		}
		if(n<m)
		{
			return 1;
		}
		
		
		// They can place tiles eighter by horizantal or vertical
		
		//VerticalWays
		int verticalWays=TileWays(n-m,m);
		
		//HorizantalWays
		int HorizantalWays=TileWays(n-1,m);
		
		
		return verticalWays+HorizantalWays;
		
		
			
	}

}

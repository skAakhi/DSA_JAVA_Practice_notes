package Recursions;

import java.util.Scanner;

public class Eleven {
  // Count total Paths in a maze to move from (0,0) to (n,m)
// n=3,m=3 total there are 6 ways
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		System.out.println(Maze(n,m,0,0));
		
		
	}
	
	public static int Maze(int n,int m,int i,int j)
	{
		
		if(i==n || j==m)
		{
			return 0;
		}
		if(i==n-1 && j==m-1)
		{
			return 1;
		}
		
		//Eigther it can move to RIGHT side or DOWNWARD side
		
		//For moving RIGHT SIDE
		int ways1=Maze(n,m,i,j+1);
		
		//For moving DOWNWARD side
        int ways2=Maze(n,m,i+1,j);		
		
        return ways1+ways2;
	}

}

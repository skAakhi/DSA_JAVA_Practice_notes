package Recursions;

import java.util.Scanner;

public class Three {
     // Tower of Hanoi  
	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
        Tower(n,"S","H","D");

	}
	
	public static void Tower(int n,String src,String help,String dest)
	{
		if(n==1)
		{
		System.out.println(n+" from "+src+" to "+dest);
		
		return;
		}
		
		
		Tower(n-1,src,dest,help);
		System.out.println(n+" from "+src+" to "+dest);
		Tower(n-1,help,src,dest);
		
	}

}

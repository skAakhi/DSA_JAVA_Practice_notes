package Recursions;

import java.util.Scanner;

public class Two {
    // Printing X^N (Stack height = N )
	//Printing X^N  (stack height = logN)
	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
		int n=sc.nextInt();
		//System.out.println(calpow(x,n));
		System.out.println(calpow1(x,n));
	}
	
	// Printing X^N (Stack height = N )
	public static int calpow(int x,int n)
	{
		if(n==0) {
			return 1;
		}
		if(x==0) {
			return 0;
		}
		
		int x1=calpow(x,n-1);
		int x2=x*x1;
		
		return x2;
		
		
	}
	
	//Printing X^N  (stack height = logN)
	public static int calpow1(int x,int n)
	{
		
		if(n==0) {
			return 1;
		}
		if(x==0) {
			return 0;
		}
		
		if(n%2==0)
			return calpow1(x,n/2)*calpow1(x,n/2);
		else
			return x*calpow1(x,n/2)*calpow1(x,n/2);
		
		
	}

}

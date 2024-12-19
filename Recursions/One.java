package Recursions;

import java.util.Scanner;

public class One {
//Print numbers from 5 to 1
// print numbers from 1 to 5
//Printing sum of N natural numbers
// Printing Factorial value
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		//print(n);
		//NaturalSum(0,n,0);
		//System.out.println(Fact(n));
//		System.out.print("0"+" " );
//		System.out.print("1"+" " );
	  fib(0,1,n-2,0);
	}
	
	//Head and tail 
	public static void print(int n)
	{
		if(n==0)
		{
			return;
		}
		//System.out.print(n+" ");
		print(n-1);
		System.out.print(n+" ");
	}
	
	//printing sum of N natural numbers
	public static void NaturalSum(int i,int n,int sum) {
		
		if(i==n)
		{   sum+=i;
			System.out.println(sum);
			return;
		}
		 sum+=i;
		NaturalSum(i+1,n,sum);
		
		
		//return sum;
	}
	
	//Factorial number 
	public static int Fact(int n)
	{
		
		if(n==0 || n==1)
		{
			return 1;
		}
		int fact_num=Fact(n-1);
		int number=n*fact_num;
		
		return number;
	}
	
	
	public static void fib(int a,int b,int n,int c)
	{
		if(n==0)
		{
			System.out.println(c);
			return;
		}
		//int c=a+b;
		 c=a+b;
		//System.out.print(c+" ");
		fib(b,c,n-1,c);
		
		//return c;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

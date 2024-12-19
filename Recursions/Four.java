package Recursions;

import java.util.Scanner;

public class Four {
    //Printing String in a reverse order
	//Printing First and Last occurance and last occurance
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch=sc.next();
		int n=ch.length();
		//Reverse(ch,n-1);
		Occurance(ch,0,'a');
		

	}
	//Printing String in a reverse order
	public static void Reverse(String ch,int i)
	{
		if(i==0)
		{  System.out.print(ch.charAt(i)+" ");
			return;
		}
		System.out.print(ch.charAt(i)+" ");
		Reverse(ch,i-1);
		
		
	}
	
	//Printing First and Last occurance and last occurance
	public static int first=-1;
	 public static int second=-1;
	public static void Occurance(String ch,int i,char ele)
	{
		if(i==ch.length())
		{   System.out.println(first);
		    System.out.println(second);
			return;
		}
		char curr=ch.charAt(i);
		if(curr==ele)
		{   //first++;
			if(first==-1)
			first=i;
			else
			second=i;
		}
		Occurance(ch,i+1,ele);
		
		
	}

}

package Recursions;

import java.util.HashSet;
import java.util.Scanner;

public class Eight {

	//Printing all subsequence of String 
	//Printing all subsequence of unique elements
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String ch=sc.nextLine();
		
		 //subsequence(ch,0," ");
		HashSet<String> hs=new HashSet<>();
		 UniqueSubsequence(ch,0,hs," ");

	}
	
	//Printing all subsequence of String 
	public static void subsequence(String ch,int i,String newone)
	{
		if(i==ch.length())
		{
			System.out.println(newone);
			return;
		}
		char curr=ch.charAt(i);
		
		// to choose 
		subsequence(ch,i+1,newone+curr);
		
		// to not to be choose
		subsequence(ch,i+1,newone);
	}
	
	//Printing all subsequence of unique elements
	public static void UniqueSubsequence(String ch, int i,HashSet<String> hs,String newone)
	{
		if(i==ch.length())
		{
			if(hs.contains(newone))
			{
				return;
			}
			else {
			System.out.println(newone);
			hs.add(newone);
			return;
			}
		}
		char curr=ch.charAt(i);
		
		// to choose 
		subsequence(ch,i+1,newone+curr);
		
		// to not to be choose
		subsequence(ch,i+1,newone);
		
	}

}

package Recursions;

import java.util.Scanner;

public class Ten {
   // Finding out Premutation combinations 
	// if string is abc then timeComplexity is (3!) factorial
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch=sc.nextLine();
		
		PrintPrem(ch," ");
	}
	
	public static void PrintPrem(String ch,String prem)
	{
	   
		if(ch.length()==0)
		{
			System.out.println(prem);
		}
		for(int i=0;i<ch.length();i++) {
			char curr=ch.charAt(i);
			
			String newone=ch.substring(0,i)+ch.substring(i+1);
			
			PrintPrem(newone,prem+curr);
			
			
		}
	}

}

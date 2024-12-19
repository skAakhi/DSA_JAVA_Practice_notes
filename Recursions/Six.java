package Recursions;

import java.util.Scanner;

public class Six {
   // Moving all X at the end of your string
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch=sc.nextLine();
		//int n=ch.length();
       PushX(ch,0,0," ");
	}
	
	public static void PushX(String ch , int i , int count,String newone)
	{
		if(i==ch.length())
		{   
			int idx=0;
			while(idx<count)
			{
				newone+='x';
				idx++;
			}
			System.out.println(newone);
			return;
		}
		char curr = ch.charAt(i);
		if(curr=='x')
			count++;
		else
			newone+=curr;
		PushX(ch,i+1,count,newone);
	}
 
}

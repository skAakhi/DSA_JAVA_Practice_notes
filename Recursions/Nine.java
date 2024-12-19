package Recursions;

import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch=sc.nextLine();//23
		
		KeypadComb(ch,0," ");

	}
	
	public static String[] keypad= {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	
	public static void KeypadComb(String ch,int i,String newone)
	{
		if(i==ch.length())
		{
			System.out.println(newone);
			return;
		}
		char curr=ch.charAt(i);
		String map=keypad[curr-'0'];
		
		for(int idx=0;idx<map.length();idx++)
		{
			KeypadComb(ch,i+1,newone+map.charAt(idx));
			
		}
		
	}

}

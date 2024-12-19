package Recursions;

import java.util.Scanner;

public class Seven {
    // Removing all duplicates in string
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch=sc.nextLine();
		
		RemoveDuplicates(ch,0," ");
		

	}
	//Created array for alphabets to subtract and to assign True or False
	public static boolean[] map=new boolean[26];
	
	public static boolean RemoveDuplicates(String ch,int i,String newone)
	{
		if(i==ch.length()) {
			System.out.println(newone);
			return true;
		}
		char curr = ch.charAt(i);
		if(map[curr-'a'])// if you want to remove uppercase then add A
		{
			RemoveDuplicates(ch,i+1,newone);
		}
		else {
			newone+=curr;
			map[curr-'a']=true;
			RemoveDuplicates(ch,i+1,newone);
		}
		return true;
	}
	

}

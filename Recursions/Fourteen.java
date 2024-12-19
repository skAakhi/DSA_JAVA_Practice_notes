package Recursions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fourteen {
    //Printing subSet of all set
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		ArrayList<Integer> l=new ArrayList<>();
		Sub(n,l);
		
	}
	public static void printSubSet(ArrayList<Integer> l) {
		
		for(int i=0;i<l.size();i++)
		{
			System.out.print(l.get(i)+" ");
		}
		System.out.println();
	}
	
	public static void Sub(int n,ArrayList<Integer> l)
	{
		if(n==0)
		{
			printSubSet(l);
			return;
		}
		
		l.add(n);
		Sub(n-1,l);
		
		l.remove(l.size()-1);
		Sub(n-1,l);
	}

}

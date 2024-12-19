package BitMasking;

import java.util.Scanner;

public class Set {
	// Updating  particular bit from 0 to 1
	
	public static int DTB(int n)
	{
		int bin=0,pow=0,rem=0;
		int ld=n;
		
		while(ld>0)
		{ 
			rem=ld%2;
			bin=bin+rem*(int)Math.pow(10, pow);
			pow++;
			ld=ld/2;
			//System.out.println(bin);
			
		}
		return bin;
	}
	

	
	public static void print(int n,int pos)
	{
		int bin=DTB(n);
		int bitMask=1<<pos;
		int newBit=bitMask|n;
		
		System.out.println(n+" value of bin num "+ bin+" pos is "+pos+" changed "+newBit);
		
 
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int pos=sc.nextInt();
		print(n,pos);
		
	}

}

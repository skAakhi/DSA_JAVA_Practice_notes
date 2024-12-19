package BitMasking;

import java.util.Scanner;

public class Update {

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
	
	
	public static void clear(int n,int pos)
	{
		int bin=DTB(n);
		int bitMask=1<<pos;
		int NotBitMask=~(bitMask);
		int NewBit=(NotBitMask&n);
		
		System.out.println(n+" value of bin num "+ bin+" pos is "+pos+" changed "+NewBit);
		
		
	}
	public static void set(int n,int pos)
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
		System.out.println("Choose your option if 1 set otherwise if 0 clear");
		int choice=sc.nextInt();
		if(choice==1)
		{
			set(n,pos);
		}
		else {
			clear(n,pos);
		}
		
	}
}

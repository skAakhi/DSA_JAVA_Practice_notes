package Recursions;

import java.util.Scanner;

public class Thirteen {
	
    //Printing in how many ways i can invite to party
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		System.out.println(PartyInvite(n));
		
	}
	
	public static int PartyInvite(int n)
	{
		//Base case
		if(n<=0)
		{
			return 1;
		}
		
		
		//Single Invite
		int SingleInvite=PartyInvite(n-1);
		
		//Party Invite
		int PairInvite=(n-1)*PartyInvite(n-2);
		
		return SingleInvite+PairInvite;
		
	}

}

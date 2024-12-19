package Recursions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fifteen {
    // Question to check N X N Queen 
	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		List<List<String>> Board=new ArrayList<>();
		
		char[][] ch=new char[n][n];
		
		helper(ch,Board,0);

	}
	
	
	public static void helper(char[][] ch,List<List<String>> Board,int col)
	{
		//Base case
		if(col==ch.length)
		{
			SaveBoard(ch,Board);
			return;
		}
		
		for(int i=0;i<ch.length;i++)
		{
			if(isSafe(i,col,ch))
			{
				ch[i][col]='Q';
				helper(ch,Board,col+1);
				ch[i][col]='.';
			}
		}
		
	}
	
	public static void SaveBoard(char[][] ch,List<List<String>> Board)
	{
		String row="";
		List<String> subBoard=new ArrayList<>();
		for(int i=0;i<ch.length;i++) {
			row="";
		for(int j=0;j<ch[0].length;j++)
		{
			if(ch[i][j]=='Q')
				row+='Q';
			else
				row+='.';
		}
		subBoard.add(row);
		}
		
		Board.add(subBoard);
		for (List<String> s : Board) {
			System.out.println(s);
		}
		//System.out.println(Board);
	}
    
	//TO check all sides safe
	public static boolean isSafe(int row,int col,char[][] ch)
	{
		//vertical
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i][col]=='Q')
				return false;
		}
		
		//Horizontal
		for(int j=0;j<ch[0].length;j++)
		{
			if(ch[row][j]=='Q')
				return false;
		}
		int r=row;
		//UpperLeft
		for(int c=col;c>=0 && r>=0;c--,r--)
		{
			if(ch[r][c]=='Q')
				return false;
		}
		
		//LowerLeft
		 r=row;
		 for(int c=col;r>ch.length && c<=0;r++,c-- ) {
			 if(ch[r][c]=='Q')
				 return false;
		 }
		 
		 
		 //UpperRight
		 r=row;
		 for(int c=col;r>=0 && c<ch.length;r--,c++ )
		 {
			 if(ch[r][c]=='Q')
				 return false;
		 }
		 
		 //LowerRight
		 r=row;
		 for(int c=col;r<ch.length && c<ch.length;r++,c++)
		 {
			 if(ch[r][c]=='Q')
				 return false;
		 }
		
		return true;
	}
	
	

}

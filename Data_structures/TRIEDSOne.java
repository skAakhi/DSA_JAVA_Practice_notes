package Data_structures;

public class TRIEDSOne {
	
	static class Node{
		Node[] child;
		boolean eow;
		
		public Node()
		{
			child=new Node[26];
			
			for(int i=0;i<26;i++)
			{
				child[i]=null;
			}
			eow=false;
			
		}
	}
	
	static Node root=new Node();
	
	public static void insert(String word)
	{   Node curr=root;
		for(int i=0;i<word.length();i++)
		{
			int idx=word.charAt(i)-'a';
			
			if(curr.child[idx]==null)
			{
				curr.child[idx]=new Node();
			}
			
//			if(i==word.length()-1)
//			{
//				curr.child[idx].eow=true;
//			}
			curr=curr.child[idx];
		}
		curr.eow=true;
	}
	
	public static boolean search(String word)
	{
		Node curr=root;
		for(int i=0;i<word.length();i++)
		{
			int idx=word.charAt(i)-'a';
			
			if(curr.child[idx]==null)
			{
				return false;
			}
			
//			if(i==word.length()-1 && curr.child[idx].eow==false)
//			{
//				return false;
//			}
			curr=curr.child[idx];
		}
		//return true;
		return curr.eow;//efficient way
		
	}
	
	
	//Word break problem 
	public static boolean wordBreak(String key)
	{
		if(key.length()==0)
		{
			return true;	
		}
		for(int i=1;i<=key.length();i++)
		{
			String first=key.substring(0,i);
			String second=key.substring(i);//i -- n
			
			if(search(first) && wordBreak(second))
			{
				return true;
			}
		}
		return false;
	}
	
	
	//Starts with problem[prefix]
	public static boolean prefixWord(String word)//prefix word
	{
		Node curr=root;
		for(int i=0;i<word.length();i++)
		{
			int idx=word.charAt(i)-'a';
			
			if(curr.child[idx]==null)
			{
				return false;
			}
			curr=curr.child[idx];
		}
		return true;
	}
	
	
	//Printing number of nodes for to count unique Sub_strings

	public static int countNodes(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		
		int count=0;
		for(int i=0;i<26;i++)
		{
			count+=countNodes(root.child[i]);
		}
		
		return count+1;
	}
	
	
	//Longest word with all prefixes
	public static String ans="";
	public static void longestWord(Node root,StringBuilder temp)
	{
		if(root==null)
		{
			return;
		}
		for(int i=0;i<26;i++) {
			
			if(root.child[i]!=null && root.child[i].eow==true)
			{
				temp.append((char)(i+'a'));
				if(temp.length()>ans.length())
				{
					ans=temp.toString();
				}
				
				longestWord(root.child[i],temp);
				
				temp.deleteCharAt(temp.length()-1);
			}
			
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		TRIEDSOne t= new TRIEDSOne();
		String words[]= {"there","the","a","their","any"};
			//{"a","banana","app","appl","ap","apply","apple"}; //{"there","the","a","their","any"};
		String key="theaany";
		String prefix="an";
		String str="ababa";
		Node curr=root;
		for(int i=0;i<words.length;i++)
		{
			insert(words[i]);
		}
//		
		//System.out.println(search("there"));
		
		//System.out.println(wordBreak(key));
		
		//System.out.println(prefixWord(prefix));
//		
//		for(int i=0;i<str.length();i++)
//		{
//			String suffix=str.substring(i);
//			//System.out.println(suffix);
//			insert(suffix);
//			
//		}
//
//		System.out.println(countNodes(root));
		
//		longestWord(curr,new StringBuilder(""));
//		System.out.println(ans);
		
		

	}

}

package Java.basics;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		Palindrome pr= new Palindrome();
		pr.StringPalindrome();
		
	}

	private void StringPalindrome() {
		// TODO Auto-generated method stub
		String Str = null ;
		String Rev="";
		int i ;
	Scanner in = new Scanner(System.in);
	System.out.print(" Enter The String : ");
	Str=in.nextLine();
		try
		{
			
			for(i=Str.length()-1;i>=0;i--)
			{
				Rev+=Str.charAt(i);
			}
			
		 
			
			Str=Str.toLowerCase();
			Rev=Rev.toLowerCase();
			System.out.println("\n\n\n Given String      : "+Str);

			System.out.println("\n\n\n Reversed String   : " +Rev);

			if(Str.equals(Rev))
			{
				System.out.println("\n\n\n Given String Is Palindrome");
			}
			else
			{
				System.out.println("\n\n\n Given String Is not Palindrome");
			}
		}
		
		catch(Exception e)
		{
			System.out.println(" Might be issue With An String Size");
		}
		
		
	}
	
	
	
	

}

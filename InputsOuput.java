package Java.basics;

import java.util.*;
public class InputsOuput {
	
	String name ;
	byte age ;
	char gender ;
	int mark ;
	float percentage;
	double height ;
	
	Scanner sc = new Scanner(System.in);
	public void getInput()
	{
		
		
		System.out.print(" Enter Your Name        : " );
		name=sc.next();
		System.out.print(" Enter Your Age         : ");
		age=sc.nextByte(); 
		System.out.print(" Enter your Gender(M/F) : ");
		gender=sc.next().charAt(0);
		System.out.print(" Enter Your Marks       : ");
	    mark=sc.nextInt();
	    System.out.print(" Enter Percentage       : ");
	    percentage=sc.nextFloat();
	    System.out.print(" Enter Your Height      : ");
	    height=sc.nextDouble();
		 System.out.println( );
		 
		 System.out.println( );
		 
		 
				
	}
	
	
	public void DisplayOutput()
	{
		//System.out.flush();
		 
		 System.out.println( );
		 System.out.println( );
		 
		 
		if(gender=='M'||gender=='m')
		{
		System.out.println(" Hi MR "+name+" Welcome " );
		}
		else
		{
			System.out.println(" Hi Mrs "+name+" Welcome! " );
		}
		 System.out.println( );
		 System.out.println( );
		 
		
		System.out.println(" Name        : "+name );
	 
		System.out.println(" Age         : "+age);
		 
		System.out.println(" Gender      : "+gender);
	 
		System.out.println(" Total Marks : "+mark);
 
	    System.out.println(" Percentage  : "+percentage);
 
	    System.out.println(" Height      : "+height);
 
		
	}
	
	public static void main(String [] args)
	{
		InputsOuput io= new InputsOuput();
		io.getInput();
		io.DisplayOutput();
	}
	

}

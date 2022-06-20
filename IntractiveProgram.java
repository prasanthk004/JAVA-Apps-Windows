package Java.basics;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class IntractiveProgram {

	
	private static final Object score = null;

	public static void main(String[] args) {
		IntractiveProgram in = new IntractiveProgram();
		try {
			in.play();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void play() throws InterruptedException
	{
		
		String name ; 
		int sec , digits ;
		int num ;
		int dnumber ;
		int range; 
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		char option = 0 ;
		int attempts=0,score=0,fail=0; 
		
		
		System.out.printf("\n Enter the Name : ");
		name=sc.nextLine();		 
		System.out.printf("\n Enter the Digits : ");
		digits=sc.nextInt();		 
		System.out.printf("\n Enter the Seconds : ");
		sec=sc.nextInt();
		sc.nextLine();
		
		range=FindDigits(digits); // calling FindDigits  function  to set the range to generate random number (if digits count 5 function will return 10000)
		
		
		
		do {
		
		attempts++; // Counting Number of attempts
		 num=r.nextInt(range/10, range-1); // Generating Random numbers with starting range and ending range(if digit count 5 starting range 10000 to 99999) 
		
		
		System.out.printf("\n I will be shown %d for %d seconds, then I will be prompted for to enter the number ",num,sec);
		Thread.sleep(sec*1000);  // Possible to throw InterruptedException hence function declared with InterruptedException
		clears(); // Calling Function to clear the screen
		
		System.out.printf("\n\n Please enter displayed Number here : ");
		dnumber=sc.nextInt();
		
		if(dnumber==num)
		{
			score++;
		}
		else
		{
			fail++;
		}
		System.out.printf("\n Do You Want to Continue ? (Y/N) : ");
		option=sc.next().charAt(0);
		}while(option=='Y'||option=='y');
		
		clears();
		
		System.out.printf("\n Player Name    : %s",name);
		System.out.printf("\n No of Attempts : %d",attempts);
		System.out.printf("\n Total Scores   : %d",score);
		System.out.printf("\n       Failes   : %d",fail);
		

 
		
	}
	
	private int FindDigits(int n)
	{
		
		int num = 1 ;
		while(n>0)
		{
			num*=10 ;
			n--;
		}
		
		//System.out.println(num);
		return num;
		
	}
	
	 public static void clears() //function to clear terminal
	 {
		 
		 
		        try {
		         
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 
	 }
	 
}

package Java.basics;

import java.util.Random;
import java.util.Scanner;

public class MaxMin {
	
	int a[] ;
	Scanner sc = new Scanner(System.in);
 

	public static void main(String[] args) {
		
		
		MaxMin mx = new MaxMin();
		mx.getInputArray();

		//mx.FindMax();
		mx.FindSecMax();
	}


	private void getInputArray() {
		// TODO Auto-generated method stub
	  int n ; 
	  Random R = new Random();
	  System.out.printf(" Enter the Length Of Array  : ");
	  n=sc.nextInt();
	  a  = new int [n];
	  
		System.out.println();
		System.out.println();

	  
	  for(int i=0 ; i<a.length;i++)
	  {
		  a[i]=R.nextInt(0, 100);
		  System.out.printf("%3d ",a[i]);
	  }
	System.out.println();
	System.out.println();
	System.out.println();

	System.out.println();

	}


	private void FindMax() {
		// TODO Auto-generated method stub
		
		int i=0 ; 
		
		int max=0; 
		
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				
			}
		}
		
		System.out.println(" Maximum Number :  "+max);
		
	}
	
	

	private void FindSecMax() {
		// TODO Auto-generated method stub
	
		
		int i , max , smax ;
		
		max=0;
		smax=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				smax=max;
				max=a[i];
				
			}
			else if(a[i]>smax&&a[i]!=max)
			{
				smax=a[i];
			}
			
			
		}
		
		System.out.println(" MAX  "+max);
		System.out.println(" SMAX "+smax);
		
		
	}
	
	
}

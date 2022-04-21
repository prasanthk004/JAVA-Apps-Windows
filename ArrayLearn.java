package Java.basics;

import java.util.Scanner;

public class ArrayLearn { 
	
	
	 String[] n= {"KP","MK","AS","EL","MB"};
	 int a[]= {98,98,55,66,45,5,5,10,10};
	public static void main(String[] args) {
		ArrayLearn a = new ArrayLearn();
		//a.SwapValues();
		//a.SwapRight();
		a.FindMax();
		System.out.println();
		a.FindMin();
	}
	
	
	
	
	private void FindMin() {
		// TODO Auto-generated method stub
		int min=2147483647,smin=2147483647 ;
		int i ;
		
		for(i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				smin=min;
				min=a[i];
				
								
			}	
			else if (a[i]<smin&&a[i]!=min)
			{
				smin=a[i];
			}
			
		

			
		}
		
		System.out.println(" Minimum  : "+min);
		System.out.println(" Sminimum : "+smin);		
		
		
		
	}


	private void FindMax() {
		// TODO Auto-generated method stub
		int max=-2147483648 , smax=-2147483648; // Initiliazing with least value of integer to find maximum 
		int i ;
		//int a[]= {98,95,55,66,45};

		for(i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				
				max=a[i];
				
			}
			else if(a[i]>smax&&max!=a[i])
			{
				smax=a[i];
			}
			
			
		}
		System.out.println("        Maximum    : "+max);
		System.out.println(" Second Maximum    : "+smax);

		

		
	}

 public void InputAndDisplay()
 {
	 int[] a= new int [10] ;
	 
	 int i =0 ; 
	 Scanner in = new Scanner(System.in);
	 
	 // Getting inputs from Users 
	 for(i=0 ; i<a.length;i++)
	 {
		 System.out.printf(" Enter Value %d : ",i+1);
		 a[i]=in.nextInt();
	 }
	 
	 // Displaying Array values 
	 
	 for(i=0 ; i<a.length;i++)
	 {
		 System.out.printf("  Value %d : %d",i+1,a[i]);
	 
	 }

 }





	private void SwapRight() {
		// TODO Auto-generated method stub
		
		int i ;
		String tmp;
		
		tmp=n[4];
		
		System.out.println("Right Swap before ");
		System.out.println();
		for(i=0;i<n.length;i++)
		{
			System.out.println(n[i]);
		}
		System.out.println();
		System.out.println("Right Swap after ");
		System.out.println();
		for(i=n.length-1;i>0;i--)
		{
			 n[i]=n[i-1];
			 
		}
		n[i]=tmp;
		 
		System.out.println();
		for(i=0;i<n.length;i++)
		{
			System.out.println(n[i]);
		}
		
	}

	private void SwapValues() {
		// TODO Auto-generated method stub
		
		int i=0 ;
		
	
	
	 String tmp=n[0];
	 System.out.printf("\n\nValues Before Swap\n");
	 
	for(i=0;i<5;i++)
	{
		System.out.println(n[i]);
		
	}
	
	for(i=0;i<5;i++)
	{
		if(i!=4)
		{
		n[i]=n[i+1];
		}
		else
		{
			n[i]=tmp;
		}
	}
	 
	
	System.out.println("\n\nValues after Swap");
	
	for(i=0;i<5;i++)
	{
		System.out.println(n[i]);
		
	}
	 
	}
	
	
	

}

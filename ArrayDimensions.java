package Java.basics;

import java.util.Random;   


public class ArrayDimensions {
	
	public static void main(String[] args) {
		
		ArrayDimensions a = new ArrayDimensions();
	//	a.TwoDArray();
	//	a.AddMatrix();
	//	a.MatrixMul();
	System.out.println(a.getClass());
	System.out.println(a.hashCode());
	System.out.println(a.getClass());
	System.out.println(System.identityHashCode(a));
	

	}
	
	public int hashCode()
	{
		return 0;
		
	}
	

	
	private void MatrixMul() {
		// TODO Auto-generated method stub
		
		int a[][]=new int [2][2];
		int b[][]=new int[2][15];
		int D[][]=new int[2][15];
		
		
	}



	private void TwoDArray() {
		// TODO Auto-generated method stub
		
		int a[][]=new int[250][5];
		Random r = new Random();   

		
		int i , j,tot=0 ;
		
		String[] sub= {"Tamil","English","Maths","Science","S.Science"};
		
	/*	System.out.println(" a len : " +a.length);
		System.out.println(" a[i] len :"+a[0].length);
		System.out.println(" a len : " +a);
		System.out.println(" a[i] len :"+a[0]);*/
		
		
		for(i=0;i<a.length;i++)
		{
			System.out.printf("\n\n Marks of Student No  : %d \n",i+1);
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=r.nextInt(99)+1;
				System.out.printf("\n %-10s      :  %3d ",sub[j],a[i][j]);
				tot+=a[i][j];
			}
			  System.out.printf("\n----------------------------------");
			   System.out.printf("\n %-10s      :  %3d ","Total",tot);
			   tot=0;
		}		
		
		
	}
	
	
	
	private void AddMatrix() {
		// TODO Auto-generated method stub
		int a[][]=new int [3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		
		int i , j ;
		
		Random r=new Random();
		
	// Getting Inputs for Array A Using Random Numbers 
		System.out.printf("\n\n");
		System.out.println(" Matrix A   : ");
		System.out.printf("\n\n");
		
		for(i=0;i<a.length;i++)
			
		{
			 
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=r.nextInt(9)+1;
				System.out.printf(" %3d ",a[i][j]);
			}
			System.out.println();
		
		}
		
		
		// Getting Inputs for Array B Using Random Numbers 
		System.out.printf("\n\n");
		System.out.println(" Matrix B   : ");
		System.out.printf("\n\n");
			
			for(i=0;i<b.length;i++)
			{
				for(j=0;j<b[i].length;j++)
				{
					b[i][j]=r.nextInt(9)+1;
					System.out.printf("%3d",b[i][j]);
				}
				System.out.println();

			}
			
			
		// Adding Matrix A & B 
			
			System.out.printf("\n\n");
			
			System.out.println(" Matrix C   : ");
			System.out.printf("\n\n");
			for(i=0;i<b.length;i++)
			{
				for(j=0;j<b[i].length;j++)
				{
					c[i][j]=a[i][j]+b[i][j];
					System.out.printf("%3d",c[i][j]);
				}
				System.out.println();

			}
			
		
		
	}



}

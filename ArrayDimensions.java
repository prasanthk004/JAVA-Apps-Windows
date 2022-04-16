package Java.basics;

import java.util.Random;   


public class ArrayDimensions {
	
	public static void main(String[] args) {
		
		ArrayDimensions a = new ArrayDimensions();
		a.TwoDArray();
	}
	

	private void TwoDArray() {
		// TODO Auto-generated method stub
		
		int a[][]=new int[2][2];
		Random r = new Random();   

		
		int i , j ;
		
	/*	System.out.println(" a len : " +a.length);
		System.out.println(" a[i] len :"+a[0].length);
		System.out.println(" a len : " +a);
		System.out.println(" a[i] len :"+a[0]);*/
		
		
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=r.nextInt(9)+1;
				System.out.printf(" %3d ",a[i][j]);
			}
			System.out.println();
			
		}
		
		
		
	}

}

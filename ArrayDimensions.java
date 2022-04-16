package Java.basics;

import java.util.Random;   


public class ArrayDimensions {
	
	public static void main(String[] args) {
		
		ArrayDimensions a = new ArrayDimensions();
		a.TwoDArray();
	}
	

	private void TwoDArray() {
		// TODO Auto-generated method stub
		
		int a[][]=new int[2][5];
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

}

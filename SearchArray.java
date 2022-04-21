package Java.basics;

import java.util.Scanner;

public class SearchArray {
	
	String dd;
	public static void main(String[] args) {
		SearchArray ar = new SearchArray();
	//	ar.LinearSearch();
		//ar.SortArrayAscend();
		//ar.SortArrayDescend();	
	 //int ap[]= {17,4,5,19,25,44,98};
		ar.BinarySearch();
	//ar.SortArrayAscend(ap)
  
		
	}

	private void SortArrayAscend(int [] x) {
		// TODO Auto-generated method stub
	 
		int i,j,tmp; 
		
	 
		
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x.length-1;j++)
			{
				if(x[j]>x[j+1])
				{
					tmp=x[j+1];
					x[j+1]=x[j];
					x[j]=tmp;
				}
			}
		}
		
		System.out.println();
		
		 
		
	}

	private void BinarySearch() {
		// TODO Auto-generated method stub
		
		int a[]= {14,12,28,94,55};
		
		int mid , min , max,n,i=1;
		int found=0;
		
		 SortArrayAscend(a);
		Scanner in = new Scanner(System.in);
		System.out.printf("\n Enter the number to find : ");
		n=in.nextInt();
		
		
		
		min =0 ;
		max=a.length-1 ;
		mid=min+max/2;
		
		while(min<=max)
		{
			if(n==a[mid])
			{
			    System.out.printf("\n %d is found at position %d ",n,mid);
			 
			    found =1 ;
			    break;
			    
			}
			else if(n>a[mid])
			{
				min=mid+1 ;
				mid=(min+max)/2; 
		 
			}
			else if (n<a[mid])
			{
				max=mid-1 ;
				mid=min+max/2;
 			}
			
 		}
		
		System.out.println();
		
		if(found==0)
		{
			System.out.println(" Unable to find the number "+n);
		}
		
	}
	
	
	

	private void SortArrayDescend() {
		// TODO Auto-generated method stub
		
		int a[]= {20,5,10,25,8};
		int i , j ,tmp ;
		
		System.out.println(" Values Before Swap \n");
		for(i=0;i<a.length;i++)
		{
			System.out.printf(" %3d ",a[i]);
		}
		System.out.println();
		
		
		for(i=0 ; i<a.length;i++)
		{
			for(j=0;j<a.length-1;j++)
			{
				if(a[j]<a[j+1])
				{
					tmp=a[j+1];
					a[j+1]=a[j];
					a[j]=tmp;
				}
			}
		}
		

		System.out.println(" Values After  Swap ");
		
		for(i=0;i<a.length;i++)
		{
			System.out.printf(" %3d ",a[i]);
		}
		
		
	}

	private void SortArrayAscend() {
		// TODO Auto-generated method stub
		
		int a[]= {1,6,3,2,1};
		
		int i , j,tmp ;
		
		System.out.println(" Values Before Swap \n");
		for(i=0;i<a.length;i++)
		{
			System.out.printf(" %3d ",a[i]);
		}
		System.out.println();
		
		 
	   for(i=0;i<a.length;i++)
	   {
		   for(j=0;j<a.length-1;j++)
		   {
			   if(a[j]>a[j+1])
			   {
				   tmp=a[j+1];
				   a[j+1]=a[j];
				   a[j]=tmp;
			   }
		   }
	   }
	 
		
		
		System.out.println(" Values After  Swap ");
		
		for(i=0;i<a.length;i++)
		{
			System.out.printf(" %3d ",a[i]);
		}
		
		
	}

	private void LinearSearch() {
		// TODO Auto-generated method stub
		int a[]= {10,20,33,44,54};
		int n ,i ;
		int found=0;
		Scanner sc = new Scanner(System.in);
		System.out.printf("\n Enter the number to find : ");
	    n=sc.nextInt();
	    
	    for(i=0 ; i<a.length;i++)
	    {
	    	if(a[i]==n)
	    	{
	    		System.out.printf(" %d is found at positon %d ",n,i);
	    		found=1;
	    	}
	    	
	    }
	    
	    if(found==0)
	    {
	    	System.out.printf(" Unable to find the number %d in given Array",n);
	    	
	    
	    }
		
	}
	
	

}

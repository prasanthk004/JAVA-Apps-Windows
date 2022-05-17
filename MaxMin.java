package Java.basics;

public class MaxMin {
	
	int a[]= {35,18,36,36,30};
 

	public static void main(String[] args) {
		
		
		MaxMin mx = new MaxMin();
		
		//mx.FindMax();
		mx.FindSecMax();
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

package Java.basics;

public class DigitOperations {
	
	 int num ;	
	 int n  ;
	

	public DigitOperations(int num) {
		super();
		this.num = num;
	}
	
	
	public void NumOfDigits()
	{
	  n=num ;
	   int dg=0;
	   while(n>0)
	   {
		   n/=10;
		   dg++;
		   
	   }
	   System.out.println(" No of Digits  : "+dg );
	}
	
	public void SumofDigits()
	{
	  n=num ;
	  int sum=0 ; 
	  int rem ;
	  while(n>0)
	  {
		  //System.out.println(n);
		  rem=n%10 ;
		  n/=10;
		  
		  sum+=rem ;
		  
	  }
	  
	  System.out.println(" Sum of Digist : "+sum);
	  
	  
		
	}
	
	public void DisplayDigits()
	{
		n=num ;
		
		while(n>0)
		{
			System.out.println(" "+n%1000);
			n/=1000;
		}
		
	}
	
	public static void main(String[] args)
	{
		DigitOperations x = new DigitOperations(1234568);
		x.NumOfDigits();
		x.SumofDigits();
		System.out.printf("\n\n\n\n");
		x.DisplayDigits();
	}

}

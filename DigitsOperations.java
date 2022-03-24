package Java.basics;

public class DigitsOperations {
	
	int num ;

	public DigitsOperations(int num) {
		super();
		this.num = num;
	}
	
	public static void main(String[] args) {
		DigitsOperations d = new DigitsOperations(9999);
		// d.findDigitsCount();
		// d.AdditionOfDigits();
		 System.out.printf("\n\n\n\n");
		 d.AddDigitsUsingle(95);
		 
	}
	
	
	 
	public void AddDigitsUsingle(int x) //Using recursive function until single digit
	{
		 int n ;
		  n=x;
		  int res=0,rem;
		  int dgc=0;
		  
		  while(n>0)
		  {
			  rem=n%10;
			  res+=rem;
			  n/=10;
			  dgc++;
		  }
		  
		 // System.out.println(" Digits "+dgc);
		  
		  if(dgc>1)
		  {
			  
			  //System.out.println(res); 
			  AddDigitsUsingle(res);
			
			
		  }
		  else
		  {
			 System.out.println(res); 
		  }
		  
	/*	 if(dgc==1)
		 {
			 System.out.println(res);
			 
			 
		 }
		 else
		 {
			 AddDigitsUsingle(res);
			 System.out.println(res);
		 }
 */
	 
		
	}

public int  AdditionOfDigits() {
		// TODO Auto-generated method stub
		int n=num ; 
		int rem,res=0;
		n=num;
		while(n>0)
		{
			rem=n%10;
			res+=rem;
			n/=10;
			
		}
		System.out.println(" Addition Value : "+res);
		return res;
	}

	public int  findDigitsCount() {
		// TODO Auto-generated method stub
		int n ;
		n=num ;
		int count=0;
		
		while(n>0)
		{
			n/=10;
			count++;
		  
		}
		System.out.printf(" Digits count of %d is %d \n ",num,count);
		return count;
	}
	

}

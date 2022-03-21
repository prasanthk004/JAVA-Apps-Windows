package Java.basics;

public class NumberOperations {
	
int number ;

public NumberOperations(int number) {
	super();
	this.number = number;
}
  
  
  public int  findFactorial(int num )
  {
	  int n=num ;
	  int fact=1;
	  
	  while(n>0)
	  {
		  fact*=n ;
		  n--;
	  }
	  
	  return fact;
	  
  }
  
  //A neon number is a number where the sum of digits of square of the number is equal to the number.
	 
  


public void neonNumber() //if n is equals to  n*n = value  sum of value digits (9*9 = 81 8+1=9)  
  {
	int n=number;	  
	int sqrt=n*n ;
	int  dg = sqrt ;
	int sum=0;
	
	System.out.println(" Sqrt "+sqrt);
	while(dg>0)
	{
		sum+=dg%10;
		dg/=10;
	}
	
	System.out.println(" Sum "+sum);
	
	 if (n==sum)
	 {
		 System.out.println(" Given Number is Neon Number");
	 }
	 else
	 {
		 System.out.println(" Given Number is not an  Neon Number");
	 }
	
	  
  }

//Strong number is a number whose sum of all digits' factorial is equal to the number 'n'.
/*Input: n = 145
Output: Yes it is a strong number
Explanation: 1! + 4! + 5! = 145*/
public void StrongNumber()
{
	int sum=0 ;
	
	int n=number ;
	
	while(n>0)
	{
		sum+=findFactorial(n%10);
		System.out.printf("\n Fact of %d is %d : Sum is %d",n%10,findFactorial(n%10),sum);
		n/=10;
		
	}
	
	if(number==sum)
	{
		System.out.println(" Given Number is StrongNumber");
		
	}
	else
	{
		System.out.println(" Given number is not a Strong Number");
	}
}



//Sum of divisiors is equal to number is called perfect number (6);
//Sum of divisiors is greater than number is called abudant number(12);
//Sum of divisiors is Lesser  than number is called deficiant number(12);

public void perfectNumber()
{
	int n = number;
	
	int div=1 ;
	int sum=0;
	
	while(div<n)
	{
		if(n%div==0)
		{
			System.out.printf("\n %d",div);
			sum+=div;
			
		}
		div++;
		
	}
	
	System.out.println("\n Sum of Divisiors : "+sum);
	
	if (number==sum)
	{
		System.out.println(" Given Number is Perfect number");
	}
	else if (number<=sum)
	{
		System.out.println(" Given Number is abdudant number");
	}
	else
	{
		System.out.println(" Given Number is deficiant  number");
	}
}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberOperations n = new NumberOperations(10);
		//System.out.println(n.findFactorial(4));
		//n.neonNumber();
		//n.StrongNumber()
		n.perfectNumber();

	}

}

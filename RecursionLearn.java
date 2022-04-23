package Java.basics;

public class RecursionLearn {
	
	int val ;
	
	public RecursionLearn(int val) {
		super();
		this.val = val;
	}

	public static void main(String[] args) {
		RecursionLearn r = new RecursionLearn(1254);
	  r.RecusriveTest(10);
	  r.RecusriveTest1(1);
		
	 //Finding Factorial using Recursive Function 
	 System.out.println(r.FactorialRecursive(5));	
	  
	//  Unity Number is sum of digits  given number equals to 1 called unity number 
	  r.Unity(r.val); // FInd Unity Without using recursive method
	 if( r.UnityRecursive(r.val)==1)
	 {
		 System.out.println(" Given Number is unity Number");
	 }
	 else
	 {
		 System.out.println(" Given Number is not a unity Number");
	 }
	}

	private int UnityRecursive(int n) {
		// TODO Auto-generated method stub
		int sum=0 ; 
		
		while(n>0)
		{
			sum+=n%10;
			n/=10;
		}
		System.out.println(sum);
		
		if(sum>9)
		   return UnityRecursive(sum);
		else
			return sum;
		 
	 
	}

	private void Unity(int n) {
		// TODO Auto-generated method stub
		int sum=0 ;
		int num =n  ;
		
		while(n>9)
		{
			
			while(num>0)
			{
				System.out.println(num%10);
				sum+=num%10;
				num/=10;
			}
			System.out.println("SUM : "+sum);
			
			n=sum;
			num=sum;
			sum=0;
		}
	 
	 
	 
	 
	}

	private int FactorialRecursive(int n) {
		// TODO Auto-generated method stub
		if(n==1)
			
			return 1;
		else
			System.out.println(n);
			return n*FactorialRecursive(n-1);
		
	}

	private void RecusriveTest1(int n) {
		// TODO Auto-generated method stub
		System.out.println(n);
		if(n<5)
			RecusriveTest1(++n);
		 
	}

	private void RecusriveTest(int n) {
		// TODO Auto-generated method stub
	 
	System.out.println(n);
	if(n>1)
		
		RecusriveTest(n-1);
	}
	
	

}

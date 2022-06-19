package Java.basics;

public class ArrayExcersise {
	
	int a[]= {1,2,3,4
			};
	
	public static void main(String[] args) {
		ArrayExcersise ar= new ArrayExcersise();
		ar.PrintArrayMaxMin();
	}

	private void PrintArrayMaxMin() throws ArithmeticException {
		// TODO Auto-generated method stub
		int i;
		
		int ax = 55,b ;
		try
		{
			b=ax/0;
			
		}
		catch ( Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		for(i=0;i<a.length/2;i++)
		{
			System.out.printf("%3d %3d",a[i],a[a.length-i-1]);
		}
	}
 // Test 
}

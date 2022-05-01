package Java.basics;

 
import java.util.*;

public class ExceptionLearn {
	
	public static void main(String[] args) {
		
	 ExceptionLearn ex=new ExceptionLearn();
			 
	//	ex.ArithmeticException();
	 
 
	 
	/*	try {
			ex.InputMismatchException();
		} catch (Exception e) {
			// TODO Auto-generated catch 
			e.getStackTrace();
         System.out.println("Wrong inputs");
 		}*/
 		 
		 
 	 //ex.NullPointerException();
 	 ex.ArrayException();
	   	 
	}

	
private void ArrayException(){
		// TODO Auto-generated method stub
		int a[ ] =  null;
		int n = 0 ;
		try {
		
			Scanner in=new Scanner(System.in);
			System.out.println(" Enter a Number : ");
			n=in.nextInt();
			if(n>10)
			throw new Exception("Array SIZE Invalid");
			
			a=new int[n];
			System.out.println(" Array  Allocated in memory");
		
			n+=1;
		    System.out.println(a[n]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		catch(java.lang.NegativeArraySizeException e)
		{
			 e.getStackTrace();
		}
		
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(" Array Not allocated Might be ArraySize High");
		 
		}
		
		
	
		
		 
	}


private void NullPointerException(){
		// TODO Auto-generated method stub
	ExceptionLearn ex = null;
	
	try {
		ex.ArithmeticException();
	} catch (Exception e) {
		// TODO Auto-generated catch block
	 System.out.println(e.getMessage());
	}
	
	 
	}


//	throws java.util.InputMismatchException
 	private void InputMismatchException() {
		// TODO Auto-generated method stub
		Scanner in = null;
		try {
			int a , b ;
			  System.out.printf("\n Enter number A : ");
			   in = new Scanner(System.in);
				a=in.nextInt();
			   System.out.printf("\n Enter number B : ");
			   b=in.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(" Catch Executed");
			
			 throw new InputMismatchException();
			// System.out.println(" Catch Executed");

		}
		finally
		{
			in.close();
			System.out.println(" Finally Executed");
		}
		 
		   
		   
		
	}

 
	private void ArithmeticException() {
		
		
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		   int a,b ,c;	
		   
		   try {
			   
			   System.out.printf("\n Enter number A : ");
			   a=in.nextInt();
			   System.out.printf("\n Enter number B : ");
			   b=in.nextInt();
			   c=a/b;
			   System.out.println(c);
			   
		   }
		   catch(Exception e)
		  {
			  System.out.println(e.getMessage()); 
		  }
	      
	    
	    System.out.println(" Executed Successfully ");
	    
		
	}
	
	
	

}

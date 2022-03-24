package Java.basics;
import java.util.*;
public class FactorialAutomation {
	
	int num ;
	
	
	 public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public void findFactorial()
	 {
		 long fact =1 ;
		 
		 int i ; 
		  
		 
		 for(i=1;i<=num;i++)
		 {
			 fact*=i;
			  
		 }
		 System.out.printf("\n\n\n\n Factorial value of %d is %d",num,fact);
	 }
	public void findFact()
	 {
		 long fact =1 ;
		 
		 int i ; 
		 System.out.println("\n Number    Factorial");
		 
		 for(i=1;i<=num;i++)
		 {
			 fact*=i;
			 System.out.printf("\n %3d!       %d ",i,fact);
		 }
	 }
	public static void main(String[] args) {
		FactorialAutomation f = new FactorialAutomation();
		int n;
		Scanner in=new Scanner(System.in);
		System.out.printf(" Enter the Number : ");
		n=in.nextInt();
		f.setNum(n);
		f.findFact();
		f.findFactorial();
		
	}

}

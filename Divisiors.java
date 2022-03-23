package Java.basics;

public class Divisiors {
	
	
	int num ;

	public Divisiors() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Divisiors(int num) {
		super();
		this.num = num;
	}
	
	
	public void FindPossibleDivisiors()
	{
		int n=1 ;
		
		System.out.println(" Possible Divisiors of Given  Number "+num);
		while(n<num)
		{
			if(num%n==0)
			{
				System.out.println();
				System.out.println(" "+n);
			}
			n++;
		}
	}
	
	public void CommonDivisiorsofGivenNum(int a , int b )
	{
		
		int n=1;
		
		System.out.printf (" Possible Divisiors of Given  Numbers %d and %d is \n",a,b);
		
		while(n<=a&&n<=b)
		{
			
			if(a%n==0&&b%n==0)
			{
				System.out.println(" "+n);
			}
			
			n++;
		}
		
		
	}
	
	public void GCD(int a , int b )
	{
		
		int n=1;
		int cd,gcd=0 ;
		
	
		
		while(n<=a&&n<=b)
		{
			
			if(a%n==0&&b%n==0)
			{
				cd=n ;
				
				if(gcd<cd)
				{
					gcd=cd;
				}
			}
			
			n++;
		}
		System.out.printf (" Greatest common divisior of Given  Numbers %d and %d is %d \n",a,b,gcd);
		
	}
	
	
	private void modulo()
	{
		System.out.println(8%6);
		
	}
	
  public static void main(String[] args) {
	  
	  Divisiors d = new Divisiors(126) ;
	//d.FindPossibleDivisiors();
	 // d.modulo();
	  d.CommonDivisiorsofGivenNum(12,86);
	  d.GCD(12, 86);
}
	

}

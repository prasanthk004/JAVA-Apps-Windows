package Java.basics;

public class pattern {
	
	public static void main(String[] args) {
		pattern p = new pattern();
		//p.numPattern();
		p.numPattern1();
	}

	private void numPattern1() {
		// TODO Auto-generated method stub
		
	 int row , col ;
	 int n=5;
	 
	 for(row=1;row<=n;row++)
	 {
		 for(col=0;col<row;col++)
		 {
			 System.out.print(n-row-col+1+" ");
		 }
		 System.out.println();
	 }
	
	}
       // Patterns
	private void numPattern() {
		// TODO Auto-generated method stub
		
		int row , col ; 
		int n;
		
		n=5;
		for(row=1;row<=n;row++)
		{
			
			 for(col=1;col<=row;col++)
			 {
				 
				 System.out.print(n+n-row-col+1+" ");
			 }
			 
			 System.out.println();
		}
		
	}
	

	


}

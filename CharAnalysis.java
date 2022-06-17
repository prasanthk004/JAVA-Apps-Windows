package Java.basics;

public class CharAnalysis {

	 public static void main(String[] args) {
		
		 CharAnalysis ch = new CharAnalysis();
		 
		 ch.Analysis();
		 ch.Resiprocal();
	}

	private void Resiprocal() {
		// TODO Auto-generated method stub
		
	 
		
		
	}

	private void Analysis() {
		// TODO Auto-generated method stub
		
		String s="xyz";
		String rs ;
		char c[];
		int i ;
		c=s.toCharArray();
		
		int cnt =0 ;
		
		System.out.printf("\n\n x = %c y = %c z=%c ",c[0],c[1],c[2]);
		
		
		for(i=0;i<s.length();i++)
		{
		   c[i]+=2;
		   
		   if(c[i]>'z')
		   {
			   c[i]-=26;
			   
		   }
		}
		
		 
		System.out.printf("\n\n x = %c y = %c z=%c  ",c[0],c[1],c[2]);
		
		
	}
	 
	 
}

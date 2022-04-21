package Java.basics;

public class StringFrequency extends StringOperations

{
	
	String s ; 
	
	public static void main(String[] args) {
		
		StringFrequency x= new StringFrequency();
		
		x.FindFrequency();
	 
		
		
	}

	private void FindFrequency() {
		// TODO Auto-generated method stub
		int i,j ; 
		s="Prasanth PK";
		int count=0;
		int frq[]=new int[s.length()];
		
		for(i=0;i<s.length();i++)
		{
			count=1;
			for(j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				
					frq[j]=-5;
				}
					
			}
			if(frq[i]!=-5)
			{
				frq[i]=count;

			}
		
			
			//System.out.println(s.charAt(i)+" Occures "+count+" times ");
			 
		}
		
		System.out.println(" Given String :\n\n "+s);
		
		System.out.println("--------------------------");
		for(i=0;i<s.length();i++)
		{
			if(frq[i]>0)
			
			System.out.printf("\n %c occures %d times ",s.charAt(i),frq[i]);
			
		}
		System.out.println();
		System.out.println();
		
		System.out.println(" More than 1 time occurance ");	
		
		for(i=0;i<s.length();i++)
		{
			if(frq[i]>1)
				System.out.printf(" %c",s.charAt(i));			 
			
		}
			
	
	}
	

}

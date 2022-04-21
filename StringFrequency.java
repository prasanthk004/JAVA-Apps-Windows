package Java.basics;

import java.util.Scanner;

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
	 
		s=" ";
		int count=0;
	
		Scanner sc=new Scanner(System.in);
		
		
		System.out.printf("\n Enter the String : ");
		s=sc.nextLine();
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
		
		System.out.printf(" More than 1 time occurance ");	
		
		for(i=0;i<s.length();i++)
		{
			if(frq[i]>1)
				System.out.printf(" %c",s.charAt(i));	
			
			
		}
		
		//Finding most frequent characters 
	 
		
		int max=0;
		int pos=0;
		int smax=0;
		int pos1=0;
		
		for(i=0;i<s.length();i++)
		{
			if(frq[i]>max)
			{
				smax=max;
				max=frq[i];
				
				pos=i;
			}
			else if(frq[i]>smax&&frq[i]!=max)
			{
				smax=frq[i];
				pos=i;
			}
			
		}
		System.out.printf("\n max %d smax %d",max,smax);
		System.out.printf("\n\n\n\n");
		System.out.println(" Most frqeunt character is "+s.charAt(pos)+"\n Total Occurance : "+max);
		System.out.println(" Second most frqeunt character is "+s.charAt(pos1)+"\n Total Occurance : "+smax);
	
	}
	

}

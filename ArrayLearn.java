package Java.basics;

public class ArrayLearn { 
	
	
	 String[] n= {"KP","MK","AS","EL","MB"};
	public static void main(String[] args) {
		ArrayLearn a = new ArrayLearn();
		//a.SwapValues();
		//a.SwapRight();
		a.FindMax();
	}

	private void FindMax() {
		// TODO Auto-generated method stub
		int[] marks= {90,92,88,65,55};
		
		int max=marks[0],  smax=marks[0],min=marks[0],smin=marks[0];
		int i ;
		for(i=0;i<marks.length;i++)
		{
			if(marks[i]>max)
			{
				smax=max;
				max=marks[i];
			}
			if(marks[i]<min)
			{
				smin=min;
				min=marks[i];
				
			}
		}
		
		System.out.println("First Maximum Mark   : "+max);
		System.out.println("Second Maximum Mark  : "+smax);
		System.out.println("Minimum Mark         : "+min);
		System.out.println("Second Minimum Mark  : "+smin);
		
		 
	}

	private void SwapRight() {
		// TODO Auto-generated method stub
		
		int i ;
		String tmp;
		
		tmp=n[4];
		
		System.out.println("Right Swap before ");
		System.out.println();
		for(i=0;i<n.length;i++)
		{
			System.out.println(n[i]);
		}
		System.out.println();
		System.out.println("Right Swap after ");
		System.out.println();
		for(i=n.length-1;i>0;i--)
		{
			 n[i]=n[i-1];
			 
		}
		n[i]=tmp;
		 
		System.out.println();
		for(i=0;i<n.length;i++)
		{
			System.out.println(n[i]);
		}
		
	}

	private void SwapValues() {
		// TODO Auto-generated method stub
		
		int i=0 ;
		
	
	
	 String tmp=n[0];
	 System.out.printf("\n\nValues Before Swap\n");
	 
	for(i=0;i<5;i++)
	{
		System.out.println(n[i]);
		
	}
	
	for(i=0;i<5;i++)
	{
		if(i!=4)
		{
		n[i]=n[i+1];
		}
		else
		{
			n[i]=tmp;
		}
	}
	 
	
	System.out.println("\n\nValues after Swap");
	
	for(i=0;i<5;i++)
	{
		System.out.println(n[i]);
		
	}
	 
	}
	
	
	

}

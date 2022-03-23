package Java.basics;

public class LoopNum{
	
	int n , total , ran;
	
	LoopNum()
	{
		n=0 ;
	}
	LoopNum(  int range)
	{
		 
		 ran=range ;
	}
	
	public void addNum()
	{
		n=1;
		total=0;
		
		
		while(n<=ran)
		{
			System.out.println(n);
			total+=n;
			n++;
			
			
		}
		System.out.println();
		System.out.println("Total : "+total);
		
	}
	
	public void mulNum()
	{
		total=0;
		n=1;
		while(n<=ran)
		{
			System.out.println(n);
			total+=n;
			n*=2;
			
		}
		
	}
	
	public void SqrtSeries()
	{
		total=0;
		
		n =1 ;
		
		while(n<=ran)
		{
			System.out.println(n*n);
			total+=n*n;
			n++;
		}
		System.out.println();
		System.out.println("Total : "+total);
		
	}
	
	public void cubeSeries()
	{
		total=0;
		n=1;
		
		while(n<=ran)
		{
			System.out.println(n*n*n);
			total+=n*n*n;
			n++ ;
		}
		System.out.println();
		System.out.println("Total : "+total);
		
	}
	
	public static void main(String [] args)
	{
		LoopNum L=new LoopNum(10);
		//L.addNum();
		//L.mulNum();
		L.SqrtSeries();
		L.cubeSeries();
	}
	
	
	

}

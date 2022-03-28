package Java.basics;

public class LCM {
	
	public static void main(String[] args) {
		LCM L = new LCM();
		L.findLCM(91,50);
	 
	}
	

	

	public void findLCM(int n1,int n2) {
		// TODO Auto-generated method stub
		int max ;
		
		int no1,no2 ;
		
		no1=n1;
		no2=n2;
		
		max=no1>no2?no1:no2;
		
		while(true)
		{
			
			if(max%no1==0&&max%no2==0)
			{
			
				break;
			}
			max++;
		}
		
		System.out.println(" LCM is  "+max);
	}

}

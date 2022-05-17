package Java.basics;

public class NumPyramid {
	
	int n ;
	public static void main(String[] args) {
		NumPyramid nx = new NumPyramid();
		nx.n=10;
		nx.NumPy();
	
	}

	private void NumPy() {
		// TODO Auto-generated method stub
		int i , j ,d ;
		d=1;
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				
				System.out.printf(" ");
			}
			d=i;
			for(j=1;j<=i;j++)
			{
				System.out.printf("%d",d%10);
				d++;
			}
			d--;
			for(j=1;j<=i-1;j++)
			{
				System.out.printf("%d",d%10);
				d--;
			}
			System.out.println();
			
		}
	}

}

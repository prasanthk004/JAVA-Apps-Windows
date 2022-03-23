package Java.basics;

public class FindTotalFood {
	
	int persons;
	float pending ;
	
	 

	public FindTotalFood(int persons, float pending) {
		super();
		this.persons = persons;
		this.pending = pending;
	}

	public void CalculateFood()
	{
	 
		int  div;
		float  bal;
		 
		bal=pending ;
		div=persons-1;
		
		
		while(persons>0)
		{
			System.out.printf("\n Person %d Eaten %2.2f ",persons,bal/div);
			bal=bal+bal/div;
			
			System.out.printf("Balance : %.1f",bal);
			persons--;
		}
		
	}
	
	public static void main(String[] args)
	{
		FindTotalFood f = new FindTotalFood(5,10);
		f.CalculateFood();
	}

}

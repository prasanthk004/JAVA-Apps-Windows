package Java.basics;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Random;


public class LearnSet {
	
	
	public static void main(String[] args) {
		LearnSet ls = new LearnSet();
		
		ls.LinkedHashsets();
		
	}

	private void LinkedHashsets() {
		// TODO Auto-generated method stub
	 LinkedHashSet lhs = new LinkedHashSet();
	 ArrayList al = new ArrayList();
	 ArrayList la = new ArrayList();
	 
	 Random r = new Random();
	 
	 int i ;
	 
	 for(i=0;i<9;i++)
	 {
		 al.add(r.nextInt(10)+1);
		 
		 
		 
	 }
	  
	 System.out.println(al);
	 i=0;
	 
	 for(Object ob:al)
	 {
		 if(!lhs.add(ob))
		 {
			la.add(ob);
			 
		 }
	 }
	 
	 System.out.println("\n\n\n");
	 
	 
	 System.out.println("      Duplicate Value : "+la);
	 System.out.println("Non - Duplicate Value : "+lhs);
	 
	
	}

}

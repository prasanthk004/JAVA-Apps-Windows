package Java.basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class CollectionsLearn {
	
	
	public static void main(String[] args) {
		CollectionsLearn cl = new CollectionsLearn();
		
		//cl.LearnArrayList();
	//	cl.LearnLinkedList();
		//cl.LearnHashset();
		cl.learn_TreeSet();
		
		
	}
	
	
	private void learn_TreeSet() {
		// TODO Auto-generated method stub
		TreeSet al = new TreeSet(); 
		 
	   al.add(15);
	   al.add(158);
	   al.add(54);
	   al.add(1577);
	   
	   System.out.println(al);
		
	} 

	private void LearnHashset() {
		// TODO Auto-generated method stub
		HashSet al = new HashSet(); 
		al.add("Naveen"); 
		al.add("prasanth"); 
		al.add(5); //Integer Object 	int variable
		al.add(true); 
		al.add(3.4f); 
		al.add('a'); 
		System.out.println(al);
	//	al.add(2, "vinodhini");
		System.out.println(al);
		System.out.println(al.contains("prasanth")); 
	//	System.out.println(al.get(5)); 
		
 
		System.out.println(al);
		HashSet al2 = new HashSet();
		al2.addAll(al); 
		System.out.println(al2);
		al2.add(56); 
		al2.add(78);
		al2.add(96); 
		System.out.println(al2);
	//	System.out.println(al2.indexOf(78)); 
		System.out.println(al2.isEmpty()); 
		System.out.println(al2.size()); 
		System.out.println(al2.containsAll(al)); 
		//List al3 = ((List) al2).subList(0, 4) ; 
		//System.out.println(al3); 
	}

	private void LearnLinkedList() {
		// TODO Auto-generated method stub
		
		LinkedList al = new LinkedList(); 
		al.add("Naveen"); 
		al.add("prasanth"); 
		al.add(5); //Integer Object 	int variable
		al.add(true); 
		al.add(3.4f); 
		al.add('a'); 
		System.out.println(al);
		al.add(2, "vinodhini");
		System.out.println(al);
		System.out.println(al.contains("prasanth")); 
		System.out.println(al.get(5)); 
		
     	System.out.println(al);
		LinkedList al2 = new LinkedList();
		al2.addAll(al); 
		System.out.println(al2);
		al2.add(56); 
		al2.add(78);
		al2.add(96); 
		System.out.println(al2);
		System.out.println(al2.indexOf(78)); 
		System.out.println(al2.isEmpty()); 
		System.out.println(al2.size()); 
		System.out.println(al2.containsAll(al)); 
		List al3 = al2.subList(0, 4) ; 
		System.out.println(al3); 
		
	}

	private void LearnArrayList() {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		
		al.add("KP");
		al.add("Prasanth K");
		al.add(1,23);
		 
		al.add(5.6);
		al.add('M');
		
		
		System.out.println(al);
		System.out.println(al.contains("Prasanth K"));
		
		//al.clear();
		
		ArrayList al1 = new ArrayList();
	
	 
		al1.addAll(al);
		System.out.println(al1);
		 
		al1.add(415);
		al1.add(965);
		System.out.println(al1);
		System.out.println(al1.indexOf(23));
		System.out.println(al1.containsAll(al));
		 
		System.out.println(al1.isEmpty());
		System.out.println(al1);
		
		
		ArrayList al3= new ArrayList() ;
		al3=(ArrayList) al.subList(0, 3);
		
		System.out.println(al3);
  	}

}

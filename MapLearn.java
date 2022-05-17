package Java.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapLearn {
	
	public static void main(String[] args) {
		MapLearn ml = new MapLearn();		
		ml.Maps();
		//ml.Iterators();
		
		
	}

	private void Iterators() {
		// TODO Auto-generated method stub
    ArrayList al = new ArrayList();
		
		al.add("KP");
		al.add("Prasanth K");
		al.add(1,23);
		 
		al.add(5.6);
		al.add('M');
		
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());  
		}
		
		
		
		
		
		
	}

	private void Maps() {
		// TODO Auto-generated method stub
		TreeMap m=new TreeMap();
		
		m.put("Tamil 1", 98);
		m.put("Tamil 2", 78);
		m.put("English ",79);
		m.put("Maths", 89);
		m.put("OOAD", 58);
		m.put("DCN", 66); 
		
		
		System.out.println(m);
		System.out.println(m.get("Maths"));
		System.out.println(m.containsKey("Maths"));
		System.out.println(m.containsValue(66));
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		
		
		System.out.println("\n\n\n\n");
		
		Set Entries= m.entrySet();
		
		Iterator it = Entries.iterator();
		
		while(it.hasNext())
		{
			 Entry en=(Entry) it.next();
			 Integer marks=(Integer)en.getValue();
			 
			 if(marks<80)
			 {
				 System.out.println(en);
			 }
			
 		}
		
	 
		
		
	}

	 
}

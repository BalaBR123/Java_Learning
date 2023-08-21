package LearningJava;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Collection {

	public static void main(String[] args) {
        //Collection List method(ArrayList and LinkedList)
		ArrayList al=new ArrayList();
		al.add(4);
		al.add(18.5);
		al.add('a');
		al.add("Hello");
		al.add(true);
		al.add(false);
		System.out.println("Array of object  al");
		System.out.println(al);
		ArrayList al2=new ArrayList();
		al2.addAll(al);
		System.out.println("Array of object al2");
		System.out.println(al2);
        System.out.println(al2.get(4));
        System.out.println(al.size());
        System.out.println(al.contains(6));
        System.out.println(al2.indexOf(18.5));
        System.out.println(al.lastIndexOf(4));
        Object[] obj=al.toArray();
        for(int i=0;i<obj.length;i++)
        {
        	System.out.println(obj[i]);
        }
        System.out.println();
        //Set
        HashSet hs=new HashSet();
        hs.add(5);
        hs.add(3);
        hs.add(10);
        hs.add(40);
        hs.add(40);
        System.out.println(hs.size());
        System.out.println(hs);
        System.out.println();
        TreeSet<Integer> ts=new TreeSet<Integer>();
        ts.add(4);
		ts.add(2); 
		ts.add(5);
		ts.add(3);
		//ts.add('a');
		//ts.add("Hello");   classCastException
		//ts.add(true);
		//ts.add(34.12);
		System.out.println(ts);
		System.out.println();
		TreeSet<String>ts2=new TreeSet<String>();
		ts2.add("Hello");
		ts2.add("World");
		ts2.add("Apple");
		ts2.add("Bold");
		System.out.println(ts2);
		
		System.out.println();
		
		HashMap hm =new HashMap();//LinkedHashMap//TreeMap
		hm.put("lenovo",20000);
		hm.put("hp", 30000);
		hm.put("dell", 40000);
		hm.put("applelab", 50000);
		System.out.println(hm);
		System.out.println(hm.containsValue(45000));
		System.out.println(hm.size());
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.containsKey("dell"));   
		System.out.println();
		LinkedList ll= new LinkedList();
		ll.add(55);
		ll.add(27);
		ll.add(43);
		ll.add(75);
		ll.add(66);
		//System.out.println(ll);
		for(Object o: ll) {
			Integer i= (Integer)o;
			if(i%2==0)
			System.out.println(i);
		}
		System.out.println();
		Iterator i=ll.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}

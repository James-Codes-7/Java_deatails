package org.collections;

import java.util.*;

public class CollectionAPI {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
	

		Collection<Integer> val=new ArrayList<>();
		val.add(7);
		val.add(3);
		val.add(4);
		//val.addAll("w2wq");
		Iterator it=val.iterator();
		while(it.hasNext())//check it has the next element
		{
			System.out.println(it.next());//print and go next
		}
		System.out.println(val);
	//	System.out.println(val.get(2));
		System.out.println(val.contains(4));
		
		HashSet<Integer> val1=new HashSet();
		val1.add(9);
		val1.add(6);
		val1.add(7);
		Iterator i=val1.iterator();
		
		//val1.add("eyey");
		System.out.println(val1);
		
		Set val2=new TreeSet();
		val2.add(10);
		val2.add(5);
		val2.add(3);
		System.out.println(val2);
		
		Map<Integer,String> val3=new HashMap<>();
		
		val3.put(1,"james");
		System.out.println(val3.get(1));
	}

}

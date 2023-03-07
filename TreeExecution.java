package org.example;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap <Integer, String> map1 =  new TreeMap<Integer, String>();
		map1.put(101, "Apple");
		map1.put(102, "Banana");
		map1.put(103, "Lemon");
		map1.put(105, "Orange");
		map1.put(104, "Peach");
		
		System.out.println(map1);
		
		System.out.println(map1.headMap(103, true));
		System.out.println(map1.headMap(103));
		System.out.println(map1.tailMap(103));
		System.out.println(map1.tailMap(103, true));
		
		TreeMap <Integer, String> map2 =  new TreeMap<Integer, String>(Comparator.reverseOrder());
		map2.put(101, "Apple");
		map2.put(102, "Banana");
		map2.put(103, "Lemon");
		map2.put(105, "Orange");
		map2.put(104, "Peach");
		
		System.out.println(map2);
		
		System.out.println(map2.firstKey());
		System.out.println(map2.firstEntry());
		System.out.println(map2.pollFirstEntry());
		
		
		
		
	}

}

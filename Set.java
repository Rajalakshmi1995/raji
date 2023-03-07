package org.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> s = new TreeSet<Integer>();
		s.add(20);
		s.add(60);
		s.add(30);
		s.add(50);
		
		
		
		System.out.println("**********TreeSet**********");
		System.out.println(s);
		
		for (Integer integer : s) {
			
			System.out.println(integer);
		}
		
		Iterator<Integer> it = s.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		
		HashSet<Integer> h = new HashSet<Integer>();
		
		h.add(20);
		h.add(50);
		h.add(30);
		h.add(40);
		h.add(null);
		
		System.out.println("**********HashSet**********");
		
		System.out.println(h);
		
		for (Integer integer : h) {
			
			System.out.println(integer);
		}
		
		Iterator<Integer> i = h.iterator();
		
		
		while(i.hasNext()) {
			
			System.out.println(i.next());
		}
		
		
		LinkedHashSet<Integer> l = new LinkedHashSet<Integer>();
		
		l.add(30);
		l.add(50);
		l.add(20);
		l.add(70);
		l.add(null);
		
		System.out.println("************Linked HashSet***********");
		System.out.println(l);
		
		for (Integer integer : l) {
			System.out.println(integer);
		}
		Iterator<Integer> iterator = l.iterator();
		
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
	
		
		
		
		
		
		
	}

}

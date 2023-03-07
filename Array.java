package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Array {

	public static void main(String[] args) {
	
	
		List<Integer> li = new LinkedList<Integer>();
		li.add(10);
		li.add(10);
		li.add(20);
		li.add(20);
		li.add(50);
		li.add(60);	
		ListIterator<Integer> listIterator = li.listIterator();
		System.out.println();
		while (listIterator.hasNext()) {		
			System.out.println("Index: "+ listIterator.nextIndex() + "  Value:  " + listIterator.next() );	
		}
		
	while(listIterator.hasPrevious()) {
		System.out.println("index: " + listIterator.previousIndex() + " Value: " + listIterator.previous());
	}	  
	
	
	List<Integer> lp = new ArrayList<Integer>();
	lp.add(10);
	lp.add(10);
	lp.add(20);
	lp.add(20);
	lp.add(500);
	lp.add(600);	
	
	System.out.println("***********");
	
	List <Integer> common = new ArrayList<Integer>(li);
	
	common.retainAll(lp);
	
	
	System.out.println(common);
	
	
	Iterator<Integer> iterator = li.iterator();
	
	
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	lp.indexOf(20);
	lp.remove(3);
	System.out.println(lp);
	
	
	 
	
	
	
	
	
	
	
	
	
	}
	
}

package org.example;

import java.util.ArrayList;
import java.util.TreeSet;

public class phone {
	
	
	public static void main(String[] args) {
		
		String phone = "7598452303";
		
		char[] charArray = phone.toCharArray();
		
		System.out.println(charArray);
		
		ArrayList<Character> li =new ArrayList<>();
		
		for (Character character : charArray) {
			
			li.add(character);
		}
			
			System.out.println(li);
			TreeSet<Character> t = new TreeSet<>(li);
			
			System.out.println(t);
		}
		
		
		
	}


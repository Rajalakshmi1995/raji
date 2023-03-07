package org.example;

public class example {

	public static void main(String[] args) {


	
			String str = "geekss@for@geekss";
			String[] arrOfStr = str.split("@", 2);
			
			for (String a : arrOfStr)
			System.out.println(a);
		
			
			
			String s1 = "Radar";
			
			String s4 = "";
			
			StringBuffer s2 = new StringBuffer();
			
			s2.append(s1);
			
			s2.reverse();
			
			String s3 = s2.toString();
			
			if(s1.toLowerCase().equals(s3.toLowerCase())) {
				
				System.out.println(s1+" "+ "is equal to"+" "+ s3 );
				
			}
			
			
			for(int i=0; i <s1.length(); i++) {
				
				System.out.println(i);
				
			}


	}

}

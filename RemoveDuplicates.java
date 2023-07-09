package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="Paypal India";
    String output="";
    char []ch=s.toCharArray();
    
    Set<Character> charSet=new LinkedHashSet<Character>();
    Set<Character> dupCharSet=new LinkedHashSet<Character>();
    
    for(char i:ch) {
    	if(charSet.add(i)) {
    		output=output+i;
    	}
    	else {
    		dupCharSet.add(i);
    	}   	
    }
    System.out.println("String after removing duplicate characters: "+output);
	}

}
package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String name="Vaibhav";
      
      String output="";
      char[]ch=name.toCharArray();
      Set<Character>data=new LinkedHashSet<Character>();
      
      for(char i:ch) {
    	  if (data.add(i))
    		  output=output+i;
      }
      System.out.println("Given String: "+data);
      System.out.println("Unique Characters are:"+output);
	}

}

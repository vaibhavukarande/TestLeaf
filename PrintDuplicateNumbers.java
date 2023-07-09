package week3.day1;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDupNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = {4,3,6,8,9,1,2,4,7,8,9};
		
		Set<Integer> uniqueVal=new LinkedHashSet<Integer>();
		Set<Integer> duplicateVal=new LinkedHashSet<Integer>();
		
		for(Integer i:data)
		{
			boolean add=uniqueVal.add(i);
					if(!add)
						duplicateVal.add(i);
		}
		System.out.println("The Unique Values are: "+uniqueVal);
		System.out.println("The Duplicate Values are: "+duplicateVal);
	}

}
package com.atul.collectionframework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	
	/*linkedhashSet doesnt contains duplicate element
	 * it maintains the insertion order
	 * it is not synchronized although we can explicitly synchronize them.
	 * 
	 * */
	public static void main(String[] args) {
		LinkedHashSet<String> lh=new LinkedHashSet<String>();
		lh.add("atul");
		lh.add("ciara");
		lh.add("manisha");
		lh.add("neha");
		
		Iterator<String> itr=lh.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}

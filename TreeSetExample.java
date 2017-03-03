package com.atul.collectionframework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {

		/*
		 * treeset is similar to the hashset but it sorts 
		 * the element based on the values in ascending order.
		 * it doesn't contains duplicate values.
		 * it is also non synchronized but can be synchronized explicitly.
		 * */
		
		TreeSet<String> treeSet=new TreeSet<String>();
		treeSet.add("atul");
		treeSet.add("anshu");
		treeSet.add("barkha");
		treeSet.add("priyanshu");
		
		
		Iterator<String > itre=treeSet.iterator();
		while(itre.hasNext()){
			System.out.println(itre.next());
		}
		
		
		System.out.println(treeSet);
	}
}

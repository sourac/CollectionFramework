package com.atul.collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	
	public static void main(String[] args) {
		HashSet<String> hashSet=new HashSet<String>();
		hashSet.add("atul");
		hashSet.add("barkha");
		hashSet.add("rachna");
		hashSet.add("atul");
		/*
		 * hashet is non synchronized. not good for thread safe operations
		 * hashset doesnt contains duplicate values
		 * hashset doesnt maintains the insertion order
		 * hashset is the fastest implementation of the Set interface
		 * */
		
		Iterator<String> itr=hashSet.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}

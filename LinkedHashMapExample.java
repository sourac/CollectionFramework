package com.atul.collectionframework;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	/*
	 * it maintains the insertion order
	 */

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<Integer, String>();

		// Adding elements to LinkedHashMap
		lhmap.put(22, "Abey");
		lhmap.put(33, "Dawn");
		lhmap.put(1, "Sherry");
		lhmap.put(2, "Karon");
		lhmap.put(100, "Jim");
		
		for(Map.Entry l: lhmap.entrySet()){
			System.out.println(l.getKey()+" "+ l.getValue() ) ;
		}
		

	}

}

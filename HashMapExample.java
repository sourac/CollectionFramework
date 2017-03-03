package com.atul.collectionframework;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	/*
	 * hashMap maintans key value pairsit implements map interface.it is similar
	 * to hashtable except for 2 reason1. it's methods are unsynchronized2. it
	 * does allow null key and value.
	 * 
	 * it's not ordered collection
	 */

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "atul");
		hmap.put(null, null);
		hmap.put(2, "ciara");
		hmap.put(3, "anshu");

		for (Map.Entry hm : hmap.entrySet()) {

			System.out.println(hm.getKey() + " " + hm.getValue());

		}

	}

}

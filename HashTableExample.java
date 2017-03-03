package com.atul.collectionframework;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	/*hashtable is an array of list.
	 * each list is known as bucket	
	 * the position of the bucket is identified 
	 * by calling the hashCode() method
	 * hashtable contains value based on key value pair
	 * it is synchronized
	 * */
	public static void main(String[] args) {
		Hashtable<Integer, String> hashtable=new Hashtable<Integer, String>();
		hashtable.put(1, "atul");
		hashtable.put(2, "ciara");
		hashtable.put(3, "anshu");
		
		System.out.println(hashtable);
		
		for(Map.Entry m : hashtable.entrySet()){
			System.out.println(m.getKey()+" " + m.getValue());
		}
		
		
		
		
 	}
	
	
	
	
}

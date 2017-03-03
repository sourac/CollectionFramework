package com.atul.collectionframework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	/*it strores it's element based on the key values
	 * it's similar to hashmap except hashmap is unordered collection
	 * while treemap sorts it's element based on the ascending order of key
	 *treemap is synchronized
	 **/
	public static void main(String[] args) {
		TreeMap<Integer, String> tmap = 
	             new TreeMap<Integer, String>();

	      /*Adding elements to TreeMap*/
	      tmap.put(1, "Data1");
	      tmap.put(23, "Data2");
	      tmap.put(70, "Data3");
	      tmap.put(4, "Data4");
	      tmap.put(2, "Data5");
	      
	      for(Map.Entry tm:tmap.entrySet()){
	    	  System.out.println(tm.getKey()+" "+ tm.getValue() );
	      }
	      
	}
}

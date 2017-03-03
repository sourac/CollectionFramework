package com.atul.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

/* collections in java is basically an architecture
 * to store and manipulate the data.
 * 
 * collection represent a single unit of objects.
 * collection framework has interface and its implementation.
 * i.e classes.
 * 
 * java.util.package contains all the interface and classes for 
 * the collection framework
 * 
 * */
/*arraylist  uses dynamic array for storing the elements
 * it extends abstractList Class and implemens List Interface
 * 
 * arraylist maintains insertion order
 * arraylist contains duplicate elements
 * 
 * arraylist is non synchronized. not thread safe
 * 
 * 
 * 
 * */
public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("atul");
		arrayList.add("barkha");
		arrayList.add("anshu");
		arrayList.add("avinash");
		arrayList.add("atul");

		/*two ways to iterate through the arraylist
		 * 1. by using the iterator
		 * 2. by  using the foreach loops
		 * */
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("using the foreach loop");
		
		for(String s: arrayList){
			System.out.println(s);
		}
		
		
		

	}

}

package com.atul.collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListImportantMethods {

	public static void main(String[] args) {
		
		ArrayList<String> ary=new ArrayList<String>();
		ary.add("sourav");
		ary.add("rachna");
		
		ArrayList<String > ary1=new ArrayList<String>();
		ary1.add("nimesh");
		ary1.add("quinnox");
		ary1.add("sourav");
		
		ary.addAll(ary1);
		
		
		Iterator<String > itr=ary.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("testing the retainAll method");
		ary.retainAll(ary1);
		 Iterator<String> it=ary.iterator();
		 while(it.hasNext()){
			 System.out.println(it.next());
		 }
		 
		System.out.println("sorting");
		 /*sorting the collection*/
		Collections.sort(ary1);
		 for(String s : ary1){
			 System.out.println(s);
		 }
		 
		 /*converting arraylist into array*/
		 
		System.out.println("converting the arrayList into array");
		 String[] sry= ary1.toArray(new String[ary1.size()]);
		 for(String s: sry){
		 System.out.println(s);
		 }
		 
		 /*converting array to arraylist*/
		 System.out.println("converting the array into arraylist");
		 String citynames[]={"Agra", "Mysore", "Chandigarh", "Bhopal"};
		ArrayList<String> all=new ArrayList<String>(Arrays.asList(citynames));
		 for(String s : all){
			 System.out.println(s);
		 }

		 
		 
	}
	
}

package com.atul.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SynchronizationOfArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> ary=new ArrayList<String>();
		ary.add("atul");
		ary.add("barkha");
		ary.add("rachna");
		
		Collections.synchronizedList(ary);
		
		synchronized (ary) {
		Iterator< String> itr=ary.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		}
		
		

	}
}

package com.atul.collectionframework;

import java.util.ArrayList;
import java.util.HashSet;

public class FindingDuplicate {

	public static void main(String[] args) {
		
		ArrayList<Integer> ary=new ArrayList();
		ary.add(1);
		ary.add(2);
		ary.add(3);
		ary.add(4);
		ary.add(5);
		ary.add(2);
		ary.add(5);
		
		HashSet<Integer> hry=new HashSet<Integer>();
		HashSet<Integer> duplicate=new HashSet<Integer>();
		for(int i=0;i<ary.size();i++){
			if(!hry.add(ary.get(i))){
				duplicate.add(ary.get(i));
			}
			
		}
		
		System.out.println(hry+ " ");
		System.out.println("dduplicate element in the list are : " + duplicate);
		
		
	}
	
}

package com.atul.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class UserDefinedClassObjectInArrayList {

	public static void main(String[] args) {
		Student s1 = new Student("atul", 24, 17);
		Student s2 = new Student("anshu", 23, 13);
		Student s3 = new Student("barkha", 24, 19);

		ArrayList<Student> arraylist = new ArrayList<Student>();
		arraylist.add(s1);
		arraylist.add(s2);
		arraylist.add(s3);
		
		Iterator<Student> iterator=arraylist.iterator();
		while(iterator.hasNext()){
			Student st=iterator.next();
			System.out.println(st.name+" " + st.age+" " + st.rollno);
		}
		

	}

}

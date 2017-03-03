package com.atul.collectionframework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationOfArrayList {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("namish");
		arrayList.add("kashish");
		arrayList.add("namishie");
		arrayList.add("namishivay");
		
		try {
			FileOutputStream fos=new FileOutputStream("serializationofarraylist.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(arrayList);
			oos.close();
			fos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}

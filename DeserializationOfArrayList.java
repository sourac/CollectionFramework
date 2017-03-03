package com.atul.collectionframework;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeserializationOfArrayList {
	public static void main(String[] args) throws ClassNotFoundException {
		
		ArrayList<String> array=new ArrayList<String>();
		 try {
			
			 FileInputStream fis=new FileInputStream("serializationofarraylist.txt");
			 ObjectInputStream ois=new ObjectInputStream(fis);
			 array=(ArrayList<String>) ois.readObject();
			 ois.close();
			 fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 System.out.println("Deserialization bitch");
		 
		 for(String s:  array){
			
			 System.out.println(s);
			 
			 
		 }
		

	}
}

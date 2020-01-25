package com.sun.FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fileOutputStream = new FileOutputStream("Pojo.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		Pojo pojo = new Pojo(5,"PojoTest");
		System.out.println(" Before Serialization : "+ pojo);
		
		objectOutputStream.writeObject(pojo);
		objectOutputStream.close();
		
		FileInputStream fileInputStream = new FileInputStream("Pojo.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		
		Pojo deserializedPojo = (Pojo) objectInputStream.readObject();
		
		System.out.println(" After Deserialization : "+ deserializedPojo);
		

	}
	
	static class Pojo implements Serializable{
		int id = 4;
		String name;
		
		Pojo(int id, String name){
			this.id=10;
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		@Override
		public String toString() {
			return id+" : "+name ;
		}
		
	}

}

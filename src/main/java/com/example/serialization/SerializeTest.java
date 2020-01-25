package com.example.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeTest {

	public static void main(String[] args) {
		Student s1= new Student();
		s1.setId(2);
		s1.setName("RohakRudra");
		Marks marks = new Marks();
		marks.setMaths(100);
		marks.setTelugu(98);
		s1.setMarks(marks);
		
		System.out.println("Before Serialization : "+s1);
		try {
			FileOutputStream fos = new FileOutputStream(new File("Student-Rohak.ser"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s1);
			
			
			FileInputStream fis = new FileInputStream(new File("Student-Rohak.ser"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student s2 = (Student)ois.readObject();
			
			System.out.println("After Deserialization : "+s2);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class Student implements Serializable{
	private int id;
	private String name;
	
	private Marks marks;
	
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
	
	public Marks getMarks() {
		return marks;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
	public String toString() {
		return "Student ID : "+id+" Name : "+name + " Marks attained : "+marks;
	}
}

class Marks implements Serializable{
	
	int maths;
	int telugu;
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getTelugu() {
		return telugu;
	}
	public void setTelugu(int telugu) {
		this.telugu = telugu;
	}
	
	@Override
	public String toString() {
		return "Maths : "+maths +" telugu : "+telugu;
	}
}

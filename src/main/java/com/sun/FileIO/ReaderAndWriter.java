package com.sun.FileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWriter {

	public static void main(String[] args) throws IOException {
		writeToAFile();
		
		readFromAFile();
		
		
		
	}

	private static void readFromAFile() throws FileNotFoundException, IOException {
		File file = new File("file1.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		String line =null;
		while((line=bufferedReader.readLine())!=null) {
			System.out.println(line);
		}
		
		bufferedReader.close();
	}

	private static void writeToAFile() throws IOException {
		File file = new File("file1.txt");
		file.createNewFile();
		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		bufferedWriter.write("Test file writing...");
		
		bufferedWriter.write("\nIts working...");
		
		bufferedWriter.close();
	}

}

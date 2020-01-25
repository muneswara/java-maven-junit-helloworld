package com.sun.FileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderAndWriter {

	public static void main(String[] args) {

		char[] fileContent = new char[80];

		File file = new File("FileTest01.txt");

		try {
			file.createNewFile();

			FileWriter writer = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write("Chapter 6 is going on ... now... File IO..");
			bufferedWriter.newLine();
			bufferedWriter.write("..aaaaaaaaaaaaaaaaaaaaaaaaaa.......");
			bufferedWriter.newLine();
			bufferedWriter.write("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb...........");
			bufferedWriter.newLine();
			bufferedWriter.write("..dddddddddddddddddddddddddd................");
			bufferedWriter.newLine();
			bufferedWriter.write("...sdflsdfldskjfldsskfdsfdsfdlfjdslkjflsdkfjldskfldskflskdfdkfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff....................gggggg");
			bufferedWriter.newLine();
			writer.flush();
			bufferedWriter.flush();
			writer.close();
			bufferedWriter.close();

			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			while((line=bufferedReader.readLine())!=null) {
				
				System.out.println(line);
			}
			/*while (bufferedReader.read(fileContent) != -1) {
				for (char ch : fileContent) {
					System.out.print(ch);
				}
				System.out.println();
			}*/
			fileReader.close();
			bufferedReader.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

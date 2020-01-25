package com.sun.FileIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndWriter {

	public static void main(String[] args) {

		char[] fileContent = new char[80];

		File file = new File("FileTest01.txt");

		try {
			file.createNewFile();

			FileWriter writer = new FileWriter(file);
			writer.write(
					"Chapter 6 is going on ... now... File IO....aaaaaaaaaaaaaaaaaaaaaaaaaa.......bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb.............dddddddddddddddddddddddddd...................sdflsdfldskjfldsskfdsfdsfdlfjdslkjflsdkfjldskfldskflskdfdkfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff....................gggggg");
			writer.flush();
			writer.close();

			FileReader fileReader = new FileReader(file);
			while (fileReader.read(fileContent) != -1) {
				for (char ch : fileContent) {
					System.out.print(ch);
				}
				System.out.println();
			}
			fileReader.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

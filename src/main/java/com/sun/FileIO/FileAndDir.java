package com.sun.FileIO;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class FileAndDir {

	public static void main(String[] args) {
		File file = new File("Dir3");
		file.mkdir();
		try {
			File file1 = new File("file1");
			//new File(file, file1).createNewFile();
			new File(file, "file2").createNewFile();
			new File(file, "file3").createNewFile();
			String[] list = file.list();
			for(int i=0; i<list.length; i++) {
				System.out.println("File : "+i+ " - "+ list[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Date d = new Date(1119280000000L);
		
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG, Locale.GERMAN);
		System.out.println(dateFormat.format(d));

	}

}

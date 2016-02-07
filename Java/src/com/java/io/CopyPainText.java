package com.java.io;

import java.io.*;

public class CopyPainText {

	public static void main(String[] args) {
		File file = new File("news.txt");
		try {
			FileInputStream fis = new FileInputStream(file);
			FileOutputStream fos = new FileOutputStream("Copy_of_news.txt");
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			char input[] = new char[100];
			int l = 0;
			while ((l = isr.read(input)) != -1) {
				// String inputString = new String(input,0,l);
				osw.write(input, 0, l);
			}
			isr.close();
			fis.close();
			osw.close();
			fos.close();
			System.out.println("done");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

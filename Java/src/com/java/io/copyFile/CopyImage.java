package com.java.io.copyFile;

import java.io.*;

public class CopyImage {

	public static void main(String[] args) {

		try {
			File file = new File("ani.gif");
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis, 1000000);

			FileOutputStream fos = new FileOutputStream("Copy_of_ani.gif");
			BufferedOutputStream bos = new BufferedOutputStream(fos, 1000000);

			byte input[] = new byte[1000000];
			int count = 0;
			long before = System.currentTimeMillis();
			while (bis.read(input) != -1) {
				bos.write(input);
				count++;
			}
			bos.flush();
			bis.close();
			fis.close();
			bos.close();
			fos.close();
			System.out.println(System.currentTimeMillis() - before + "ms");
			System.out.println("read：" + count + " times");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

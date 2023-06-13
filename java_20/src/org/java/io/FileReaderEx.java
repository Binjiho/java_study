package org.java.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) throws IOException {
		String fileName = "C:\\Users\\Administrator\\Desktop\\dev\\java\\test.txt";
		
		//���� �ҷ�����
		File file = new File(fileName);
		
		FileReader fileReader = null;
		int inData = 0;
		
		//���� ���� �б�
		try {
			fileReader = new FileReader(file);
			while(( inData=fileReader.read()) != -1 ) {
				System.out.println((char)inData);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			fileReader.close();
		}
		
	}
}

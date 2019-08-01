package java_20190801;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("c:\\dev\\test\\jdk.exe");
			FileDemo f = new FileDemo();
			f.mkdirs("c:\\dev\\test\\2019\\8\\1");
			// File f1 = new File("c:\\dev\\test\\2019\\8\\1");
			// boolean isExisted = f1.isDirectory();
			// if (!isExisted) {
			// f1.mkdirs();
			// }
			fos = new FileOutputStream("c:\\dev\\test\\2019\\8\\1\\jdk.exe");
			int readByte = 0;
			// fis.read() 메서드는 한 바이트 읽어 반환한다
			// 만약 더 이상 읽을 바이트가 없으면 -1을 반홚나다
			while ((readByte = fis.read()) != -1) {
				// fos.write(readByte)는 한 바이트 쓰기
				fos.write(readByte);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
		}
		try {
			if (fis != null)
				fis.close();
			if (fos != null)
				fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

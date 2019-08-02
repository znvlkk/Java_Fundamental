package java_20190802;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputOutputStreamDemo {
public static void main(String[] args) {
	FileInputStream fis = null;
	FileOutputStream fos = null;
	
	BufferedInputStream bis = null;
	BufferedOutputStream bos = null;
	
	try {
		/*
		//1. FileInputStream과 FileOutputStream을 이용하여
		     1바이트 읽어서 1바이트 출력한 예제이고 시간은 15(?)초
		fis = new FileInputStream("c:\\dev\\test\\java-pdf.zip");
		fos = new FileOutputStream("c:\\dev\\test\\java-pdf-copy.zip");
		
		int readByte = 0;
		long start = System.currentTimeMillis();
		while((readByte = fis.read()) != -1) {
			fos.write(readByte);
		}
		long end = System.currentTimeMillis();
		System.out.printf("경과시간 : %d%n", end-start);
		*/
		
		/*
		//2.BufferedInputStream과 BufferedOutputStream을 이용하여
		//1바이트 읽어서 1바이트 출력한 예제이고 경과시간은 0.018초
		//BufferedInputStream의 read()메서드는 1바이트 읽어서 
		//BufferedInputStream의 버퍼(byte[]) 공간에 저장한다
		//BufferedOutputStream의 write()메서드는 1바이트 출력하는 것이 아니라
		//BufferedOutputStream의 버퍼(byte[])공간에 가득 차 있으면 출력한다
		//만약 다 채워지지 않으면 출력하지 않음
		//이런경우 flush()메서드를 이용하여 출력함
		fis = new FileInputStream("c:\\dev\\test\\java-pdf.zip");
		fos = new FileOutputStream("c:\\dev\\test\\java-pdf-copy.zip");
		bis = new BufferedInputStream(fis); //Stream chaining
		bos = new BufferedOutputStream(fos); //Stream chaining
		
		int readByte = 0;
		long start = System.currentTimeMillis();
		while((readByte = bis.read()) != -1) {
			bos.write(readByte);
		}
		//BufferedOutputStream의 버퍼(byte[])는 다 채워지면 자동으로
		//전송하지만 다 채워지지 않으면 전송하지 않는다. 따라서 다 채워지지않더라도
		//버퍼를 비우기 위햏서는 flush() 메서드를 사용해야한다
		bos.flush(); //꼭 해야한다
		long end = System.currentTimeMillis();
		System.out.printf("경과시간 : %d%n", end-start);
		*/
		
		//3. FileInputStream과 FileOutputStream을 이용하여
	    // 1바이트 읽어서 1바이트 출력한 예제이고 시간은 0.002(?)초
		fis = new FileInputStream("c:\\dev\\test\\java-pdf.zip");
		fos = new FileOutputStream("c:\\dev\\test\\java-pdf-copy.zip");
		
		int readByteCount = 0;
		byte[] readBytes = new byte[1024*8];
		long start = System.currentTimeMillis();
		while((readByteCount = fis.read(readBytes)) != -1) {
			fos.write(readByteCount);
		}
		long end = System.currentTimeMillis();
		System.out.printf("경과시간 : %d%n", end-start);
		
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			if(fis != null) fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}

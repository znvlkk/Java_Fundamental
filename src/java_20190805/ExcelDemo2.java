package java_20190805;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDemo2 {
	public static void main(String[] args) {
		// 1. c:\dev\test\test1.txt 파일 읽어온다. BufferedReader
		// 2. BufferedReader의 readLine() 메서드를 이용하여 한줄씩 읽어온다
		// 3. 한줄읽은 문자열을 String의 split("#")을 이용해서 String[] 반환 받는다
		// 4-1. [0] => cell 입력한다 [1] => cell 입력한다
		// 4-2. [2] => cell 입력한다 [3] => cell 입력한다
		// 4-3. 2.3.4.반복작업을 해서 엑셀에 입력한다
		// 5. 엑셀파일명 : c:\dev\test\test2.xls 파일로 저장한다

		FileReader fr = null;
		BufferedReader br = null;
		FileOutputStream fos = null;
		String readLine = null;
		HSSFRow row1 = null;
		HSSFCell cell1 = null;
		HSSFRow row2 = null;
		HSSFCell cell2 = null;
		int rowIndex = 0;
		HSSFWorkbook workbook = new HSSFWorkbook(); // 새 엑셀 파일 생성
		HSSFSheet sheet = workbook.createSheet("새파일"); // 새 시트 생성

		try {
			fr = new FileReader("c:\\dev\\test\\test1.txt");
			br = new BufferedReader(fr);

			while ((readLine = br.readLine()) != null) {
				row1 = sheet.createRow(rowIndex++);
				String[] temp = readLine.split("#");// a1#b1#c1#d1
				for (int i = 0; i < temp.length; i++) {
					cell1 = row1.createCell(i);
					cell1.setCellValue(temp[i]);
				}
			}
			fos = new FileOutputStream("c:\\dev\\test\\test2.xls");
			workbook.write(fos);

			System.out.println("성공?");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) fr.close();
				if (br != null)	br.close();
				if (fos != null) fos.close();
				if (workbook != null) workbook.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

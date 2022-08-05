package com.abc.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xcell_data {

	public void xcelldata() {
		FileInputStream fis;
		// fis =new FileInputStream("resource\\Book123.xlsx");
		try {
			XSSFWorkbook workbook = new XSSFWorkbook("resource\\Book123.xlsx");
			XSSFSheet sheetbook = workbook.getSheet("sheet");
			XSSFRow rowbook = sheetbook.getRow(1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}

	//
	// XSSFSheet sheetbook = workbook.getSheet("sheet");
	//public static xcell_data(String testcasename, String coloumnname) {

		XSSFSheet sheetbook = null;
		// i have to collect all the data from xcell sheet now we can use
		// iterator method
		Iterator<Row> itr = sheetbook.rowIterator();
		while (itr.hasNext()) {
			Row rowobj = itr.next();
			Iterator<Cell> cell = rowobj.cellIterator();
			while (cell.hasNext()) {
				Cell cellobj = cell.next();
				System.out.println(cellobj.getCellType());

				switch (cellobj.getCellType()) {
				case STRING:
					System.out.println(cellobj.getRichStringCellValue());
					break;
				case NUMERIC:
					System.out.println(cellobj.getNumericCellValue());
					break;
				}
			}
		}

		/*
		 * try { XSSFWorkbook workbook=new XSSFWorkbook("resource\\Book123.xlsx");
		 * XSSFSheet sheetwook=workbook.getSheet("sheet"); XSSFRow
		 * row=sheetwook.getRow(0); XSSFCell cell=row.getCell(1); //for all the data of
		 * xcell sheet Iterator<Row> itr=sheetwook.rowIterator(); while(itr.hasNext()) {
		 * Row rowobj=itr.next(); Iterator<Cell>itr1=rowobj.cellIterator();
		 * while(itr1.hasNext()) { Cell cellobj=itr1.next(); } } } catch (IOException e)
		 * { // TODO Auto-generated catch block e.printStackTrace(); }
		 * 
		 */

	}
}

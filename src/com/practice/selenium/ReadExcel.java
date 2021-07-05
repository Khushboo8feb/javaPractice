package com.practice.selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(".\\TestDataFiles\\Test.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("TestData");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		
		System.out.println(cell);
		
		System.out.println(sheet.getRow(0).getCell(0));
		
		

	}

}

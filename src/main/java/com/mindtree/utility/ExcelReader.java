package com.mindtree.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static Object[][] readExcel() throws IOException {
		FileInputStream fstrm = new FileInputStream(PropertyFileReader.loadFile().getProperty("excelFile"));
		XSSFWorkbook workbook = new XSSFWorkbook(fstrm);
		XSSFSheet sheet = null;

		ArrayList<String> data = new ArrayList<String>();

		for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("searchdata")) {
				sheet = workbook.getSheetAt(i);
				break;
			}
		}
		Iterator<Row> rows = sheet.iterator();

		while (rows.hasNext()) {
			Row row = rows.next();
			Iterator<Cell> cellItr = row.cellIterator();
			Cell cell = cellItr.next();

			if (cell.getStringCellValue().equalsIgnoreCase("Search")) {
				while (cellItr.hasNext()) {
					cell = cellItr.next();
					data.add(cell.getStringCellValue());
					System.out.println(cell.getStringCellValue());
				}
			}

		}
		workbook.close();
		Object[][] objectData = new Object[data.size()][1];
		for (int i = 0; i < data.size(); i++) {
			objectData[i][0] = data.get(i);
		}
		return objectData;
	}

}

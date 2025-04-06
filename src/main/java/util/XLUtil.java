package util;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.*;

public class XLUtil {

	public static FileOutputStream fo;
	public static FileInputStream fi;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;

	public static int getRowCount(String xlfile, String xlsheet) throws Exception {

		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		int row = ws.getLastRowNum();
		wb.close();
		fi.close();
		return row + 1;
	}

	public static int getCellCount(String xlfile, String xlsheet, int rownum) throws Exception {

		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		int cellCount = row.getLastCellNum();
		wb.close();
		fi.close();
		return cellCount;
	}

	public static String getCellData(String xlFile, String xlSheet, int rowNum, int columnNum) throws Exception {
		fi = new FileInputStream(xlFile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlSheet);
		row = ws.getRow(rowNum);
		cell = row.getCell(columnNum);
		String data;
		try {
			DataFormatter formatter = new DataFormatter();
			data = formatter.formatCellValue(cell);
		} catch (Exception e) {
			data = "";
		}
		wb.close();
		fi.close();
		return data;
	}

	public static void setCellData(String xlFile, String xlSheet, int rowNum, int columnNum, String data)
			throws IOException {
		fi = new FileInputStream(xlFile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlSheet);
		row = ws.getRow(rowNum);
		cell = row.createCell(columnNum);
		cell.setCellValue(data);
		fo = new FileOutputStream(xlFile);
		wb.write(fo);
		wb.close();
		fo.close();
		fi.close();
	}

	// Method created by Amit to gather all data from Excel sheet
	public static List<Map<String, String>> getAllSheetData(String xlFile, String xlSheet) throws Exception {

		// String XLFile = "E:\\LEARNING\\SOFTWARE TESTING\\02- TRAINING\\04- AUTOMATED
		// TESTING\\04- HOW TO PERFORM\\02- CODE BASED AUTOMATION\\02 - AUTOMATION
		// TYPES\\1- WEB AUTOMATION\\02 - FRAMEWORKS\\2- CUICUMBER Framework\\2-
		// Tutoriuals\\12- HYBRID FRAMEWORK DESIGN\\TestData.xlsx";

		// String SheetName = "Sheet1";

		XLUtil obj = new XLUtil();
		List<Map<String, String>> AllData = new ArrayList<>();

		int numRow = obj.getRowCount(xlFile, xlSheet);
		int numCols = obj.getCellCount(xlFile, xlSheet, 0);

		String[] ColNames = new String[4];
		String[] ColData = new String[4];

		System.out.println("Number of rows :" + numRow + " and number of cols :" + numCols);

		// For loop for getting all col names
		for (int i = 0; i < numRow; i++) {
			for (int j = 0; j < numCols; j++) {
				if (i == 0) {
					ColNames[j] = obj.getCellData(xlFile, xlSheet, i, j);
				}
			}
		}

		// For loop for getting all col values
		for (int i = 0; i < numRow; i++) {

			Map<String, String> map1 = new HashMap<String, String>();

			for (int j = 0; j < numCols; j++) {

				if (i != 0) {
					ColData[j] = obj.getCellData(xlFile, xlSheet, i, j);
					map1.put(ColNames[j], ColData[j]);
				}
			}

			AllData.add(map1);
		}

		// For loop to iterate Map of List
		/*
		 * for (Map<String, String> map : AllData) { for (Map.Entry<String, String>
		 * entry : map.entrySet()) { Object value = entry.getValue();
		 * System.out.format(" %s\n", value); }
		 * 
		 * System.out.print("\n"); }
		 */

		/*
		 * Map<String, String> map = AllData.get(1); for (Map.Entry<String, String>
		 * entry : map.entrySet()) { Object value = entry.getValue();
		 * System.out.format(" %s\n", value); }
		 */

		return AllData;

	}

	public static void main(String[] args) throws Exception {

		String XLFile = "E:\\LEARNING\\SOFTWARE TESTING\\02- TRAINING\\04- AUTOMATED TESTING\\04- HOW TO PERFORM\\02- CODE BASED AUTOMATION\\02 - AUTOMATION TYPES\\1- WEB AUTOMATION\\02 - FRAMEWORKS\\2- CUICUMBER Framework\\2- Tutoriuals\\12- HYBRID FRAMEWORK DESIGN\\TestData.xlsx";

		String SheetName = "Sheet1";

		XLUtil obj = new XLUtil();
		List<Map<String, String>> AllData = new ArrayList<>();

		int numRow = obj.getRowCount(XLFile, SheetName);
		int numCols = obj.getCellCount(XLFile, SheetName, 0);

		String[] ColNames = new String[4];
		String[] ColData = new String[4];
		System.out.println("Number of rows :" + numRow + " and number of cols :" + numCols);

		// For loop for getting all col names
		for (int i = 0; i < numRow; i++) {

			for (int j = 0; j < numCols; j++) {

				if (i == 0) {
					ColNames[j] = obj.getCellData(XLFile, SheetName, i, j);
				}
			}
		}

		// For loop for getting all col values
		for (int i = 0; i < numRow; i++) {

			Map<String, String> map1 = new HashMap<String, String>();

			for (int j = 0; j < numCols; j++) {

				if (i != 0) {
					ColData[j] = obj.getCellData(XLFile, SheetName, i, j);
					map1.put(ColNames[j], ColData[j]);
				}
			}

			AllData.add(map1);
		}

		// For loop to iterate Map of List
		/*
		 * for (Map<String, String> map : AllData) { for (Map.Entry<String, String>
		 * entry : map.entrySet()) { Object value = entry.getValue();
		 * System.out.format(" %s\n", value); }
		 * 
		 * System.out.print("\n"); }
		 */

		Map<String, String> map = AllData.get(1);
		for (Map.Entry<String, String> entry : map.entrySet()) {
			Object value = entry.getValue();
			System.out.format(" %s\n", value);
		}

	}

}

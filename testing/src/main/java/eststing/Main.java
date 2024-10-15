package eststing;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.*;

//public class Main {
//   public static void main(String[] args) {
//	   //Workbook workbook = new XSSFWorkbook();

public class Main {

	private static final String FILE_NAME = "C:\\Users\\aravindhl";

	public static void main(String[] args) {
		// Create Excel workbook and sheet
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Sheet1");

		// Write data to Excel
		writeData(sheet);

		// Write workbook to file
		try (FileOutputStream outputStream = new FileOutputStream(FILE_NAME)) {
			workbook.write(outputStream);
			System.out.println("Data written successfully to Excel file.");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Read data from Excel
		readData(workbook);
	}

	private static void writeData(Sheet sheet) {
		// Sample data
		Object[][] data = { { "Name", "Age", "Location" }, { "John", 25, "New York" }, { "Alice", 30, "Paris" },
				{ "Bob", 28, "London" } };

		// Write data to sheet
		int rowNum = 0;
		for (Object[] rowData : data) {
			Row row = sheet.createRow(rowNum++);
			int colNum = 0;
			for (Object field : rowData) {
				Cell cell = row.createCell(colNum++);
				if (field instanceof String) {
					cell.setCellValue((String) field);
				} else if (field instanceof Integer) {
					cell.setCellValue((Integer) field);
				}
			}
		}
	}

	private static void readData(Workbook workbook) {
	    try {
	        Sheet sheet = workbook.getSheetAt(0);

	        // Read data from sheet
	        for (Row row : sheet) {
	            for (Cell cell : row) {
	                System.out.print(cell + "\t");
	            }
	            System.out.println();
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}

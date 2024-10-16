package Utils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelUtils {

	public static List<String[]> readExcelData(String filePath, String sheetName) {
		List<String[]> data = new ArrayList<>();
		try (FileInputStream fis = new FileInputStream(filePath); Workbook workbook = new XSSFWorkbook(fis)) {
			Sheet sheet = workbook.getSheet(sheetName);
			Iterator<Row> rowIterator = sheet.iterator();
			DataFormatter dataFormatter = new DataFormatter();

			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				String[] rowData = new String[row.getLastCellNum()];
				for (int i = 0; i < row.getLastCellNum(); i++) {
					rowData[i] = dataFormatter.formatCellValue(row.getCell(i));
				}
				data.add(rowData);
			}
		} catch (IOException e) {
			System.err.println("Error reading Excel file: " + e.getMessage());
			e.printStackTrace();
		}
		return data;
	}

}

package eststing;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.*;

public class Read {
	
	 private static final String FILE_NAME = "C:\\Users\\aravindhl\\Desktop\\Input.xlsx";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try (FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
	             Workbook workbook = new XSSFWorkbook(fileInputStream)) {

	            Sheet sheet = workbook.getSheetAt(0);
	            String aravindh = "John";	
	            aravindh.toLowerCase();

	            // Read data from sheet
	            for (Row row : sheet) {
	                for (Cell cell : row) {
	                	if(cell.getStringCellValue().equals(aravindh))
	                    System.out.print(cell + "\t");
	                }
	                System.out.println();
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
		

	}

}

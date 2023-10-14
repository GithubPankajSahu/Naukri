package Utilis;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataFromExcelSheet {

	
	public static String getDataFromExcelSheet(String filePath, String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException {
		
		InputStream file = new FileInputStream(filePath);
		
		Cell cell = WorkbookFactory.create(file).getSheet(sheetName).getRow(rowNum).getCell(cellNum);
		
		String data = "";
		
		try {
			data = cell.getStringCellValue();
		}
		catch(IllegalStateException e) {
			double value = cell.getNumericCellValue();
			data = Double.toString(value);
		}
		catch(NullPointerException e) {
			System.out.println("Blank cell ");
		}
		
		return data;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

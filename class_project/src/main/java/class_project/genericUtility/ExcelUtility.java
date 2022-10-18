package class_project.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String fetchdataFromExcelFile(String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/ManualTestCaseProject.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);
		
		return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).toString();
	}
	
	
	
}

package frameWork;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcelSheet {

	public static void main(String[] args) throws Throwable {

//Apache poi Dependencies need to added
		
		//step1:-path connection
	//	FileInputStream fis = new FileInputStream("C:\\Users\\Shobha\\Downloads\\ExcelData2.xlsx");
		FileInputStream fes = new FileInputStream("./src/test/resources/ExcelData2.xlsx");
		//step2:- ExcelFile in read mode
		Workbook book = WorkbookFactory.create(fes);

		//step3:-getting control on sheet
	    Sheet sheet = book.getSheet("Sheet1");
	
	    //step4:-getting control on rowNum
	    Row row = sheet.getRow(10);
	
	    //step5:-getting control on cellNum
	    Cell cel = row.getCell(3);
	
	    String excelData = cel.getStringCellValue();
	    System.out.println(excelData);
	
	}

}

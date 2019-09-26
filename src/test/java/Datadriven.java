import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("D://Excel//Demodata.xlsx");
    XSSFWorkbook workbook = new XSSFWorkbook(fis);
    int sheets = workbook.getNumberOfSheets();
    for(int i=0;i<sheets;i++)
    {
    	XSSFSheet sheet = workbook.getSheetAt(i);
    }
	}

}

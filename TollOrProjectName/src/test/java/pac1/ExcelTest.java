package pac1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\Gurup\\OneDrive\\Desktop\\dielan\\org.xlsx");
		
		
		Properties po = new Properties();
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("contact");
		
        Row ro=sh.getRow(7);
        
     Cell cll=   ro.getCell(0);
         
     Random ran=new Random();
   int random=  ran.nextInt();
     
     cll.setCellType(CellType.STRING);
     cll.setCellValue("dielan_"+random);
     
       FileOutputStream fos =new FileOutputStream("C:\\Users\\Gurup\\OneDrive\\Desktop\\dielan\\org.xlsx");
        wb.write(fos);
        
        wb.close();
	}
}

package seleniumm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameework {

	
		// TODO Auto-generated method stub

		public void test() throws IOException
		{
			
			WebDriver F = new ChromeDriver();
			F.get("http://www.linkedin.com/");
			F.manage().window().maximize();
			F.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			
			File src=new File("C:\\Shabnam Computer\\Excelfetch\\Book1.xls");//file import
			
			FileInputStream input =new FileInputStream(src);//file loading
			
			HSSFWorkbook workbook = new HSSFWorkbook(input);//if .xls format then HSSF ,if .xlsx format then XSSF//workbook loading
			HSSFSheet sheet = workbook.getSheetAt(0);//sheet loading with the data 
			
			for(int i =1;i<=sheet.getLastRowNum();i++)
			{
				HSSFCell cell = sheet.getRow(i).getCell(1);
				F.findElement(By.id("session_key")).sendKeys(cell.getStringCellValue());
				HSSFCell cell1 = sheet.getRow(i).getCell(2);
				F.findElement(By.id("session_password")).sendKeys(cell1.getStringCellValue());
			}
			
			
			
		}
		
		
		
		
	}



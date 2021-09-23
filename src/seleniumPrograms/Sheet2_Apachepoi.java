package seleniumPrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sheet2_Apachepoi {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		HSSFWorkbook wb=new HSSFWorkbook(new FileInputStream("E:\\Data.xls"));
		HSSFSheet sh=wb.getSheet("Sheet2");
		List<WebElement> ls=driver.findElements(By.tagName("img"));
		for(int i=0;i<ls.size();i++)
		{
			String s=ls.get(i).getAttribute("src");
			sh.createRow(i).createCell(0).setCellValue(s);
			wb.write(new FileOutputStream("E:\\\\Data.xls"));
		}

	}

}

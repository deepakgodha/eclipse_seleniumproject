package seleniumPrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WritingintofileApache {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
//		HSSFWorkbook wb=new HSSFWorkbook(new FileInputStream("E:\\Data.xls"));
//		HSSFSheet sh=wb.getSheet("Sheet1");
//		sh.getRow(1).getCell(1).setCellValue("dummy");
//		sh.getRow(1).createCell(2).setCellValue("Apache");
//		sh.createRow(4).createCell(2).setCellValue("lti");
//		wb.write(new FileOutputStream("E:\\\\Data1.xls"));
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		HSSFWorkbook wb=new HSSFWorkbook(new FileInputStream("E:\\Data.xls"));
		HSSFSheet sh=wb.getSheet("Sheet1");
		for (int i=0;i<4;i++)
		{
			
				String data=sh.getRow(i).getCell(0).toString();
				String pwd=sh.getRow(i).getCell(1).toString();
				driver.findElement(By.id("txtUsername")).sendKeys(data);
				driver.findElement(By.name("txtPassword")).sendKeys(pwd);
				driver.findElement(By.id("btnLogin")).click();
				Thread.sleep(2000);
				
				if(driver.getCurrentUrl().contains("dashboard"))
				{
				sh.getRow(i).createCell(2).setCellValue("Login Successful");
				wb.write(new FileOutputStream("E:\\\\Data1.xls"));
				
				driver.findElement(By.id("welcome")).click();
			    Thread.sleep(3000);
				driver.findElement(By.linkText("Logout")).click();
				Thread.sleep(3000);
				}
				else
				{
					sh.getRow(i).createCell(2).setCellValue("Login Failed");
					wb.write(new FileOutputStream("E:\\\\Data1.xls"));
				}
		}
		//System.out.println(sh.getLastRowNum());
		//sh.getRow(1).getLastCellNum();

	}

}

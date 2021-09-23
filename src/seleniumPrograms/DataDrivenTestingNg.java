package seleniumPrograms;

import org.testng.annotations.Test;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class DataDrivenTestingNg {
	WebDriver driver;
	HSSFSheet sh;
	HSSFWorkbook wb;
	

  @Test(dataProvider = "dp")
  public void Login(String user, String pwd)throws Exception {
//	  driver.get("https://opensource-demo.orangehrmlive.com/");
//	  driver.findElement(By.id("txtUsername")).sendKeys(user);
//	  driver.findElement(By.name("txtPassword")).sendKeys(pwd);
//		driver.findElement(By.id("btnLogin")).click();
//		driver.findElement(By.id("welcome")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Logout")).click();
//		
  }
//  @BeforeTest
//  public void beforeTest()throws Exception {
//	  System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
//	  driver=new ChromeDriver();
////	  wb=new HSSFWorkbook(new FileInputStream("E:\\Data.xls"));
////	 sh=wb.getSheet("Sheet1");
//  }
//
//  @AfterTest
//  public void afterTest()throws Exception {
//	  Thread.sleep(2000);
//	  driver.quit();
//  }

  @DataProvider
  public Object[][] dp() {
	  Excel ex=new Excel("E:\\Data.xls");
	  Object data[][]=new Object[ex.getRowNum("Sheet1")][ex.getColNum("Sheet1")];
	  for(int i=0;i<data.length;i++)
	  {
		  
		
		  
		    String d=ex.getData("Sheet1", i, 0);
			String pwd=ex.getData("Sheet1", i, 1);
			data[i][0]=d;
			data[i][1]=pwd;
			
	  }
	  return data;
    
    
  }
}

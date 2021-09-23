package seleniumPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApachePoi {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		HSSFWorkbook wb=new HSSFWorkbook(new FileInputStream("E:\\Data.xls"));
		HSSFSheet sh=wb.getSheet("Sheet1");
		for (int i=0;i<4;i++)
		{
			
				String data=sh.getRow(i).getCell(0).toString();
				String pwd=sh.getRow(i).getCell(1).toString();
				//try {
				driver.findElement(By.id("txtUsername")).sendKeys(data);
				driver.findElement(By.name("txtPassword")).sendKeys(pwd);
				driver.findElement(By.id("btnLogin")).click();
				Thread.sleep(2000);
				
				if(driver.getCurrentUrl().contains("dashboard"))
				{
				driver.findElement(By.id("welcome")).click();
			    Thread.sleep(3000);
				System.out.println(data+" "+pwd);
				System.out.println("Login successful");
				driver.findElement(By.linkText("Logout")).click();
				Thread.sleep(3000);
				}
				else
				{
					System.out.println(data+" "+pwd);
					System.out.println("Login Failed");
				}
				//}
				//catch(Exception e)
//				{
//					System.out.println(data+" "+pwd);
//					System.out.println("Login Failed");
//		        }
			

			
		}
	
		
		

	}

}

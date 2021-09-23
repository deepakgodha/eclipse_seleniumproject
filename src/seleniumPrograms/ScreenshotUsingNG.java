package seleniumPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ScreenshotUsingNG {
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method");
  }

  @AfterMethod
  public void afterMethod(ITestResult res)throws Exception {
	  System.out.println("After method");
	  if(res.getStatus()==ITestResult.FAILURE)
	  {
		  TakesScreenshot tc=(TakesScreenshot)driver;
		  File src=tc.getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(src,new File(res.getName()+".png"));
	  }
	  
  }

  
	WebDriver driver;
	  @Test(priority=1)
	  public void googleTitleTest() {
		  System.out.println("Test 1");
		  driver.get("http://google.com");
		  String s=driver.getTitle();
		  Assert.assertEquals(s, "Google");
	  }
	  @Test(priority=2)
	  public void googleSearchTest() {
		  System.out.println("Test 2");
		  driver.findElement(By.name("q")).sendKeys("LTI");
		  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		  String g=driver.getTitle();
		  Assert.assertEquals(g, "LTI- Google Search");
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  System.out.println("before test");
	  }

	  @AfterTest
	  public void afterTest()throws Exception {
		  System.out.println("after test");
		  Thread.sleep(2000);
		  driver.close();
		  
	  }

}

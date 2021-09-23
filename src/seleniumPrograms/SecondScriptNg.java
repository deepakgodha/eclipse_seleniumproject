package seleniumPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class SecondScriptNg {
	WebDriver driver;
  @Test(priority=1)
  public void googleTitleTest() {
	  driver.get("http://google.com");
	  String s=driver.getTitle();
	  Assert.assertEquals(s, "Google");
  }
  @Test(priority=2)
  public void googleSearchTest() {
	  driver.findElement(By.name("q")).sendKeys("LTI");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  String g=driver.getTitle();
	  Assert.assertEquals(g, "LTI - Google Search");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
	  driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest()throws Exception {
	  Thread.sleep(2000);
	  driver.quit();
  }

}

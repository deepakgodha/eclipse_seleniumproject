package pageFactory;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PageFactory_Test {
	WebDriver driver;
  @Test
  public void LoginTest() {
	  //WebDriverWait wt=new WebDriverWait(driver,20);
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
	  lp.doLogin("admin", "admin123");
	  
	  Assert.assertEquals(driver.getCurrentUrl().contains("dashboard"), true);
	  driver.findElement(By.id("welcome")).click();
	  //wt.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout123")));
	  driver.findElement(By.linkText("Logout123")).click();
	  
	  
  }
  @BeforeTest
  @Parameters("browser")
  public void beforeTest(String browser) {
	  if(browser.equals("chrome")) {
	  System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  }
	  else if(browser.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
		  driver=new FirefoxDriver();
	  }
	  else
	  {
		  System.out.println("invalid browser");
	  }
  }

  @AfterTest
  public void afterTest()throws Exception {
	  Thread.sleep(2000);
	  driver.quit();
  }
}

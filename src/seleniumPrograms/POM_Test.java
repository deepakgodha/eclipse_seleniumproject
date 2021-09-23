package seleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class POM_Test {
	WebDriver driver;
  @Test(description="checking forget link on home page")
  public void ForgetLinkPage() {
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  LoginPage lp=new LoginPage(driver);
	  lp.clickForget();
	  Assert.assertTrue(driver.getCurrentUrl().contains("requestPasswordResetCode"));
	  
  }
  @Test(dependsOnMethods="ForgetLinkPage" ,description="checking cancel button on forget page")
  public void CancelPage() {
	  ForgetPage fp=new ForgetPage(driver);
	  fp.doCancel();
	  Assert.assertTrue(driver.getCurrentUrl().contains("auth/login"));
  }
  @Test(dependsOnMethods="CancelPage" ,description="checking login credentials")
  public void Login() {
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  LoginPage lp=new LoginPage(driver);
//	  lp.setUserName("admin");
//	  lp.setPwdName("admin123");
//	  lp.clickLogin();
	  lp.doLogin("admin", "admin123");
	  
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

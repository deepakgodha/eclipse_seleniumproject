package keyworddriven;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
  public WebDriver driver;
	@BeforeTest
	  public void beforeTest() throws Exception {
		  System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  
	  }

	  @AfterTest
	  public void afterTest()throws Exception {
		  Thread.sleep(2000);
		  driver.quit();
	  }
}

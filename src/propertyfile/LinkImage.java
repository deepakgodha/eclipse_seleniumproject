package propertyfile;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
//import java.net.URL;
//import java.net.URLConnection;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;

public class LinkImage {
	WebDriver driver;
	Properties prop;
  @Test
  public void LinkImageCheck()throws Exception {
	  driver.get(prop.getProperty("url"));
	  List<WebElement> ls=driver.findElements(By.tagName("a"));
	  for(int i=0;i<ls.size();i++)
	  {
		  String href=ls.get(i).getAttribute("href");
		  URL url=new URL(href);
		  URLConnection con=url.openConnection();
		  HttpURLConnection httpcon=(HttpURLConnection) con;
		  httpcon.connect();
		  int code=httpcon.getResponseCode();
		  if(code==200)
		  {
			  System.out.println(url+" working "+code);
			  
		  }
		  else
		  {
			  System.out.println(url+" not working "+code);
		  }
		  
	  }
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  prop=new Properties();
	  prop.load(new FileInputStream("PropertyFile.property"));

  }

  @AfterTest
  public void afterTest()throws Exception {
	  Thread.sleep(2000);
	  driver.quit();
  }

}

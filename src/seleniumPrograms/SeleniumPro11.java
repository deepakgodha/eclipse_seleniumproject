package seleniumPrograms;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class SeleniumPro11 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.cssSelector("input[value='2']")).click();
		Thread.sleep(2000);
		List<WebElement> ls=driver.findElements(By.name("sex"));
		System.out.println(ls.size());
		ls.get(2).click();
		for(int i=0;i<ls.size();i++)
		{
		     Thread.sleep(2000);
		     ls.get(i).click();
		}
		
		

	}

}

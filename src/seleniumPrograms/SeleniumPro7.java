package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPro7 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://blazedemo.com/");
		WebElement fp=driver.findElement(By.name("fromPort"));
		Select s1=new Select(fp);
		s1.selectByVisibleText("Boston");
		Thread.sleep(3000);
		s1.selectByIndex(6);
		Thread.sleep(3000);
		s1.selectByValue("Portland");
		Thread.sleep(3000);
		driver.quit();
	

	}

}

package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://Bing.com");
		WebElement a=driver.findElement(By.name("q"));
		Actions ac=new Actions(driver);
		Action act=ac.keyDown(Keys.SHIFT)
		.sendKeys(a, "lti")
		.doubleClick(a)
		.contextClick(a)
		.build();
		act.perform();
		
		

	}

}

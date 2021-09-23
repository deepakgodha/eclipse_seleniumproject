package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPro17 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.findElement(By.id("search")).sendKeys("selenium");
		driver.findElement(By.cssSelector("yt-icon[class='style-scope ytd-searchbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("yt-formatted-string[aria-label='What Is Selenium | Selenium Webdriver Basics | Selenium Tutorial | Selenium Training | Edureka by edureka! 1 year ago 21 minutes 94,098 views']")).click();
		Thread.sleep(3000);
		}

}

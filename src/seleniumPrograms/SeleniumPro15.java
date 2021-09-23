package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPro15 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/iframe.html");
		driver.switchTo().frame("Front");
		driver.findElement(By.name("user_name_entry_field")).clear();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.name("q")).sendKeys("admin");
		driver.switchTo().defaultContent();
		WebElement fr=driver.findElement(By.className("dummy"));
		driver.switchTo().frame(fr);
		driver.findElement(By.cssSelector("button[aria-label='Search']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.quit();
		

	}

}

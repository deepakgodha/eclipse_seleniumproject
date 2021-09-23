package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPro6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.frontaccounting.eu/");
		driver.findElement(By.name("user_name_entry_field")).sendKeys("demouser");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("SubmitUser")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		
		Thread.sleep(3000);
		driver.quit();

	}

}

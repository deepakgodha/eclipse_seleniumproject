package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPro9 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input[value='LOGIN']")).click();
		driver.findElement(By.cssSelector("a.panelTrigger")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a#aboutDisplayLink")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[href='/index.php/auth/logout']")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}

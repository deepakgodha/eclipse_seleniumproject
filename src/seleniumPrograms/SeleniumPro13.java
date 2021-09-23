package seleniumPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPro13 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.magneticautomation.in/2019/01/alert-example.html");
		driver.findElement(By.cssSelector("button[onclick='myFunction()']")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.sendKeys("Hello");
		a.accept();
		Thread.sleep(2000);
		

	}

}

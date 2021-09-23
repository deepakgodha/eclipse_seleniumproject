package seleniumPrograms;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPro5 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String s=driver.getCurrentUrl();
		driver.findElement(By.id("txtUsername")).sendKeys("hr");
		driver.findElement(By.name("txtPassword")).sendKeys("hr123");
		//System.out.println(driver.getTitle());
		driver.findElement(By.id("btnLogin")).click();
		//driver.findElement(By.id("welcome")).click();
		String h=driver.getCurrentUrl();
		//Thread.sleep(3000);
		System.out.println(s+" "+h+" "+s.equals(h));
		//driver.findElement(By.id("aboutDisplayLink")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.linkText("Logout")).click();
		//Thread.sleep(3000);
		driver.quit();
		

	}

}

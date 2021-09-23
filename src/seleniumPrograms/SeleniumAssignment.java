package seleniumPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.rediff.com");
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("input.getquoteinput")).sendKeys("yes bank LTD");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.getqbtn")).click();
		Thread.sleep(2000);
		Set<String> id=driver.getWindowHandles();
		List<String> a=new ArrayList<>(id);
		String h=a.get(1);
		driver.switchTo().window(h);
		System.out.println(driver.getTitle());		
		Thread.sleep(2000);
		driver.close();
		
		
		Thread.sleep(2000);
		driver.quit();
		

	}

}

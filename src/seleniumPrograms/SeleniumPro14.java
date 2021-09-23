package seleniumPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPro14 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("FromSector_show")).click();
		driver.findElement(By.id("airport3")).click();
		driver.findElement(By.cssSelector("input[onclick='SearchFlightWithArmy();']")).click();
		Alert ac=driver.switchTo().alert();
		Thread.sleep(4000);
		System.out.println(ac.getText());
		ac.accept();
		//ac.dismiss();
		

	}

}

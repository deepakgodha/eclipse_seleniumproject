package junitprograms;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class BackGroundColorjunit {
	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver=new ChromeDriver();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void test() {
		driver.get("http://blazedemo.com");
		String bgcolor=driver.findElement(By.cssSelector("input[value='Find Flights']")).getCssValue("background-color");
		System.out.println(bgcolor);
		String bgcolorhex=Color.fromString(bgcolor).asHex();
		System.out.println(bgcolorhex);
		assertEquals("#006dcc",bgcolorhex);
		
		
	}

}

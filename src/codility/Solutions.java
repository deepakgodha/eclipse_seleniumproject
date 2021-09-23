package codility;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Solutions extends WebDriverTestCase {

	@Test
	public void test1() throws InterruptedException {
		webDriver.get("https://opensource-demo.orangehrmlive.com/");
		webDriver.findElement(By.id("btnLogin")).click();

		String text=webDriver.findElement(By.id("spanMessage")).getText();
		
		assertEquals("Username cannot be empty",text);
		Thread.sleep(2000);
		
	}
	
	@Test
	public void test2() throws InterruptedException {
		webDriver.findElement(By.id("txtUsername")).sendKeys("Admin");
		webDriver.findElement(By.id("btnLogin")).click();
		
		String text=webDriver.findElement(By.id("spanMessage")).getText();
		
		assertEquals("Password cannot be empty",text);
		Thread.sleep(2000);
		
	}
	@Test
	public void test3() throws InterruptedException {
		
		webDriver.findElement(By.id("txtUsername")).sendKeys("abcde");
		webDriver.findElement(By.id("txtPassword")).sendKeys("efghi");
		webDriver.findElement(By.id("btnLogin")).click();
		
		String text=webDriver.findElement(By.id("spanMessage")).getText();
		
		assertEquals("Invalid credentials",text);
		Thread.sleep(2000);
		
	}
		
		
		
		
	

}

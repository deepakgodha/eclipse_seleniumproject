package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPro10 {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://blazedemo.com/");
		WebElement fp=driver.findElement(By.cssSelector("select[name='fromPort']"));
		Select s1=new Select(fp);
		s1.selectByVisibleText("Boston");
		Thread.sleep(3000);
	    Select s2=new Select(driver.findElement(By.cssSelector("select[name='toPort']")));
	    s2.selectByIndex(1);
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("input[value='Find Flights']")).click();
	    driver.findElement(By.cssSelector("input[type='submit']")).click();
	    driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Deepak jain");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("input[name='address']")).sendKeys("Begum Bazaar");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("input#city")).sendKeys("Hyderabad");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("input#state")).sendKeys("Telangana");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("input[name='zipCode']")).sendKeys("500012");
	    Thread.sleep(3000);
	    Select s3=new Select(driver.findElement(By.cssSelector("select#cardType")));
	    s3.selectByIndex(0);
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("input[name='creditCardNumber']")).sendKeys("123456789012");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("input#creditCardMonth")).clear();
	    driver.findElement(By.cssSelector("input#creditCardMonth")).sendKeys("5");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("input#creditCardYear")).clear();
	    driver.findElement(By.cssSelector("input#creditCardYear")).sendKeys("2012");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("input#nameOnCard")).sendKeys("Deepak Jain");
	    Thread.sleep(1000);
	   WebElement E= driver.findElement(By.cssSelector("label.checkbox"));
	    //driver.findElement(By.cssSelector("input[value='Purchase Flight']")).click();
	    //Thread.sleep(3000);
	   boolean x=E.isDisplayed();
	    boolean y=E.isEnabled();
	    boolean z=E.isSelected();
	    System.out.println(x);
	    System.out.println(y);
	    System.out.println(z);
	    
	    E.click();
	    Thread.sleep(2000);
	    System.out.println(z);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		driver.quit();
	

	}

}

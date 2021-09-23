package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPage {
	WebDriver driver;
	
	public ForgetPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By name=By.name("securityAuthentication[userName]");
	By reset=By.id("btnSearchValues");
	By cancel=By.id("btnCancel");
	
	public void doReset(String name)
	{
		driver.findElement(this.name).sendKeys(name);
		driver.findElement(reset).click();
	}
	public void doCancel()
	{
		driver.findElement(cancel).click();
	}

}

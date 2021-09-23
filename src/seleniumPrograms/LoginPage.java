package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By name=By.name("txtUsername");
	By pwd=By.name("txtPassword");
	By login=By.id("btnLogin");
	By forget=By.linkText("Forgot your password?");
	
	public void setUserName(String user)
	{
		driver.findElement(name).sendKeys(user);
	}
	public void setPwdName(String pass)
	{
		driver.findElement(pwd).sendKeys(pass);
	}
	public void doLogin(String user,String pass)
	{
		setUserName(user);
		setPwdName(pass);
		clickLogin();
		
	}
	public void clickLogin()
	{
		driver.findElement(login).click();
	}
	public void clickForget()
	{
		driver.findElement(forget).click();
	}

}

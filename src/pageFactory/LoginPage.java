package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(name="txtUsername") WebElement name;
	@FindBy(name="txtPassword") WebElement pwd;
	@FindBy(id="btnLogin") WebElement login;
	@FindBy(linkText="Forgot your password?") WebElement forget;
	

	public void setUserName(String user)
	{
		name.sendKeys(user);
	}
	public void setPwdName(String pass)
	{
		pwd.sendKeys(pass);
	}
	public void doLogin(String user,String pass)
	{
		setUserName(user);
		setPwdName(pass);
		clickLogin();
		
	}
	public void clickLogin()
	{
		login.click();
	}
	public void clickForget()
	{
		forget.click();
	}

	

}

package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgetPage {
	@FindBy(name="securityAuthentication[userName]") WebElement name;
	@FindBy(id="btnSearchValues") WebElement reset;
	@FindBy(id="btnCancel") WebElement cancel;
	
	public void doReset(String name)
	{
		this.name.sendKeys(name);
		reset.click();
	}
	public void doCancel()
	{
		cancel.click();
	}

}

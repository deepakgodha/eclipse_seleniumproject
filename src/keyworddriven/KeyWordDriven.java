package keyworddriven;

import java.io.File;
//import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;


public class KeyWordDriven {
	WebDriver driver;
	public KeyWordDriven(WebDriver driver)
	{
		this.driver=driver;
	}
	public void getURL(String url)
	{
		driver.get(url);
	}
	public void doClick(String ltype,String lvalue)
	{
		getElement(ltype,lvalue).click();
	}
	public void getKeys(String ltype,String lvalue,String data)
	{
		getElement(ltype,lvalue).sendKeys(data);
	}
	public void getSnap(String fileName) 
	{
		TakesScreenshot tc=(TakesScreenshot) driver;
		File src=tc.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src, new File(fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public WebElement getElement(String ltype,String lvalue)
	{
		WebElement fp=null;
		if(ltype.equals("id"))
		{
			fp=driver.findElement(By.id(lvalue));
			
		}
		else if(ltype.equals("name"))
		{
			fp=driver.findElement(By.name(lvalue));
				
		}
		else if(ltype.equals("text"))
		{
			fp=driver.findElement(By.linkText(lvalue));
			
		}
		else if(ltype.equals("css"))
		{
			fp=driver.findElement(By.cssSelector(lvalue));
					
		}
		else if(ltype.equals("xpath"))
		{
			fp=driver.findElement(By.xpath(lvalue));
			
		}
		else
		{
			System.out.println("invalid ltype");
		}
		return fp;
		
	}
	public void selectDropDown(String ltype,String lvalue,String data)
	{
		
		Select s1=new Select(getElement(ltype,lvalue));
		s1.selectByValue(data);
	}

}

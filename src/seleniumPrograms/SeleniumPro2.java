package seleniumPrograms;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumPro2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://selenium.dev");
		String d=driver.getTitle();
		System.out.println("You are on "+d+" page");
		Thread.sleep(3000);
		
		driver.quit();

	}

}

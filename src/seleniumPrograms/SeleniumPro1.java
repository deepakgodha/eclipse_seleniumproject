package seleniumPrograms;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPro1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://selenium.dev");
		String s=driver.getTitle();
		System.out.println("You are on "+s+" page");
		Thread.sleep(5000);
		driver.quit();

	}

}

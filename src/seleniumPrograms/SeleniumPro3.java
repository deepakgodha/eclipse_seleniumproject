package seleniumPrograms;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumPro3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		WebDriver driver=null;
		if(a==1)
		{
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(a==2)
		{
			System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		else
		{
			System.out.println("invalid");
		}
		driver.get("http://selenium.dev");
		String s=driver.getTitle();
		System.out.println("you are on "+s+" page");
		Thread.sleep(3000);
		driver.quit();
		
				

		

	}

}

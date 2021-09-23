package seleniumPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPro12 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String a= driver.getWindowHandle();
		System.out.println("parent id is "+a);
		Set<String> id=driver.getWindowHandles();
//		for(String i:id)
//		{
//			//System.out.println(id);
//			if(!i.equals(a))
//			{
//				System.out.println(i);
//				driver.switchTo().window(i);
//				System.out.println(driver.getTitle());
//				Thread.sleep(2000);
//				driver.close();
//				
//				
//			}
//			
//		}
		List<String> allwin=new ArrayList<>(id);
		for(int i=0;i<allwin.size();i++)
		{
			String id1=allwin.get(i);
			if(!id1.equals(a))
				{
					System.out.println(id1);
					driver.switchTo().window(id1);
					System.out.println(driver.getTitle());
					Thread.sleep(2000);
					driver.close();
					
					
				}
			
		}
		Thread.sleep(2000);
		driver.quit();
		

	}

}

package seleniumPrograms;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class SeleniumPro16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		List<WebElement> ls= driver.findElements(By.tagName("a"));
		System.out.println(ls.size());
		for(int i=0;i<ls.size();i++)
		{
			System.out.print(i+1 +" link has href as ");
			System.out.println(ls.get(i).getAttribute("href"));
		}
		

	}

}

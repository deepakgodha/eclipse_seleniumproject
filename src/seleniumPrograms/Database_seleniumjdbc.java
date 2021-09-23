package seleniumPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Database_seleniumjdbc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","hr","hr");
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from Data");
		while(rs.next())//iterate the records one by one!
		{		
			String data=rs.getString(1);
			String pwd=rs.getString(2);
			driver.findElement(By.id("txtUsername")).sendKeys(data);
			driver.findElement(By.name("txtPassword")).sendKeys(pwd);
			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(2000);
			
			if(driver.getCurrentUrl().contains("dashboard"))
			{
			driver.findElement(By.id("welcome")).click();
		    Thread.sleep(3000);
			System.out.println(data+" "+pwd);
			System.out.println("Login successful");
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);
			}
			else
			{
				System.out.println(data+" "+pwd);
				System.out.println("Login Failed");
			}
			
		}
		rs.close();
		con.close();//release DB connection

	}

}

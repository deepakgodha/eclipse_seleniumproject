package keyworddriven;

import org.testng.annotations.Test;

public class Runner extends BaseClass{
  @Test
  public void keyword() {
	  KeyWordDriven key=new KeyWordDriven(driver);
	  key.getURL("http://blazedemo.com");
//	  key.getKeys("name", "email", "879645123");
//	  key.doClick("name", "login");
	  key.selectDropDown("name", "fromPort", "Boston");
	  key.selectDropDown("name", "toPort", "Rome");
	  key.doClick("css", "input[value='Find Flights']");
	  
	  key.getSnap("Drivers/blazedemo.png");
	  
  }
}

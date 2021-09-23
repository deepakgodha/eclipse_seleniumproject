package propertyfile;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;
//using testng

public class Propertyexample {
  @Test
  public void readProperty()throws Exception {
	  Properties prop=new Properties();
	  prop.load(new FileInputStream("PropertyFile.property"));
	  System.out.println(prop.get("url"));
	  System.out.println(prop.get("e_logout"));
	  
	  
	  
  }
}

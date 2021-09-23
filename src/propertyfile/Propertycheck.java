package propertyfile;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertycheck {
//using main class
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		  prop.load(new FileInputStream("PropertyFile.property"));
		  System.out.println(prop.get("url"));
		  System.out.println(prop.get("e_logout"));

	}

}

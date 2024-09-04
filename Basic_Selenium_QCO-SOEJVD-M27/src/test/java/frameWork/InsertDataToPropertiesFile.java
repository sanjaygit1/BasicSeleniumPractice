package frameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InsertDataToPropertiesFile {

	public static void main(String[] args) throws Throwable {

		// step1:-connecting the physical file path to the script
		FileInputStream fis = new FileInputStream("./src/test/resources/Data1.properties");//read mode
		
		
       Properties pro = new Properties();
       pro.setProperty("url", "https://www.saucedemo.com/v1/");
       pro.setProperty("username", "standard_user");
       pro.setProperty("password", "secret_sauce");
       
       
       FileOutputStream fos = new FileOutputStream("./src/test/resources/Data1.properties");//write mode
  	  pro.store(fos, "CommomData");
//	
	}

}

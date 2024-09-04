package frameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataFromProperties_File {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//Normal Approach
		/*
		 * driver.get("https://www.saucedemo.com/v1/");
		 * driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 * driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 * driver.findElement(By.id("login-button")).click();
		 */

		// step1:-connecting the physical file path to the script
	//	FileInputStream fis = new FileInputStream("C:\\Users\\Shobha\\Downloads\\CommonData9.properties");
		FileInputStream fis = new FileInputStream("./src/test/resources/CommonData9.properties");

		// step2:- load all the keys present in properties file
		Properties pro = new Properties();
		pro.load(fis);

		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");

		driver.get(URL);
		driver.findElement(By.id("user-name")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("login-button")).click();
	}

}

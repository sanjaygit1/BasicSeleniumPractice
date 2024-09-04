package AdvanceScenarios;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyBoardStrokesUsingKeysClass {

	public static void main(String[] args) {
		
		//Two Approaches
		//*Keys Class----->Static methods
		//*Robot Class---->Non Static Methods
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");

		//case1:-
//		WebElement UserNAme = driver.findElement(By.name("user-name"));
//		UserNAme.sendKeys("standard_user",Keys.TAB);
//	
//		driver.findElement(By.name("password")).sendKeys("secret_sauce",Keys.ENTER);
	
		//case2:-
	//	driver.findElement(By.name("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
	
		WebElement UserNAme = driver.findElement(By.name("user-name"));
		UserNAme.sendKeys("standard_user",Keys.CONTROL+"a");
		UserNAme.sendKeys(Keys.CONTROL+"c");
	    UserNAme.sendKeys(Keys.TAB,Keys.CONTROL+"v");
}

}

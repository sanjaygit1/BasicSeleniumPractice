package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorEx {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");

		//syntax1:- [AttributeName='AttributeValue']
//	driver.findElement(By.cssSelector("[data-test='username']")).sendKeys("standard_user");
//    driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("secret_sauce");
	
		//syntax2:- htmltag[AttributeName='AttributeValue']
//	  driver.findElement(By.cssSelector("input[type='text']")).sendKeys("standard_user");
	
	   //syntax3:- Applicable  only to id Attribute----->#
	  //     #AttributeValue
	  
	  driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
	
	  //syntax4:-Applicable  only to id Attribute----->#
	  //    htmltag#AttributeValue
	  
	  driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
	
	  //syntax5:- Applicable  only  to className Attribute----->.
	  //     .AttributeValue
	  
	//  driver.findElement(By.cssSelector(".btn_action")).click();
	
	  //syntax6:- Applicable  only  to className Attribute----->.
	  //    htmltag.AttributeValue
	  
	  driver.findElement(By.cssSelector("input.btn_action")).click();
	}
}

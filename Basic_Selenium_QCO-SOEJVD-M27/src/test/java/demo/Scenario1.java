package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("reebok");
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
	
//		String name = driver.findElement(By.cssSelector("[title=\"Men's Sports Shoes\"]")).getText();
//	System.out.println(name);

	}

}

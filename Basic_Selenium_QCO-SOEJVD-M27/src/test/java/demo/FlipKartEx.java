package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartEx {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

		//locator 4:-linkText()
	//	driver.findElement(By.linkText("Grocery")).click();
	
		//locator 5:-partialLinkText()
	//   driver.findElement(By.partialLinkText("Gro")).click();
		
	}
}

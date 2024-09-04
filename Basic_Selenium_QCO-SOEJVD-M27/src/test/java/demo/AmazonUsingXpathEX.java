package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonUsingXpathEX {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		//xpath by attribute
	//	driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("nike");
		
		//xpath by contains attribute
		//htmltag[contains(@AttributeName,'AttributeValue')]
	//	driver.findElement(By.xpath("//input[contains(@placeholder,'S')]")).sendKeys("bluetooth");
	
		//xpath by text()
		//driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]")).click();
		
		//xpath by contains text()
		//htmltag[contains(text(),'AttributeValue')]
		driver.findElement(By.xpath("//a[contains(text(),\"als\")]")).click();
	
	}

}

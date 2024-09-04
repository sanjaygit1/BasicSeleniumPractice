package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment1 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.cssSelector("[type='submit']")).click();
	
		int count=0;
	List<WebElement> names = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
	List<WebElement> phnPrice = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
//	for (WebElement phnName : names) 
//	{
//		System.out.println(phnName.getText());
//		count++;
//	}
//	System.out.println("total num of phones name:"+count);
	
	for (int i = 0; i < names.size(); i++)
	{
		System.out.println(names.get(i).getText()+"----------"+phnPrice.get(i).getText());
	}
	}

}

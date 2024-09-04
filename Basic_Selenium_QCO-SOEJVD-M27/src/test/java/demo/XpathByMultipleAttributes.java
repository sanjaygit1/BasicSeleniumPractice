package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByMultipleAttributes {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
driver.manage().window().maximize();
    //syntax1:- //htmltag[@AttributeName='AttributeValue' and @AttributeName='AttributeValue']		
//	driver.findElement(By.xpath("//input[@type='text' and @name='field-keywords']")).sendKeys("puma");
		
	//syntax2:- //htmltag[@AttributeName='AttributeValue' or @AttributeName='AttributeValue']
//	driver.findElement(By.xpath("//input[@value='Go' or @type='su']")).click();
	
   //syntax3:- //htmltag[@AttributeName='AttributeValue' and text()='AttributeValue']
//	driver.findElement(By.xpath("//a[@class='nav-a  ' and  text()='Sell']")).click();
	
	//syntax4:- //htmltag[text()='AttributeValue' or @AttributeName='AttributeValue']
//	driver.findElement(By.xpath("//a[text()='Mobiles'  or @data-csa-c-slot-id=\"nav_cs_4\"]")).click();
	
   //syntax5:-  //htmltag[contains(@AttributeName,'AttributeValue' and/or text()='AttributeValue']
//	driver.findElement(By.xpath("//a[contains(@data-csa-c-slot-id,'nav_cs_t') or contains(text(),'Elect')]")).click();
	
  //syntax6:-  //htmltag[contains(@AttributeName,'AttributeValue' and/or @AttributeName='AttributeValue']
driver.findElement(By.xpath("//input[contains(@id,'twot') and @name='field-keywords']")).sendKeys("nike");
	}
}

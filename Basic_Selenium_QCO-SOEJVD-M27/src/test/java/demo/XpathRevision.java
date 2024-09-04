package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathRevision {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in");
driver.manage().window().maximize();

//xpath by attribute
//syntax:-   //htmltag[@AttributeNmae='AttributeValue']
//driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_0']")).click();

//xpath by text()   >visibleElement<
//syntax:-    //htmltag[text()='AttributeValue']
//driver.findElement(By.xpath("//span[text()='Movies']")).click();
	
//xpath by contains Attribute()
//syntax:-   //htmltag[contains(@AttributeName,AttributeValue')]
//driver.findElement(By.xpath("//input[contains(@id,'tw')]")).sendKeys("Nike");
	
//xpath by contains Text()
//syntax:- //htmltag[contains(text(),'AttributeValue')]
driver.findElement(By.xpath("//a[contains(text(),\"als\")]")).click();
}
}

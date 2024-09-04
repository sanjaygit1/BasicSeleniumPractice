package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsRevision {

	public static void main(String[] args) {

    WebDriver driver=new ChromeDriver();
  //  driver.get("https://www.amazon.in");
    driver.manage().window().maximize();
    
  //  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("puma");
    
  //   driver.findElement(By.name("field-keywords")).sendKeys("Nike");
	
  //  driver.findElement(By.className("nav-input nav-progressive-attribute")).sendKeys("Reebok");
	
	//linkText and paritalLinkText supports only >Visibletext<
    
  //  driver.findElement(By.linkText("Today's Deals")).click();
    
  //  driver.findElement(By.partialLinkText("Today's")).click();
    
    //cssSelector----->6 syntax
    //syntax1:-  [AttributeName='AttributeValue']
    //syntax2:- htmltag[AttributeName='AttributeValue']
    //syntax3:- #AttributeValue
    //syntax4:- htmltag#AttributeValue
    //syntax5:- .AttributeValue
    //syntax6:- htmltag.AttributeValue
    
   // driver.findElement(By.cssSelector("[id='twotabsearchtextbox']")).sendKeys("Bluetooth");
    
  //  driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("puma");
	
  //  driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Nike");
	
  //    driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Mask");
	
//    driver.get("https://www.saucedemo.com/v1/");
//	driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
//	driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
//	//driver.findElement(By.cssSelector(".btn_action")).click();
//	driver.findElement(By.cssSelector("input.btn_action")).click();
	
    
    //Relative Xpath
    //xpath by Attribute()-----> //htmltag[@AttributeName='AttributeValue']
    //xpath by text()----------> //htmltag[text()='AttributeValue']
    //xpath by contains Attribute()---> //htmltag[contains(@AttributeName,'AttributeValue')]
    //xpath by contains text()---> //htmltag[contains(text(),'AttributeValue')]
    
    driver.get("https://www.flipkart.com");
    
//    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
//    driver.findElement(By.xpath("//button[contains(@title,'Search')]")).click();
    
 //   driver.findElement(By.xpath("//span[text()='Fashion']")).click();
 //   driver.findElement(By.xpath("//span[contains(text(),'Fa')]")).click();
    
    //Traversing
  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
  driver.findElement(By.xpath("//button[contains(@title,'Search')]")).click();
    
//  String price = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Pink, 256 GB)']/../..//div[@class='Nx9bqj _4b5DiR']")).getText();
//  System.out.println(price);
	
	String price = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']/../following-sibling::div[@class='col col-5-12 BfVC2z']//div[@class='Nx9bqj _4b5DiR']")).getText();
	System.out.println(price);
	}

}

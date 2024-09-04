package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		//xpath by Attribute()
		//htmltag[@AttributeName='AttributeVAlue']
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("iphone");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        String name = driver.findElement(By.xpath("//a[@title='18.5 L Backpack Echo Plus']")).getText();
//	    System.out.println(name);
	
        //xpath by text()
        //htmltag[text()='AttributeValue']
	//	driver.findElement(By.xpath("//span[text()='Login']")).click();
	
	String Phnname = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Pink, 128 GB)']")).getText();
	System.out.println(Phnname);
	
	String price = driver.findElement(By.xpath("//div[text()='₹66,699']")).getText();
	System.out.println(price);
	
	
	
	}

}

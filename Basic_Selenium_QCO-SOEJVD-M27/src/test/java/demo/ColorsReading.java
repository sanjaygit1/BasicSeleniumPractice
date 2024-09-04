package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ColorsReading {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=iphone&crid=1AD9IWE5EGP7Z&sprefix=iphone%2Caps%2C220&ref=nb_sb_noss_1");
		Thread.sleep(2000);
		List<WebElement> eles = driver.findElements(By.xpath("(//span[text()='Apple iPhone 13 (128GB) - Starlight'])[3]/../../../..//div[@class='a-section a-spacing-none a-spacing-top-mini s-color-swatch-container-list-view']//a"));
	
		
	   for (WebElement Element : eles) {
		
		  String colors = Element.getAttribute("aria-label");
		  Thread.sleep(2000);
		  System.out.println(colors);
	}
	}

}

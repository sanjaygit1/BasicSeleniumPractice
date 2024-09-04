package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhoneColor {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.amazon.in");

driver.findElement(By.name("field-keywords")).sendKeys("iphone");
driver.findElement(By.xpath("//input[@type='submit']")).click();
	
List<WebElement> colors = driver.findElements(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Starlight']/../../../..//div[@class='a-section a-spacing-none a-spacing-top-mini s-color-swatch-container-list-view']//a"));
	
for (WebElement color : colors)
{
	String eleColor = color.getAttribute("aria-label");
	System.out.println(eleColor);
}
}

}

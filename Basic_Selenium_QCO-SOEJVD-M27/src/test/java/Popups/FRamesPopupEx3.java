package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FRamesPopupEx3 {

	public static void main(String[] args) {
	//frame:--->inners frames
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/frames");

	driver.findElement(By.linkText("Nested Frames")).click();
	
	driver.switchTo().frame("frame-top");
	
	WebElement leftFrame = driver.findElement(By.xpath("//frame[@name='frame-left']"));
	driver.switchTo().frame(leftFrame);
	
	String left = driver.findElement(By.xpath("//body[contains(text(),' LEFT')]")).getText();
	System.out.println(left);
	
	driver.switchTo().parentFrame();
	
	driver.switchTo().frame("frame-middle");
	String middle = driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText();
	System.out.println(middle);
	
//	driver.switchTo().parentFrame();
//	driver.switchTo().parentFrame();
	//or
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame("frame-bottom");
	String bottom = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
	System.out.println(bottom);
	}

}

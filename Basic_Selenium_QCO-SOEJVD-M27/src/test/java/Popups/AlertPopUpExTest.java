package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPopUpExTest {

	@Test
	public void alertPopUpExTest() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

//	 Alert alt = driver.switchTo().alert();
//	 alt.accept();
	//or
//	 driver.switchTo().alert().accept();//accept----->to click ok button in alert
	
//	 String ele = driver.switchTo().alert().getText();//getText()---->to fetch the alert message
//	 System.out.println(ele);
	
//	 driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//	 driver.switchTo().alert().accept();//---->to click ok button
//	 driver.switchTo().alert().dismiss();//---->to click cancel button
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		driver.switchTo().alert().sendKeys("good");//---->to pass the comments in alert
		driver.switchTo().alert().accept();
}
}

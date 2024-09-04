package AdvanceScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBarUsingJavaScriptExecutorEx2 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

//		WebElement ele = driver.findElement(By.xpath("//a[text()=\"Instagram\"]"));
//		Point loc = ele.getLocation();
//	    System.out.println(loc.getX());
//	    System.out.println(loc.getY());
	
//	JavascriptExecutor js = (JavascriptExecutor)driver;
//       js.executeScript("window.scrollBy(392,825)");
//      Thread.sleep(1000);
//      ele.click();
	
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView()",ele);
//	      ele.click();
	    
		driver.get("https://www.amazon.in");
		JavascriptExecutor js = (JavascriptExecutor)driver;
	     js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	     Thread.sleep(1000);
	     js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	}
}

package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDownUsingKeysClass {

	public static void main(String[] args) throws InterruptedException {
	
		//*Handling dropdown Using KeyBorad Strokes----->keys class and Robot class
		//*Handling  dropdown Using Select class
		//*Handling  dropdown Using WebElement

	    WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(1000);
		WebElement dayList = driver.findElement(By.id("day"));
		dayList.click();
		dayList.sendKeys(Keys.ARROW_DOWN);
		dayList.sendKeys(Keys.ARROW_DOWN);
		dayList.sendKeys(Keys.ARROW_DOWN);
		dayList.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		dayList.sendKeys(Keys.ARROW_UP);
		dayList.sendKeys(Keys.ARROW_UP);
	}

}

package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseActions {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://www.amazon.in");
		
//		WebElement ele = driver.findElement(By.linkText("Today's Deals"));
//	    Actions act = new Actions(driver);
//		act.moveToElement(ele).perform();
		
//		WebElement link = driver.findElement(By.linkText("Mobiles"));
//		Actions act = new Actions(driver);
//		act.contextClick(link).perform();
	
//		driver.get("https://www.saucedemo.com/v1/");
//	    WebElement USERNAME = driver.findElement(By.id("user-name"));
//	    WebElement PASSWORD = driver.findElement(By.name("password"));
//	    WebElement login = driver.findElement(By.className("btn_action"));
	
//	    Actions act = new Actions(driver);
//	    act.sendKeys(USERNAME, "standard_user").perform();
//	    act.sendKeys(PASSWORD, "secret_sauce").perform();
//	    act.click(login).perform();
	    
	    //or
//	     act.sendKeys(USERNAME, "standard_user").sendKeys(PASSWORD, "secret_sauce").click(login).build().perform();
	
//	    driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
//	    WebElement drag = driver.findElement(By.id("draggable"));
//	    WebElement drop = driver.findElement(By.id("droppable"));
//	    Actions act = new Actions(driver);

	    //act.clickAndHold(drag).release(drop).perform();
	
//	    act.dragAndDrop(drag, drop).perform();
	
//		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
//		WebElement ele = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
//		 Actions act = new Actions(driver);
//		 act.doubleClick(ele).perform();
		 
		 driver.get("https://www.makemytrip.com");
		 Actions act = new Actions(driver);
		 act.moveByOffset(10, 20).click().perform();
		 
	}

}

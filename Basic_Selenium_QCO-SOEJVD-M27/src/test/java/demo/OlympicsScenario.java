package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OlympicsScenario {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://olympics.com/en/paris-2024/medals");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Yes, I am happy']")).click();

	
	String gold = driver.findElement(By.xpath("//span[text()='Australia']/../following-sibling::span[1]")).getText();
	System.out.println(gold);
	
	String silver = driver.findElement(By.xpath("//span[text()='Australia']/../following-sibling::span[2]")).getText();
	System.out.println(silver);
	
	String bronze = driver.findElement(By.xpath("//span[text()='Australia']/../following-sibling::span[3]")).getText();
	System.out.println(bronze);
	}

}

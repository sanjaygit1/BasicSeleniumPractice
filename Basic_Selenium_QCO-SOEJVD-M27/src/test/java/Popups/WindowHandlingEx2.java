package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingEx2 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		   driver.get("https://demo.automationtesting.in/Windows.html");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
	
	driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();

	String mainId = driver.getWindowHandle();//win1
    System.out.println(mainId);
    
    Set<String> allIds = driver.getWindowHandles();//win1,win2
    System.out.println(allIds);
    
    for (String id : allIds)
    {
		if(!mainId.equals(id))//win1!=Win2
		{
			driver.switchTo().window(id);
			
			driver.findElement(By.linkText("Register now!")).click();
		}}
	}

}

package Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingEx1 {

	public static void main(String[] args) {

		// Two Approaches
		// * Using Windows Ids----->Can handle 2 wins
		// * Using Window Title---->can handle multiple wins

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);

		driver.findElement(By.xpath("//img[@alt=\"Apple iPhone 15 (Black, 128 GB)\"]")).click();

		String mainId = driver.getWindowHandle();//win1
        System.out.println(mainId);
        
        Set<String> allIds = driver.getWindowHandles();//win1,win2
        System.out.println(allIds);
        
        for (String id : allIds)
        {
			if(!mainId.equals(id))//win1!=Win2
			{
				driver.switchTo().window(id);
				String phn = driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (Black, 128 GB)']")).getText();
				System.out.println(phn);
				
			}
		}
   }

}

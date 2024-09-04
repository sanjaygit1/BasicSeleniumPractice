package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmptyBrowser {

	public static void main(String[] args) {
		
		//case1:- Selenium version :-3.141.59
	/*	String key="webdriver.chrome.driver";
		String Value="C:\\Users\\Shobha\\Downloads\\chromedriver-win64 (13)\\chromedriver-win64";
		System.setProperty(key, Value);
		WebDriver driver = new ChromeDriver();*/
	
	
		//case2:-Selenium Version:-3.141.59     WebDriverManager:-5.9.1
	
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver=new FirefoxDriver();
		
	//	WebDriverManager.chromedriver().setup();
	//	WebDriver driver=new ChromeDriver();
        
	//case3:- Selenium version:-4.23.0  webdrivermanager:-5.9.1
		
		//	WebDriverManager.edgedriver().setup();
	   //	WebDriver driver=new EdgeDriver();
	
		//case4:- Selenium version:-4.23.0
		//4.9.1 above versions doesnt requried any Browser Servers
		WebDriver driver=new FirefoxDriver();
	}

}

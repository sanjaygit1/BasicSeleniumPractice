package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		
		//Luanching Browser
		WebDriver driver=new ChromeDriver();
		
		//method1:-get()----->Launching an Application
		driver.get("https://www.flipkart.com/");
		
		//method2:-getTitle()----->Fetches the title of the webpage
	//	String title = driver.getTitle();
    //    System.out.println(title);
	//or
        System.out.println(driver.getTitle());
	
        //method3:-getCurrentUrl----->Fetches the currentUrl of the webpage
        String URL = driver.getCurrentUrl();
	    System.out.println(URL);
	    
	    //method4:-getPageSource()---->Fetches the pagesource of the webpage
	 //   String source = driver.getPageSource();
	 //   System.out.println(source);
	    
	    //method5:-manage()
	 /*   Options opt = driver.manage();
	      Window win = opt.window();
	      win.maximize();*/
	//or
	 driver.manage().window().maximize();
	 
//	 driver.manage().window().minimize();
	 
//	 driver.manage().window().fullscreen();
	 
	 //method6:-close()----->close a single tab/windown driver currently in focus
	 //   driver.close();
	 
	 //method7:-quit()---->closes all the tabs/windowns including the browser
	 driver.quit();
	}

}

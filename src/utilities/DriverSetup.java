package utilities;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DriverSetup {

	

	private static WebDriver driver;
	 public  WebDriver openBrowser(String browser) throws InterruptedException, IOException {
		
		
		
		System.out.println(browser);
		if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Vinay Vaida\\workspace\\Mini Project\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinay Vaida\\workspace\\Mini Project\\Drivers\\chromedriver.exe");
			
			driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Vinay Vaida\\workspace\\Mini Project\\Drivers\\msedgedriver.exe");
			
			driver=new EdgeDriver();
		} else {
			System.out.println("Not a valid browser");
		}
		return driver;
		}

	
}
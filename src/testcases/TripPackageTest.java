package testcases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pages.TripPackageFunctions;
import utilities.AccessProperties;
import utilities.DriverSetup;

public class TripPackageTest {
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		for(int i=1;i<4;i++){
			if(i==1){
				String browser=AccessProperties.getBrowser1();
				String url=AccessProperties.getUrl();
			    DriverSetup d=new DriverSetup();


		        WebDriver driver=d.openBrowser(browser);
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    
			    
				driver.navigate().to(url); //to open the website
				driver.manage().window().maximize();
				//Navigate to home page of the application and click â€œOffersâ€? link.
						driver.findElement(By.xpath("//*[@id=\"themeSnipe\"]/div/div/div[4]/div[2]/div/ul/li[3]/a")).click();
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						TripPackageFunctions tpf = new TripPackageFunctions();
						
						tpf.validateBrowser(driver);
						tpf.validateLogo(driver);
						tpf.Display(driver);
						tpf.takeScreenshot(driver);
						tpf.closeBrowser(driver);
				
			}else if(i==2){
				String browser=AccessProperties.getBrowser2();
				String url=AccessProperties.getUrl();
			    DriverSetup d=new DriverSetup();


			    
		        WebDriver driver=d.openBrowser(browser);
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    
			    
				driver.navigate().to(url); //to open the website
				driver.manage().window().maximize();
				//Navigate to home page of the application and click â€œOffersâ€? link.
						driver.findElement(By.xpath("//*[@id=\"themeSnipe\"]/div/div/div[4]/div[2]/div/ul/li[3]/a")).click();
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						TripPackageFunctions tpf = new TripPackageFunctions();
						
						tpf.validateBrowser(driver);
						tpf.validateLogo(driver);
						tpf.Display(driver);
						tpf.takeScreenshot(driver);
						tpf.closeBrowser(driver);
			}
			else {
				String browser=AccessProperties.getBrowser3();
				String url=AccessProperties.getUrl();
			    DriverSetup d=new DriverSetup();


			   
		        WebDriver driver=d.openBrowser(browser);
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    
			    
				driver.navigate().to(url); //to open the website
				driver.manage().window().maximize();
				//Navigate to home page of the application and click â€œOffersâ€? link.
						driver.findElement(By.xpath("//*[@id=\"themeSnipe\"]/div/div/div[4]/div[2]/div/ul/li[3]/a")).click();
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						TripPackageFunctions tpf = new TripPackageFunctions();
						
						tpf.validateBrowser(driver);
						tpf.validateLogo(driver);
						tpf.Display(driver);
						tpf.takeScreenshot(driver);
						tpf.closeBrowser(driver);
			}
		}
		
		    
		
	    
		
		
		}
		
	

	private static void elseif(int i) {
		// TODO Auto-generated method stub
		
	}
	
}
		
		
	
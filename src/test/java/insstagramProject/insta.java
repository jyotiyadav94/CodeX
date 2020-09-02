package insstagramProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class insta {
		static WebDriver driver;
		
		@Test
		public void a() throws InterruptedException
		{
			
			
		System.setProperty("webdriver.chrome.driver","/Users/jyotiyadav/Desktop/MLprojects/chromedriver");		
		driver = new ChromeDriver();
        String baseUrl = "https://9gag.com/";
        driver.get(baseUrl);
        
//        WebElement a=driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
//		a.click();
//		WebElement username=driver.findElement(By.xpath("//input[@id=\"login-email-name\"]"));
//		username.sendKeys("yjumbo123@gmail.com");
//		WebElement password=driver.findElement(By.xpath("//input[@id=\"login-email-password\"]"));
//		password.sendKeys("-JS$Rx-M!cjnVy7");
		WebElement login=driver.findElement(By.xpath("//input[@class=\"btn left\"]"));
		login.click();
        
        
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1000)");

		List<WebElement> href=driver.findElements(By.xpath("//a[contains(text(),\"points\")]"));
		int c=href.size();
		WebElement href1=driver.findElement(By.xpath("(//a[contains(text(),\"points\")])[1]"));
		String y=href1.getText();
		
	

		
		if(y!="3000")
		{
			Actions actions = new Actions(driver);
			WebElement href2=driver.findElement(By.xpath("(//a[@class=\"badge-evt badge-track\"])[2]"));
		      
				String handle= driver.getWindowHandle();	      
		        System.out.println(handle);
		     	actions.contextClick(href2).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER)
				.build()
				.perform();
		         Set handles = driver.getWindowHandles();
		         for (String handle1 : driver.getWindowHandles()) {
		         System.out.println(handle1);
		         driver.switchTo().window(handle1);
		         
		         WebElement h=driver.findElement(By.xpath(" (//ul[@class=\"btn-vote left\"])[2]"));
		        h.click();
		        Thread.sleep(1000);  
		        WebElement h3=driver.findElement(By.xpath("(//a[contains(text(),'Download')])[1]"));
		        h3.click();
		        Thread.sleep(4000);
		       
		        

		    }
		}
		}
		}

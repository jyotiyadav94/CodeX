package insta;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
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
	public void NineGag() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:/Projects/MarketoApril/Underworld/tartarus/target/classes/drivers/chromedriver/win32/2.44/chromedriver.exe");
		driver = new ChromeDriver();
		String baseUrl = "https://9gag.com/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// xpath Header-first post
		driver.findElement(By.xpath("(//a[@class = \"badge-evt badge-track\"])[1]")).click();
		System.out.println("step1 XXX");

		// parent Window
		Set<String> childWindows = driver.getWindowHandles();
		System.out.println("number of windows: " + childWindows.size());
		// iterating over windows
		Iterator<String> iterateWindows = childWindows.iterator();
		if (iterateWindows.next() == null) {
			System.out.println("EXITING SINCE THE PAGE DIDNT OPEN");
			driver.close();
		}
		String nextWindow = iterateWindows.next();
		driver.switchTo().window(nextWindow);

		// limits on the number of posts to download

		// List to contain text for post
		List<String> contentTextList = new Stack<String>();
		List<Integer> contentPoint = new ArrayList<Integer>();

		// List containing the acceptable tags
		List<String> Avoidtags = new ArrayList<>();
		Avoidtags.addAll(Arrays.asList("NSFW", "Anime & Manga"));
		
		int limit = 2;
		// locator for points
		while(limit>=0){
			//until a post with greater than 1000 upvotes is found keep diggin
			while(getPostPoints()<1000){
				// xpath for next-post button
				driver.findElement(By.xpath("//div[@class = \"post-nav\"]//a")).click();
			}
			//voila! lets begin the download 
			downloadPost();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//div[@class = \"post-nav\"]//a")).click();
			limit--;
		}
		
		contentTextList.add(driver.getTitle());

		System.out.println("XXX Finalized, exiting");
	}

	//Downloads a post and returns the header text
	public String downloadPost() {
		// locator for --- click and download
		driver.findElement(By.xpath("//a[@class = \"more\"]")).click();
		// clicking on 4.Download option from the popup menu
		// Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class = \"popup-menu postpage-share\"]//li)[4]")).click();
		return driver.getTitle();
	}

	// This fucntion returns the points of a post
	public int getPostPoints() {
		// locator for points
		String points = driver.findElement(By.xpath("(//a[@class = \"point badge-evt\"])")).getText();
		System.out.println("XXX Extracting integers. TEXT HERE" + points);

		// Extracting the integers now
		points = points.replaceAll("[^\\d]", "");
		points = points.replaceAll("[,]", "").trim();

		System.out.println("The integral value derived: " + points);
		return Integer.parseInt(points);
	}

	@AfterTest
	public void close() {
		driver.quit();
	}
}

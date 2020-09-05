package instaXgag;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MafiaLogUpstream {
	static WebDriver driver;

	@Test
	public void instaGag() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:/Projects/MarketoApril/Underworld/tartarus/target/classes/drivers/chromedriver/win32/2.44/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com/?hl=en");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		username.sendKeys("a_deadlyman");
		WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		password.sendKeys("Xandie_xox0");

		WebElement submit = driver.findElement(By.xpath("//div[contains(text(),'Log In')]"));
		submit.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement notNow = driver.findElement(By.xpath("//button[contains(text(),'Not Now')]"));
		notNow.click();
		WebElement notNow2 = driver.findElement(By.xpath("//button[contains(text(),'Not Now')]"));
		notNow2.click();

		Actions action = new Actions(driver);
		convertToMobileView();
		
		driver.findElement(By.xpath("//button[@class = \"aOOlW   HoLwm \"]")).click();
		
		

	}

	public void convertToMobileView() throws Exception{
	Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_I);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_I);

		driver.navigate().refresh();
		System.out.println("Phase 1");

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_M);

		System.out.println("Phase 2 MobileView");

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_M);
		
		driver.navigate().refresh();
}
@AfterTest
	public void close() {
		driver.quit();
	}
}

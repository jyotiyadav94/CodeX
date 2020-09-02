package insstagramProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class insta3 {
	@Test
	public void a()
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","/Users/jyotiyadav/Desktop/MLprojects/chromedriver");		
		driver = new ChromeDriver();
        String baseUrl = "https://9gag.com/";
        driver.get(baseUrl);
	}
}

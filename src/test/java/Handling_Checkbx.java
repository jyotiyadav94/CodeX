import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Handling_Checkbx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","/Users/jyotiyadav/Desktop/MME/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		System.out.println("click on family");
//		WebElement a=driver.findElement(By.xpath("//input[@name=\"ctl00$mainContent$chk_friendsandfamily\"]"));
//		a.click();
//		a.isSelected();
		//count the  number of check box
//		Assert.assertFalse(true);
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0-label")).getAttribute("class");
		WebElement a=driver.findElement(By.xpath("//input[@name=\"ctl00$mainContent$rbtnl_Trip\"]"));
		a.click();
		System.out.println(a.isEnabled());
	
		
		System.out.println(driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).size());
		
		
		
		
//		
//		b.click();
//		
//		
//		
//		
//		System.out.println(b.isSelected());
//		
		WebElement c=driver.findElement(By.xpath("(//button[@class=\"ui-datepicker-trigger\"])[1]"));
		c.click();
		
//		System.out.println(c.isSelected());
//		
		WebElement d=driver.findElement(By.xpath("(//*[contains(text(),'31')])[4]"));
		d.click();
//		System.out.println(d.isSelected());
}
}

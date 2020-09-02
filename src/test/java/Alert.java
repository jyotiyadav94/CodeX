import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {

	public static void main(String[] args) {

		String text = "Rahul";
		System.setProperty("webdriver.gecko.driver", "/Users/jyotiyadav/Desktop/MME/geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@name=\"enter-name\"]")).sendKeys(text);
		
		driver.findElement(By.xpath("//input[@value=\"Alert\"]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@value=\"Confirm\"]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();;
		driver.close();

	}

}

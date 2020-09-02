import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicDropdown {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","/Users/jyotiyadav/Desktop/MME/geckodriver");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.nobroker.in/");
		System.out.println(driver.getTitle());
	
		
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		WebElement a=driver.findElement(By.xpath("//input[@class=\"form-control input-home-search\"]"));
		
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", a);
		
		a.sendKeys("Malad");
		System.out.println("******");
		
		
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		WebDriverWait wait = new WebDriverWait(driver, 15);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"prediction-container\"])[1]"))).click();;
		
		a.sendKeys("Malad");
		

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"prediction-container\"])[2]"))).click();;

	}
	
}

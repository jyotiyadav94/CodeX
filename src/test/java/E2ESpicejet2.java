import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class E2ESpicejet2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/jyotiyadav/Desktop/MME/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");

		// destination
		driver.findElement(By.xpath("(//span[@class=\"red-arrow-btn\"])[1]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[@value=\"BLR\"]")).click();

		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.invisibilityOfElementLocated(
				By.xpath("(//span[@class=\\\"red-arrow-btn\\\"])[2]xpath_of_element_to_be_invisible")));
		driver.findElement(By.xpath("//a[@value=\"ATQ\"]")).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement f = driver.findElement(By.xpath("(//a[contains(text(),'31')])[3]"));
		f.click();

		driver.findElement(By.xpath("//*[@name=\"ctl00$mainContent$ddl_Adult\"]")).click();

		Select s = new Select(driver.findElement(By.xpath("//*[@name=\"ctl00$mainContent$DropDownListCurrency\"]")));
		s.selectByValue("INR");

		WebElement h = driver.findElement(By.xpath("(//input[@value=\"Search\"])[1]"));
		h.click();
		
		driver.close();
	}

}

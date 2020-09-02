import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleWebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/jyotiyadav/Desktop/MME/chromedriver");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		WebElement table = driver.findElement(By.xpath("//table[@id=\"customers\"]"));
                List<WebElement> rowsList = table.findElements(By.tagName("tr"));

                List<WebElement> columnsList = null;

               for (WebElement row : rowsList) {
                       System.out.println();
                       columnsList = row.findElements(By.tagName("td"));

                        for (WebElement column : columnsList) {
                               System.out.print(column.getText() + ", ");
                       }

           }
  }
}		
		
		


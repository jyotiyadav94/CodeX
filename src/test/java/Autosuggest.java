import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/jyotiyadav/Desktop/MME/chromedriver");
		WebDriver driver =new ChromeDriver();
//		driver.get("https://www.spicejet.com/");
		
		driver.get("https://www.makemytrip.com");
		System.out.println(driver.getTitle());
		
//		driver.findElement(By.xpath("(//span[@class=\"red-arrow-btn\"])[1]")).click();

//		driver.findElement(By.xpath("(//input[@class=\"fsw_inputField font30 lineHeight36 latoBlack\"])[1]")).clear();
		driver.findElement(By.xpath("(//input[@class=\"fsw_inputField font30 lineHeight36 latoBlack\"])[1]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		driver.findElement(By.xpath("(//div[@class=\"makeFlex hrtlCenter\"])[2]")).click();
		
	}

}

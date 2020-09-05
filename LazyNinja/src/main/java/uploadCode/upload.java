package uploadCode;

import org.testng.annotations.BeforeMethod;

public class upload {
	
	@BeforeMethod
	public void setup()
	{
	System.setProperty("webdriver.chrome.driver","/Users/jyotiyadav/Desktop/MLprojects/chromedriver");
	
	}
}

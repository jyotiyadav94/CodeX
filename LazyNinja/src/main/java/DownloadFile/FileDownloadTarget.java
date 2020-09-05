package DownloadFile;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class FileDownloadTarget {
	WebDriver driver;
	File folder;
	@BeforeMethod
	public void setup()
	{
		folder=new File(UUID.randomUUID().toString());
		folder.mkdir();
		//chrome
		System.setProperty("webdriver.chrome.driver","/Users/jyotiyadav/Desktop/MLprojects/chromedriver");		
		ChromeOptions options=new ChromeOptions();
		Map<String,Object> pref=new HashMap<String,Object>();
		pref.put("profile.default_content_settings.popups", 0);
		pref.put("download.default_directory",folder.getAbsolutePath());
		options.setExperimentalOption("prefs", pref);
		DesiredCapabilities cap= DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		driver=new ChromeDriver(cap);
	}
	@Test
	public void downloadFile() throws InterruptedException
	{
		driver.get("https://the-internet.herokuapp.com/download");
		driver.findElement(By.linkText("some-file.txt")).click();
		Thread.sleep(2000);
		File listoffiles[]=folder.listFiles();
		Assert.assertTrue(listoffiles.length>0);
		for(File file:listoffiles) {
//			Assert.assertEquals(file.length(), is(not((long)0)));
			Assert.assertTrue(listoffiles.length>0);
		}
	}
		@AfterMethod
		public void teardown()
		{
		driver.quit();
		for(File file:folder.listFiles())
		{
			file.delete();
		}
		folder.delete();
		}
	}
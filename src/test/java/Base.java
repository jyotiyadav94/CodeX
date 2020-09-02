//
//import java.io.File;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.TouchAction;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
//import io.appium.java_client.remote.MobileCapabilityType;
//
//public class Base {
//
//	public static AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException {
//
//		AndroidDriver<AndroidElement> driver;
//
//		File appDir = new File("/Users/jyotiyadav/Desktop/MME");
//		File APP = new File(appDir, "original.apk");
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Android");
//		capabilities.setCapability("automationName", "UiAutomator2");
//		capabilities.setCapability(MobileCapabilityType.VERSION, "10.0");
//		
//		if(device.equals("emulator"))
//		{
//		capabilities.setCapability("deviceName", "Copy_of_Pixel_3_29");
//		}
//		
//		else if(device.equals("real"))
//		{
//		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Copy_of_Pixel_3_29");
//		
//		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
//		}
//		capabilities.setCapability("platformName", "Android");
//		capabilities.setCapability(MobileCapabilityType.APP, APP.getAbsolutePath());
//		capabilities.setCapability("newCommandTimeout", 3000);
//		capabilities.setCapability("noReset", true);
//		capabilities.setCapability("autoGrantPermissions", "true");
//		   capabilities.setCapability("appPackage", "com.nobroker.app");
//		   capabilities.setCapability("appActivity","com.nobroker.app.activities.NBSplashScreen");
//
//		
//		
////		  driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
////	    return driver;
//	}
//
//}
//
//
//	
//

package instaXgag;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Base.TestBase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MafiaLogUpstream extends TestBase {
	static WebDriver driver;

	@Test
	public void instaGag() throws Exception {		
		
		type("username_XPATH", "a_deadlyman");
		type("password_XPATH", "Xandie_xox0");
		click("submit_XPATH");
		click("notNow_XPATH");
		click("notNow2_XPATH");

		action();
		convertToMobileView();
//		click("cancel_XPATH");
	}

	public void convertToMobileView() throws Exception{
	Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_I);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_I);

		reload();
		System.out.println("Phase 1");

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_M);

		System.out.println("Phase 2 MobileView");

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_M);
		
		reload();
}
}

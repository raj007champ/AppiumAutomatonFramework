package hybridApps;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AttHybridApp {

		public static void main(String[] args) throws MalformedURLException, InterruptedException {
			 DesiredCapabilities cap =new DesiredCapabilities();
			 cap.setCapability(MobileCapabilityType.DEVICE_NAME, "pixel");
			 cap.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
			 cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.att.myWirelessTest");
			cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.att.myWireless.activities.SplashScreenActivity");	
			//cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "net.one97.paytm");
			//cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "net.one97.paytm.AJRJarvisSplash");
			AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		    driver.getDeviceTime();	
		    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			System.out.println(driver.getContext());
		    driver.findElementById("com.att.myWirelessTest:id/acceptButton").click();
		    driver.findElementById("com.att.myWirelessTest:id/whats_new_nav_next").click();
		    driver.findElementById("com.att.myWirelessTest:id/whats_new_search_next").click();
		    driver.findElementById("com.att.myWirelessTest:id/whats_new_got_it").click();
		    driver.findElementById("com.att.myWirelessTest:id/wirelessNumField").sendKeys("testuatrx7933665205");
		    driver.findElementById("com.att.myWirelessTest:id/passwordField").sendKeys("d0n0tshar3");
		    driver.hideKeyboard();
			System.out.println(driver.getContext());

		    driver.findElementById("com.att.myWirelessTest:id/loginBtn").click();
			System.out.println(driver.getContext());

			driver.findElementById("com.att.myWirelessTest:id/right_nav_menu").click();
			driver.findElementByAndroidUIAutomator("text(\"Billing & payments\")").click();
			driver.findElementByAndroidUIAutomator("text(\"Make a payment\")").click();
			System.out.println(driver.getContext());
			Thread.sleep(20000);
			System.out.println(driver.getContext());
			System.out.println(driver.getContextHandles().size());
			
			/*driver.context("WEBVIEW_chrome");
		    driver.getContext();
			driver.context("WEBVIEW_com.att.myWirelessTest");
			driver.getContext();
			System.out.println(driver.findElement(By.xpath("//*[@id=\"myForm\"]/div/div/div/div/div/div/div/div/div/div[3]/div/div/section/div[44]/div/div[2]/p/span/text()")).getText());
	           */
		}

}

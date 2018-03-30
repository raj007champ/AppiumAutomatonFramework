package basics;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidGestures {

	public static void main(String[] args) throws MalformedURLException {
		
		File fs=new File("src/ApiDemos-debug.apk");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ZY22268V6C");
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		TouchAction act=new TouchAction(driver);
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
      //  driver.findElementByAndroidUIAutomator("content-desc(\"9\")").click();
		driver.findElementByXPath("//*[@content-desc='9']").click();
		act.press(driver.findElementByXPath("//*[@content-desc='15']")).waitAction(2000).moveTo(driver.findElementByXPath("//*[@content-desc='45']")).release().perform();
		
	}

}
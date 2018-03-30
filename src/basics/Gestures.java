package basics;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Gestures {

	public static void main(String[] args) throws MalformedURLException {
		File fs =new File("src/ApiDemos-debug.apk");
		DesiredCapabilities cap =new DesiredCapabilities();
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		 cap.setCapability(MobileCapabilityType.DEVICE_NAME,"ZY22268V6C");
		cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
		
		
		
         AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
       //  driver.findElementByXPath("//android.widget.TextView[@text='App']").click();
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         
 
         driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        
		//Tap Gestures
         //	For tab we need to use TouchAction class
         
         TouchAction tapaction=new TouchAction(driver);
         
         tapaction.tap(driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")")).perform();
         
       driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
       
     //  (new TouchAction((PerformsTouchActions)) driver).press(driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"))).waitAction(Duration.ofSeconds(3)).release().perform();
      
      // tapaction.press(driver.findElementByAndroidUIAutomator("text(\"People Names\")")).waitAction(3000).release().perform();
       
       new TouchAction((PerformsTouchActions) driver).press(driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"))).waitAction(3000).release().perform();
      
       // tapaction.press(driver.findElementByXPath("//android.widget.TextView[@text='People Names']")).waitAction(Duration.ofSeconds(3)).release().perform();
      
      // driver.findElementByXPath("//*[@text='Dog Names']").click();
       System.out.println(driver.findElementByAndroidUIAutomator("text(\"Sample action\")").getText());

         
         
		
		

	}

}

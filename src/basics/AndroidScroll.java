package basics;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidScroll {

	public static void main(String[] args) throws MalformedURLException {
		File fs=new File("src/ApiDemos-debug.apk");
		DesiredCapabilities cap=new DesiredCapabilities();
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME,"ZY22268V6C");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"pixel");

        cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
        
        
       AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

       driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
     
      // driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))");
       
	}

}

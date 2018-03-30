package basics;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidUIAutomator extends base {

	public static void main(String[] args) throws MalformedURLException {
		
		 
		     File f =new File("src/ApiDemos-debug.apk");
		     DesiredCapabilities cap =new DesiredCapabilities();
		     cap.setCapability(MobileCapabilityType.DEVICE_NAME,"ZY22268V6C");
		     cap.setCapability(MobileCapabilityType.APP, f.getAbsolutePath());
		     AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		   // File fis=new File(f,"ApiDemos-debug.apk");
          //  AndroidDriver<AndroidElement> driver = capabilities();
		     
            driver.findElementByAndroidUIAutomator("text(\"Graphics\")").click();
            System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
            System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().checkable(true)").size());
	
	}
	

}

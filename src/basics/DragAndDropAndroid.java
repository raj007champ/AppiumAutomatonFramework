package basics;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class DragAndDropAndroid {
public static void main(String[] args) throws MalformedURLException {
		
		File fs=new File("src/ApiDemos-debug.apk");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ZY22268V6C");
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		TouchAction t=new TouchAction(driver);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		t.longPress(driver.findElementById("io.appium.android.apis:id/drag_dot_1")).moveTo(driver.findElementById("io.appium.android.apis:id/drag_dot_3")).release().perform();
        System.out.println("Done");
		


}
}

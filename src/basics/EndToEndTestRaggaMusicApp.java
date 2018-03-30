package basics;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Point;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class EndToEndTestRaggaMusicApp {

	public static void main(String[] args) throws MalformedURLException {
		File fs=new File("src/Ragga.apk");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel2:5554");
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.getDeviceTime();
		
		TouchAction t=new TouchAction(driver);
		
		
		driver.findElementByXPath("//android.widget.TextView[@text='Done']").click();
	    
		driver.findElementById("com.raaga.android:id/landing_skip_to_raaga").click();
	    
		driver.findElementByXPath("//android.widget.TextView[@text='World Music']").click();
	    
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(resourceId(\"com.raaga.android:id/music_home_raaga_live\"));");
	    
		driver.findElementById("com.raaga.android:id/music_home_raaga_live").click();
	    
		driver.findElementById("com.raaga.android:id/toolbar_logo").click();
	    
		driver.findElementByXPath("//android.widget.TextView[@text='Settings']").click();
	    
		driver.findElementByXPath("//android.widget.TextView[@text='Push Notification']").click();
	    
		
	  Point point= driver.findElementById("com.raaga.android:id/toggle_notifyrecommend").getLocation();
	
	//toggle on
	 t.tap(point.x+20, point.y+30).perform();
	 //toggle off
	 t.tap(point.x+100, point.y+30).perform();
	 
	 //Previous//appium version older- scrollTo()

	}

}

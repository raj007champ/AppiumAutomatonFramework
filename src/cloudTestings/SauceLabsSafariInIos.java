package cloudTestings;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;

public class SauceLabsSafariInIos {

	public static void main(String[] args) throws Throwable {
		
		
		DesiredCapabilities cap=new DesiredCapabilities().iphone();
		cap.setCapability("appiumVersion", "1.5.3");
		cap.setCapability("browserName", "Safari");
		//cap.setCapability("deviceName", "iPhone 7");
		cap.setCapability("platformVersion","8.1");
		cap.setCapability("platformName", "iOS");
		cap.setCapability("deviceName", "iPhone 6");
		
		//IOSDriver driver=new IOSDriver(new URL("http://rahul1:e950d779-1817-4c3c-b122-06715b814dfd@ondemand.saucelabs.com:80/wd/hub"),dc);
		IOSDriver driver=new IOSDriver<>(new URL("http://raj007kiet:a0c7bf7b-a9c2-41ac-a0d7-904266d79091@ondemand.saucelabs.com:80/wd/hub"),cap);
		driver.get("https://www.offcampusjobs4u.com");
		driver.findElementById("hitArea").click(); 
	}

}

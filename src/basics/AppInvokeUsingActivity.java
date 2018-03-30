package basics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class AppInvokeUsingActivity {

	public static void main(String[] args) throws Throwable {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ZY22268V6C");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "net.one97.paytm");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "net.one97.paytm.AJRJarvisSplash");
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);


	}

}

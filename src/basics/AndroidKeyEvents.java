package basics;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidKeyEvents {

	public static void main(String[] args) throws MalformedURLException {
		File fs=new File("src/ApiDemos-debug.apk");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ZY22268V6C");
		cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap );
		System.out.println(driver.getContext());
		System.out.println(driver.getDeviceTime());
		System.out.println(driver.getPlatformName());
		System.out.println(driver.isKeyboardShown());
		System.out.println(driver.getOrientation());
		System.out.println(driver.getSessionId());
		//driver.hideKeyboard();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.pressKeyCode(AndroidKeyCode.BACK);
		driver.pressKeyCode(AndroidKeyCode.HOME);
		
		driver.closeApp();
	}

}

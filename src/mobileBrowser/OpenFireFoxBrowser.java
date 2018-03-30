package mobileBrowser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

//Firexfox Browser Automation is not possible on Android using Appium

public class OpenFireFoxBrowser {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "FF");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel");
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.quora.com");
		driver.findElementByXPath("//a[@href='https://www.quora.com/login']").click();
		driver.findElementByXPath("//input[@name='email']").sendKeys("support@offcampusjobs4u.com");
		driver.findElementByXPath("//input[@name='password']").sendKeys("smaviya");
		driver.findElement(By.xpath("//*[@id=\"navigation_button\"]")).click();
		//*[@id="__w2_hrohAcF_email"]
		}

	}

